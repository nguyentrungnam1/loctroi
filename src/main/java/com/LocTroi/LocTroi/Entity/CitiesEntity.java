package com.LocTroi.LocTroi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CitiesEntity extends BaseEntity{
    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
