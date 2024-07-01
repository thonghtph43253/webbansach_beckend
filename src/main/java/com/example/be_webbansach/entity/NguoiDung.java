package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NguoiDung {
    private int id;
    private String tenDangNhap;
    private String matKhau;
    private String ho;
    private String ten;
    private char gioiTinh;
    private String email;
    private String soDienThoai;
    private String diaChiMuaHang;
    private String diaChiGiaoHang;
    List<DanhGia> danhSachDanhGia;
    List<SachYeuThich> danhSachSachYeuThich;
    private List<Quyen> danhSachQuyen;
    private List<DonHang> danhSachDonHang;



}
