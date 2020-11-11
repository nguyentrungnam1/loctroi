package com.LocTroi.LocTroi.Repository;

import com.LocTroi.LocTroi.Entity.OrderFarmerEntity;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderFarmerRepository extends JpaRepository<OrderFarmerEntity , Long> {

    @Query(value = " select o.* " +
            " from order_farmer  o " +
            " where  o.create_date >= ?1 " +
            " and o.create_date <= ?2 "+
            "and (o.district_id = ?3 OR ?3 = 0)"+
            "and (o.city_id = ?4 OR ?4 = 0 )"
            +"limit ?5,?6"
            ,
            nativeQuery = true)


    List<OrderFarmerEntity> findByCreateDate(Date startDate , Date finishDate , long district_id ,long  city_id,int begin,int size);

    @Query(value = " select count(*) " +
            " from order_farmer  o " +
            " where  o.create_date >= ?1 " +
            " and o.create_date <= ?2 "+
            "and (o.district_id = ?3 OR ?3 = 0)"+
            "and (o.city_id = ?4 OR ?4 = 0 )"
            ,
            nativeQuery = true)
int countTotal(Date startDate , Date finishDate , long district_id ,long  city_id);

}
