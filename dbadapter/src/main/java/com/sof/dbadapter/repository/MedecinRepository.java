package com.sof.dbadapter.repository;

import com.sof.dbadapter.entities.MedecinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface MedecinRepository extends JpaRepository<MedecinEntity, Long> {

    @Query("select case when (count(*) = 0) then true else false end from MedecinEntity m JOIN m.meetings rdv " +
            "where m=:medecin and rdv.date=:jour and rdv.heure=:heure")
    boolean isMedecinAvailable(@Param("medecin") MedecinEntity medecin, @Param("jour") LocalDate jour, @Param("heure") LocalTime heure);

}
