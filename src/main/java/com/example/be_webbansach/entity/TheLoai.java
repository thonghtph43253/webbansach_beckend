package com.example.be_webbansach.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "theloai")

public class TheLoai {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_the_loai")
    private  int id;
    @Column(name = "ten_the_loai")
    private String tenTheLoai;
    @ManyToMany(fetch = FetchType.LAZY, cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH
    })
    @JoinTable(
            name = "sach_theloai",
            joinColumns = @JoinColumn(name = "id_the_loai"),
            inverseJoinColumns = @JoinColumn(name = "id_sach")
    )
    private List<Sach> danhSachSach;
}
