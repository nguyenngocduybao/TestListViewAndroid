package com.example.nndb.model;

import java.io.Serializable;

public class DanhBaDTO implements Serializable {
    private int ma;
    private String Ten;
    private  String Phone;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public DanhBaDTO(int i, String test1, String s) {
        setMa(i);
        setPhone(s);
        setTen(test1);
    }
}
