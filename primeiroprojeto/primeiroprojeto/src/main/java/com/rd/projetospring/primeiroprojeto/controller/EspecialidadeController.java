package com.rd.projetospring.primeiroprojeto.controller;

import com.rd.projetospring.primeiroprojeto.entity.EspMedEntity;
import com.rd.projetospring.primeiroprojeto.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EspecialidadeController {

    @Autowired
    EspecialidadeService service;

    @GetMapping("/especialidades")
    public ResponseEntity getEspecialidades() {
        List<EspMedEntity> especialidades = service.getEspecialidades();
        return ResponseEntity.status(HttpStatus.OK).body(especialidades);
    }
}