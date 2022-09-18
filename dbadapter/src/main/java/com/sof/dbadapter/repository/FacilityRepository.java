package com.sof.dbadapter.repository;

import com.sof.dbadapter.entities.StructureHospitaliereEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<StructureHospitaliereEntity, Long> {


}
