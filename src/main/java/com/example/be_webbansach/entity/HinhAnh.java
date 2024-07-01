package com.example.be_webbansach.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hinhanh")
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_hinh_anh")
    private int id;
    @Column(name = "ten_hinh_anh")
    private String tenHinhAnh;
    @Column(name = "la_icon")
    private boolean laIcon;
    @Column(name = "link")
    private String link;
    @Column(name = "du_lieu_anh")
    @Lob
    private String duLieuAnh;
    @ManyToOne(cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH})
    @JoinColumn(name = "id_sach", nullable = false)
    private Sach sach;
}
