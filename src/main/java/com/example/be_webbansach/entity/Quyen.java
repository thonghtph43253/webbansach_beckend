package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quyen {
    private long id;
    private String tenQuyen;
    List<NguoiDung> danhSachNguoiDung;
}
