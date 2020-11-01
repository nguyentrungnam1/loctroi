package com.LocTroi.LocTroi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SaleManEntity extends BaseEntity{
    @Column
    private String sale_name;

    public String getSale_name() {
        return sale_name;
    }

    public void setSale_name(String sale_name) {
        this.sale_name = sale_name;
    }
}
