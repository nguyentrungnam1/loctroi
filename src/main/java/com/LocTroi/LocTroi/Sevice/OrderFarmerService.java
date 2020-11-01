package com.LocTroi.LocTroi.Sevice;

import com.LocTroi.LocTroi.Entity.OrderFarmerEntity;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public interface OrderFarmerService {
    JSONObject findByCreate(long creatStart , long creatFinish, long district_id , long city_id);
}
