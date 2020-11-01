package com.LocTroi.LocTroi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserAgencyEntity extends BaseEntity{
    @Column
    private String first_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
