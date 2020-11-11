package com.LocTroi.LocTroi.SeviceImp;

import com.LocTroi.LocTroi.DAO.OrderFarmerDAO;
import com.LocTroi.LocTroi.DAO.SaleManDAO;
import com.LocTroi.LocTroi.DAO.UserAgencyDAO;
import com.LocTroi.LocTroi.DAO.UserDAO;
import com.LocTroi.LocTroi.DTO.OrderFarmerDTO;
import com.LocTroi.LocTroi.DTO.SaleManDTO;
import com.LocTroi.LocTroi.DTO.UserAgencyDTO;
import com.LocTroi.LocTroi.DTO.UserDTO;
import com.LocTroi.LocTroi.Entity.OrderFarmerEntity;
import com.LocTroi.LocTroi.Response.OrderFarmerResponse;
import com.LocTroi.LocTroi.Sevice.OrderFarmerService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class OrderFarmerServiceImp implements OrderFarmerService {
    @Autowired
    OrderFarmerDAO orderFarmerDAO;
    @Autowired
    UserDAO userDAO;
    @Autowired
    SaleManDAO saleManDAO;
    @Autowired
    UserAgencyDAO userAgencyDAO;
    @Override
    // truyền int page
    public JSONObject findByCreate(long creatStart, long creatFinish , long district_id , long city_id,int page) {
        try{
                int size= 10;
                int begin = (page -1)*size;

            //int total=0;

            Date dateStart = new Date(creatStart);
            Date dateFinish = new Date(creatFinish);
            int total = orderFarmerDAO.countTotal( dateStart, dateFinish , district_id,city_id);
            //orderFarmerDAO.findByCreateDate(creatStart , creatFinish);
            List<OrderFarmerDTO> listDto = orderFarmerDAO.findByCreateDate(dateStart , dateFinish,district_id,city_id,begin,size);
            List<OrderFarmerResponse> listResponse = new ArrayList<>();
            for(OrderFarmerDTO dto : listDto){
                String dailytiepnhan = "";
                String sale = "";
                if(dto.getOrder_type() ==1){
                    UserDTO userDTO1 = userDAO.findById(dto.getOrder_man_id());
                    if(userDTO1 !=null ){
                        sale = userDTO1.getFirst_name();
                        dailytiepnhan = userDTO1.getFirst_name();
                    }



                }else if(dto.getOrder_type()== 2) {
                    SaleManDTO saleManDTO = saleManDAO.findByIdSaleMan(dto.getOrder_man_id());
                    if (saleManDTO != null) {
                        sale = saleManDTO.getSale_name();
                    }
                    UserDTO userDTO = userDAO.findById(dto.getUser_id());
                    if(userDTO !=null){
                        dailytiepnhan = userDTO.getFirst_name();
                    }

                }else if (dto.getOrder_type() == 3 ){
                    UserAgencyDTO userAgencyDTO = userAgencyDAO.findByIdUserAngency(dto.getUser_agency_id());
                    if(userAgencyDTO != null ){
                        sale = userAgencyDTO.getFirst_name();
                        dailytiepnhan = userAgencyDTO.getFirst_name();
                    }

                }
                OrderFarmerResponse orderFarmerResponse = new OrderFarmerResponse(dto, dailytiepnhan, sale);
                listResponse.add(orderFarmerResponse);

            }
            JSONObject data = new JSONObject();
            data.put("total", total);//
            data.put("size", size);
            data.put("result",listResponse);
            return data;
        }catch (Exception e) {

        }
        return null;
    }
}
