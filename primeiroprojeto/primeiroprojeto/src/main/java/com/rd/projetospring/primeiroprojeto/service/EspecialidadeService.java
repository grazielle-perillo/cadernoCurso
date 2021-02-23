package com.rd.projetospring.primeiroprojeto.service;

import com.rd.projetospring.primeiroprojeto.entity.*;
import com.rd.projetospring.primeiroprojeto.repository.EspecialidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EspecialidadeService {

    @Autowired
    private EspecialidadeRepository espMedRepository;

    public List<EspMedEntity> getEspecialidades(){

        return espMedRepository.findAll();
    }
}
