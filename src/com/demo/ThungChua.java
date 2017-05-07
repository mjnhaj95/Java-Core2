
package com.demo;

/**
 *
 * @author Minh Hải
 */
public class ThungChua <T extends SinhVien>{
    // Trong class thung chua T coi nhu 1 class 
    // Cu the class gi thi chua biet, khi ng ta truyen vao ms biet
    
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public static void main(String[] args) {
        ThungChua<SinhVien> thungChuaSv = new ThungChua<>();
        ThungChua<SinhVienNamNhat> ThungChuaString = new ThungChua<SinhVienNamNhat>();
        
    }
}
