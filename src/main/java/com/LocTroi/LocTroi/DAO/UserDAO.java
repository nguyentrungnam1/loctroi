package com.LocTroi.LocTroi.DAO;

import com.LocTroi.LocTroi.DTO.UserDTO;
import com.LocTroi.LocTroi.Entity.UserEntity;
import com.LocTroi.LocTroi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDAO {
    @Autowired
    UserRepository userRepository;

    public UserDTO findById(long id){
        try {

            UserEntity userEntity = userRepository.findById(id);
            if(userEntity != null) {
                UserDTO userDTO = new UserDTO();
                userDTO.setId(userEntity.getId());
                userDTO.setFirst_name(userEntity.getFirst_name());
                return userDTO;
            }

        }
        catch (Exception e ){

        }
        return null;
    }
}
