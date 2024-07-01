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
@Table(name = "nguoidung")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_nguoi_dung")
    private int id;
    @Column(name = "tendangnhap")
    private String tenDangNhap;
    @Column(name = "matkhau")
    private String matKhau;
    @Column(name = "ho")
    private String ho;
    @Column(name = "ten")
    private String ten;
    @Column(name = "gioitinh")
    private char gioiTinh;
    @Column(name = "email")
    private String email;
    @Column(name = "sodienthoai")
    private String soDienThoai;
    @Column(name = "diachimuahang")
    private String diaChiMuaHang;
    @Column(name = "diachigiaohang")
    private String diaChiGiaoHang;

    @OneToMany(mappedBy = "nguoiDung", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH

    })
    private List<DanhGia> danhSachDanhGia;
    @OneToMany(mappedBy = "nguoiDung", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH

    })
    private List<SachYeuThich> danhSachSachYeuThich;
    @ManyToMany(fetch = FetchType.LAZY, cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH
    })
    @JoinTable(
            name = "nguoidung_quyen",
            joinColumns = @JoinColumn(name = "id_nguoi_dung"),
            inverseJoinColumns = @JoinColumn(name = "id_quyen")
    )
    private List<Quyen> danhSachQuyen;
    @OneToMany(mappedBy = "nguoiDung", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH

    })
    private List<DonHang> danhSachDonHang;



}
