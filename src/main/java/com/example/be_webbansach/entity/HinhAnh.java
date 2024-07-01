package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HinhAnh {
    private int id;
    private String tenHinhAnh;
    private boolean laIcon;
    private String link;
    private String dulieuAnh;
    private Sach sach;
}
