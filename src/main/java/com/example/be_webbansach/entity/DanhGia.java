package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DanhGia {
    private long id;
    private Sach sach;
    private float diemDanhGia;
    private String binhLuan;
    private NguoiDung nguoiDung;
}
