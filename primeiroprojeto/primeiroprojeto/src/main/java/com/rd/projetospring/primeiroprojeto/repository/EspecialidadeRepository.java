package com.rd.projetospring.primeiroprojeto.repository;

import com.rd.projetospring.primeiroprojeto.entity.EspMedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigInteger;

public interface EspecialidadeRepository extends JpaRepository<EspMedEntity, BigInteger> {
}