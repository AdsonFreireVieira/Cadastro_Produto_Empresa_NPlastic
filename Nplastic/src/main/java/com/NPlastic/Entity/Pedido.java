package com.NPlastic.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="tbl_Pedido")
public class Pedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Integer Id;

    @Column
    private LocalDate data;

    @Column
    private String status;

    @OneToMany(mappedBy = "pedido",cascade = CascadeType.ALL)
    private List<Itens_Pedido> itens;

}
