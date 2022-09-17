package com.sof.dbadapter;


import com.sof.domain.Medecin;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class MedecinServiceImpl {

    @Autowired
    MedecinRepository medecinRepository;

    MedecinAdapter medecinAdapter;

    public Medecin getMedecinById(Long id) {
      final Medecin medecin = medecinAdapter.fromAdapterToDomain(medecinRepository.findById(id).get());
       return medecin;
    }
}
