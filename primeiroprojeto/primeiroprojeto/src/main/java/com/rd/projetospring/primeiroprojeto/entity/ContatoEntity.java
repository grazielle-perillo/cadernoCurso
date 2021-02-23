package com.rd.projetospring.primeiroprojeto.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_CONTATO")
@Data
public class ContatoEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONTATO")
    private BigInteger idContato;

    @Column(name = "ID_USUARIO")
    private BigInteger idUsuario;

    @Column(name = "ID_LOJA")
    private BigInteger idLoja;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_CONTATO")
    private TipoContatoEntity tipoContato;

    @Column(name = "NR_DDI")
    private String nrDdi;

    @Column(name = "NR_DDD")
    private String nrDdd;

    @Column(name = "NR_RAMAL")
    private String nrCep;

    @Column(name = "DS_CONTATO")
    private String dsContato;
}
