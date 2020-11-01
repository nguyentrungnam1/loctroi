package com.LocTroi.LocTroi.DTO;

import com.LocTroi.LocTroi.Entity.UserEntity;

public class UserDTO {
    private long id;
    private String first_name;


    public UserDTO(){

    }
    public UserDTO(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.first_name = userEntity.getFirst_name();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
