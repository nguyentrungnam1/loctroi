package com.LocTroi.LocTroi.Repository;

import com.LocTroi.LocTroi.Entity.SaleManEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleManRepository extends JpaRepository<SaleManEntity , Long> {
    @Query(value = "select * from sale_man e where e.id=?1", nativeQuery = true )
    SaleManEntity findByIdSaleMan(long id);

}
