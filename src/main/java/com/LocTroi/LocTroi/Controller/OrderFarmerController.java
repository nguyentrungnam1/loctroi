package com.LocTroi.LocTroi.Controller;

import com.LocTroi.LocTroi.Sevice.OrderFarmerService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/OrderFarmer")


public class OrderFarmerController {
    @Autowired
    OrderFarmerService orderFarmerService;
    @GetMapping("/get_order_farmer")
    public JSONObject getOrderFarmer(@RequestParam("creatStart") long creatStart
            , @RequestParam("creatFinish")long creatFinsih , @RequestParam("district_id") long district_id
            , @RequestParam("city_id") long city_id,@RequestParam("page")int page) {
        return orderFarmerService.findByCreate(creatStart,creatFinsih, district_id,city_id,page);

    }
}
