package com.LocTroi.LocTroi.Repository;

import com.LocTroi.LocTroi.Entity.CitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends JpaRepository<CitiesEntity , Long > {
    @Query(value = "select * from cities where id = ?1 " , nativeQuery = true)
    CitiesEntity findByIdCities(long id);
}
