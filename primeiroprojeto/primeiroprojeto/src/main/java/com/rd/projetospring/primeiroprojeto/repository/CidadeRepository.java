package com.rd.projetospring.primeiroprojeto.repository;

import com.rd.projetospring.primeiroprojeto.entity.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;
import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeEntity, BigInteger> {

    List<CidadeEntity> findByDsCidade(String dsCidade);
}
