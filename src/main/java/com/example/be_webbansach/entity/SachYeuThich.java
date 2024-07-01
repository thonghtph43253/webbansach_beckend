package com.example.be_webbansach.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SachYeuThich {
    private long id;
    private Sach sach;
    private NguoiDung nguoiDung;
}
