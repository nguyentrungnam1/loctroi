package com.LocTroi.LocTroi.Repository;

import com.LocTroi.LocTroi.Entity.UserAgencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAgencyRepository extends JpaRepository<UserAgencyEntity , Long> {
    @Query(value = "select * from  user_agency where  id =?1" , nativeQuery = true)
    UserAgencyEntity findByIdUserAngency(long id);
}
