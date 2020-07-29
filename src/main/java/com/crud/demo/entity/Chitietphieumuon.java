package com.crud.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Chitietphieumuon implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PhieumuonSachId phieumuonSachId;

    @ManyToOne
    @MapsId("sachId")
    @JoinColumn(name = "sach_id")
    private  Sach sach;

    @ManyToOne
    @MapsId("phieumuonId")
    @JoinColumn(name = "phieumuon_id")
    private Phieumuon phieumuon;

    @Column
    private Date ngaytra;

    @Column
    private int soluong;

    @Column
    private double denbu;

}
