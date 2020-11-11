package com.LocTroi.LocTroi.Response;

import com.LocTroi.LocTroi.DTO.OrderFarmerDTO;
import com.LocTroi.LocTroi.DTO.SaleManDTO;
import com.LocTroi.LocTroi.DTO.UserDTO;

import java.util.Date;

public class OrderFarmerResponse {
    private  long id;
    private String order_code;
    private String fullname;
    private Long status;
    private Double total_money_pay;
    private Double total_money_book;
    private Date create_date;
    private String first_name;
    private String sale_name;



    public OrderFarmerResponse(){

    }
    //TRuyền DTO OrderFarmerDTO
    //Chuyển DTO Sang Response
//ok
    public OrderFarmerResponse(OrderFarmerDTO orderFarmerDTO , String dailytiepnhan , String sale_name) {
        if(orderFarmerDTO != null ) {
            this.id = orderFarmerDTO.getId();
            this.order_code = orderFarmerDTO.getOrder_code();
            this.fullname = orderFarmerDTO.getFullname();
            this.status = orderFarmerDTO.getStatus();
            this.total_money_pay = orderFarmerDTO.getTotal_money_pay();
            this.total_money_book = orderFarmerDTO.getTotal_money_book();
            this.create_date = orderFarmerDTO.getCreate_date();
        }
        if(dailytiepnhan !=null) {
            this.first_name = dailytiepnhan;
        }
        if(sale_name !=null) {
            this.sale_name = sale_name;
        }

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSale_name() {
        return sale_name;
    }

    public void setSale_name(String sale_name) {
        this.sale_name = sale_name;
    }
}
