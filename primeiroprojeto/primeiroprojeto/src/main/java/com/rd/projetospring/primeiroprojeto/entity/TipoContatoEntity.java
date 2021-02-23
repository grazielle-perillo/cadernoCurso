package com.rd.projetospring.primeiroprojeto.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "TB_TIPO_CONTATO")
@Data
public class TipoContatoEntity implements Serializable {

    @Id
    @Column(name = "ID_TIPO_CONTATO")
    private BigInteger idTipoContato;

    @Column(name = "DS_TIPO_CONTATO")
    private String dsTipoContato;
}
