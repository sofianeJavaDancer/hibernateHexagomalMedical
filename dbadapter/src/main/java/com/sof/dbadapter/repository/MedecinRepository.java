package com.sof.dbadapter.repository;

import com.sof.dbadapter.entities.MedecinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<MedecinEntity, Long> {
}
