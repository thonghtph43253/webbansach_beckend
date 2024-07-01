package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TheLoai {
    private  int id;
    private String tenTheLoai;
    private List<Sach> danhSachSach;
}
