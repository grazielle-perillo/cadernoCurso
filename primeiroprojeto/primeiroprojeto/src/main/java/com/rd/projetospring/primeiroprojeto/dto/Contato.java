package com.rd.projetospring.primeiroprojeto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
public class Contato {

    private BigInteger idContato;
    private BigInteger idUsuario;
    private BigInteger idLoja;
    private TipoContato tipoContato;
    private String nrDdi;
    private String nrDdd;
    private String nrCep;
    private String dsContato;
}
