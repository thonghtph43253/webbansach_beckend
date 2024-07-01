package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietDonHang {
    private long id;
    private Sach sach;
    private int soLuong;
    private double giaBan;
    private DonHang donHang;
}
