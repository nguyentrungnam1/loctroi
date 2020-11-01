package com.LocTroi.LocTroi.DTO;

import com.LocTroi.LocTroi.Entity.SaleManEntity;

public class SaleManDTO {
    private long id;
    private String sale_name;

    public SaleManDTO(){

    }
    public SaleManDTO(SaleManEntity saleManEntity) {
        this.id = saleManEntity.getId();
        this.sale_name = saleManEntity.getSale_name();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSale_name() {
        return sale_name;
    }

    public void setSale_name(String sale_name) {
        this.sale_name = sale_name;
    }
}
