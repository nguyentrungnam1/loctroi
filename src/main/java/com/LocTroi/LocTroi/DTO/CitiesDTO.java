package com.LocTroi.LocTroi.DTO;

import com.LocTroi.LocTroi.Entity.CitiesEntity;

public class CitiesDTO {
    private long id;
    private String name;

    public CitiesDTO(){

    }

    public CitiesDTO(CitiesEntity citiesEntity) {
        this.id = citiesEntity.getId();
        this.name = citiesEntity.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
