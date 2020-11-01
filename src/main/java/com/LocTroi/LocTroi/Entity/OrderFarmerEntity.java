package com.LocTroi.LocTroi.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity

public class OrderFarmerEntity extends BaseEntity{
    @Column
    private String order_code;
    @Column
    private String fullname;
    @Column
    private Long status;
    @Column
    private Double total_money_pay;
    @Column
    private Double total_money_book;
    @Column
    private Date create_date;
    @Column
    private long order_type;
    @Column
    private long order_man_id;
    @Column
    private long user_id;
    @Column
    private long city_id;
    @Column
    private long district_id;
    @Column
    private long user_agency_id;

    public long getUser_agency_id() {
        return user_agency_id;
    }

    public void setUser_agency_id(long user_agency_id) {
        this.user_agency_id = user_agency_id;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Double getTotal_money_pay() {
        return total_money_pay;
    }

    public void setTotal_money_pay(Double total_money_pay) {
        this.total_money_pay = total_money_pay;
    }

    public Double getTotal_money_book() {
        return total_money_book;
    }

    public void setTotal_money_book(Double total_money_book) {
        this.total_money_book = total_money_book;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public long getOrder_type() {
        return order_type;
    }

    public void setOrder_type(long order_type) {
        this.order_type = order_type;
    }

    public long getOrder_man_id() {
        return order_man_id;
    }

    public void setOrder_man_id(long order_man_id) {
        this.order_man_id = order_man_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public long getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(long district_id) {
        this.district_id = district_id;
    }
}
