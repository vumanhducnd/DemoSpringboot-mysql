package com.crud.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data

public class Sach implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tensach;
    private String nhaxuatban;
    private Date namxuatban;
    private int soluong;

    @ManyToOne
    @JoinColumn(name = "Theloai_Id")
    private Theloai theloai;

//    @OneToMany(mappedBy = "sach")
//    private List<Phieumuon> phieumuons;
}
