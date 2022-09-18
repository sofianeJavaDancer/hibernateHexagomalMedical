package com.sof.dbadapter.repository;

import com.sof.dbadapter.entities.RendezVousEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends JpaRepository<RendezVousEntity, Long> {



}
