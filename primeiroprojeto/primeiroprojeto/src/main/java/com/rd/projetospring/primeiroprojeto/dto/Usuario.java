package com.rd.projetospring.primeiroprojeto.dto;


import com.rd.projetospring.primeiroprojeto.entity.UfEntity;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario{


    private Long idUsuario;

    private Uf uf;

    private EspMed IdEspMed;

    private Preco preco;

    private String nome;

    private String nrCpf;

    private Date dtNascimento;

    private String nrCrm;

    private List<Endereco> enderecos;

    private List<Contato> contatos;
}
