package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HinhThucGiaoHang {
    private int id;
    private String tenHinhThucGiaoHang;
    private String moTa;
    private double phiVanChuyen;
    private List<DonHang> danhSachDonHang;
}
