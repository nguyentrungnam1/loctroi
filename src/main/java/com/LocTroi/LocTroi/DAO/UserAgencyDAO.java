package com.LocTroi.LocTroi.DAO;

import com.LocTroi.LocTroi.DTO.UserAgencyDTO;
import com.LocTroi.LocTroi.Entity.UserAgencyEntity;
import com.LocTroi.LocTroi.Repository.UserAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserAgencyDAO {
    @Autowired
    UserAgencyRepository userAgencyRepository;

    public UserAgencyDTO findByIdUserAngency(long id){
        try {
            UserAgencyEntity userAgencyEntity =  userAgencyRepository.findByIdUserAngency(id);
            UserAgencyDTO userAgencyDTO = new UserAgencyDTO();
            if(userAgencyEntity !=null){
                userAgencyDTO.setId(userAgencyEntity.getId());
                userAgencyDTO.setFirst_name(userAgencyEntity.getFirst_name());
            }

            return userAgencyDTO;
        }
        catch (Exception e ){

        }
        return null;

    }
}
