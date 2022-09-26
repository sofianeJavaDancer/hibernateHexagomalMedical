package com.sof.dbadapter.repository;

import com.sof.dbadapter.entities.MedicalFacilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalFacilityRepository extends JpaRepository<MedicalFacilityEntity, Long> {


}
