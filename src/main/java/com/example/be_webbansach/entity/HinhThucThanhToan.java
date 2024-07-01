package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HinhThucThanhToan {
    private int id;
    private String tenHinhThucThanhToan;
    private String moTa;
    private double phiThanhToan;
    private List<DonHang> danhSachDonHang;
}
