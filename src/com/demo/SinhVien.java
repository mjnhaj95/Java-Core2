
package com.demo;

/**
 *
 * @author Minh Hải
 */
public class SinhVien {
    private String ten;
    private String ma;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String ten, String ma, int tuoi) {
        this.ten = ten;
        this.ma = ma;
        this.tuoi = tuoi;
    }

    
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", ma=" + ma + ", tuoi=" + tuoi + '}';
    }
    
    
}
