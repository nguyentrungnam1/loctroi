package com.LocTroi.LocTroi.DAO;


import com.LocTroi.LocTroi.DTO.OrderFarmerDTO;
import com.LocTroi.LocTroi.Entity.OrderFarmerEntity;
import com.LocTroi.LocTroi.Repository.OrderFarmerRepository;
import com.LocTroi.LocTroi.Repository.SaleManRepository;
import com.LocTroi.LocTroi.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderFarmerDAO {
  // dto entity
    @Autowired
    OrderFarmerRepository orderFarmerRepository;


    public List<OrderFarmerDTO> findByCreateDate(Date startDate , Date finishDate, long district_id , long city_id){
        try {
            List<OrderFarmerDTO> listDto = new ArrayList<>();
            List<OrderFarmerEntity> listEntity = orderFarmerRepository.findByCreateDate(startDate,finishDate,district_id,city_id);
            for(OrderFarmerEntity enti : listEntity){
                OrderFarmerDTO orderFarmerDTO = new OrderFarmerDTO(enti);
                listDto.add(orderFarmerDTO);
            }
            return listDto;
        } catch(Exception e) {
            //show loi
        }
        return new ArrayList<>();

    }
}
