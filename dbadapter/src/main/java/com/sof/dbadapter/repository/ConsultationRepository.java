package com.sof.dbadapter.repository;


import com.sof.dbadapter.entities.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends JpaRepository<ConsultationEntity, Long> {


}
