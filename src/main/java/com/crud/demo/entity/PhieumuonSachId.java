package com.crud.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhieumuonSachId implements Serializable {
    @Column(name = "Sach_id")
    private Long sachId;

    @Column(name = "phieumuon_id")
    private Long phieumuonId;
}
