package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sach {
    private Integer id;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private String moTa;
    private Double giaNiemYet;
    private Double giaBan;
    private Integer soLuong;
    private Double trungBinhDanhGia;

    List<TheLoai> danhSachTheLoai;
    List<HinhAnh> danhSachHinhAnh;
    List<DanhGia> danhSachDanhGia;
    List<ChiTietDonHang> danhSachChiTietDonHang;

    List<SachYeuThich> danhSachSachYeuThich;
}
