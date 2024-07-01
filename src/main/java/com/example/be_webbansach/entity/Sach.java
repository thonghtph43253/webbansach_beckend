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
@Table(name = "sach")
public class Sach {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sach")
    private Integer id;
    @Column(name = "ten_sach")
    private String tenSach;
    @Column(name = "tac_gia")
    private String tacGia;
    @Column(name = "nha_xuat_ban")
    private String nhaXuatBan;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "gia_niem_yet")
    private Double giaNiemYet;
    @Column(name = "gia_ban")
    private Double giaBan;
    @Column(name = "so_luong")
    private Integer soLuong;
    @Column(name = "trung_binh_danh_gia")
    private Double trungBinhDanhGia;

    @ManyToMany(fetch = FetchType.LAZY, cascade ={
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH
    })
    @JoinTable(
            name = "sach_theloai",
            joinColumns = @JoinColumn(name = "id_sach"),
            inverseJoinColumns = @JoinColumn(name = "id_theloai")
    )
    List<TheLoai> danhSachTheLoai;
    @OneToMany(mappedBy = "sach",
        fetch = FetchType.LAZY,
            cascade ={
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH,
                    CascadeType.REMOVE}
    )
    List<HinhAnh> danhSachHinhAnh;
    @OneToMany(mappedBy = "sach",
            fetch = FetchType.LAZY,
            cascade ={
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH,
                    CascadeType.REMOVE}
    )
    List<DanhGia> danhSachDanhGia;
    @OneToMany(mappedBy = "sach",
            fetch = FetchType.LAZY,
            cascade ={
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH}
    )
    List<ChiTietDonHang> danhSachChiTietDonHang;
    @OneToMany(mappedBy = "sach",
            fetch = FetchType.LAZY,
            cascade ={
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH,
                    CascadeType.REMOVE}
    )
    List<SachYeuThich> danhSachSachYeuThich;
}
