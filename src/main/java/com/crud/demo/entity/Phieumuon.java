package com.crud.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Phieumuon implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date ngaymuon;
    private Date ngayhentra;

    @ManyToOne
    @JoinColumn(name = "Thuthu_Id")
    private Thuthu thuthu;
    @ManyToOne
    @JoinColumn(name = "Docgia_Id")
    private Docgia docgia;

//    @OneToMany(mappedBy = "phieumuon")
//    private List<Sach> saches;


}
