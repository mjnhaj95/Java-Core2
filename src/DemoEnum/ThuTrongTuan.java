
package DemoEnum;

/**
 *
 * @author Minh Hải
 */
public enum ThuTrongTuan {
    ThuHai(1,"Thu Hai","Mon"), ThuBa(2,"Thu Ba","Tue"), ThuTu(3,"Thu Ba","Web"), ThuNam(4,"Thu Nam","Thur");
    
     private int ma;
     private String lbViet;
     private String lbAnh;

    private ThuTrongTuan(int ma, String lbViet, String lbAnh) {
        System.out.println("aaaaaa +" + ma);
        this.ma = ma;
        this.lbViet = lbViet;
        this.lbAnh = lbAnh;
    }

     
     
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLbViet() {
        return lbViet;
    }

    public void setLbViet(String lbViet) {
        this.lbViet = lbViet;
    }

    public String getLbAnh() {
        return lbAnh;
    }

    public void setLbAnh(String lbAnh) {
        this.lbAnh = lbAnh;
    }
     
     
     
}
