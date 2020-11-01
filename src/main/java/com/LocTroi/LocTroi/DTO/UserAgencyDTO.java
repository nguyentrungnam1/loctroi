package com.LocTroi.LocTroi.DTO;

import com.LocTroi.LocTroi.Entity.UserAgencyEntity;

public class UserAgencyDTO {
    private long id;
    private String first_name;

    public UserAgencyDTO(){

    }

    public UserAgencyDTO(UserAgencyEntity userAgencyEntity) {
        this.id = userAgencyEntity.getId();
        this.first_name = userAgencyEntity.getFirst_name();
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
