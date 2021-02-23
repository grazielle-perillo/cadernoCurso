package com.rd.projetospring.primeiroprojeto.entity;


import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "TB_ENDERECO")
@Data
public class EnderecoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private BigInteger idEndereco;

    @Column(name = "ID_CIDADE")
    private BigInteger idCidade;

    @Column(name = "DS_COMPLEMENTO")
    private String dsComplemento;

    @Column(name = "DS_ENDERECO")
    private String dsEndereco;

    @Column(name = "DS_BAIRRO")
    private String dsBairro;

    @Column(name = "NR_CEP")
    private String nrCep;
}