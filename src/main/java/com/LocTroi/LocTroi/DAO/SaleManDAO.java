package com.LocTroi.LocTroi.DAO;

import com.LocTroi.LocTroi.DTO.SaleManDTO;
import com.LocTroi.LocTroi.Entity.SaleManEntity;
import com.LocTroi.LocTroi.Repository.SaleManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class SaleManDAO {
    @Autowired
    SaleManRepository saleManRepository;
    public SaleManDTO findByIdSaleMan(long id){
        try {
            SaleManEntity saleManEntities = saleManRepository.findByIdSaleMan(id);
            SaleManDTO saleManDTO = new SaleManDTO();
            if(saleManEntities !=null){
                saleManDTO.setId(saleManEntities.getId());
                saleManDTO.setSale_name(saleManEntities.getSale_name());
            }


            return saleManDTO;
        }
        catch(Exception e) {

        }
        return null;
    }

}
