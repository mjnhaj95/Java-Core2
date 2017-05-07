package CollectionsAPI;

import com.demo.SinhVien;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author Minh Hải
 */
public class DemoGeneric {
    
    public static void main(String[] args) {
        
        List<SinhVien> list = new Vector<SinhVien>();
        
        list.add(new SinhVien("Nguyen Van A", "002", 11));
        list.add(new SinhVien("Nguyen Van A", "002", 11));
        list.add(new SinhVien("Nguyen Van A", "002", 11));
        
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
        System.out.println("set sinh vien");
        Set<SinhVien> setSV = new HashSet<SinhVien>();
        
        setSV.add(new SinhVien("Nguyen Van A", "002", 11));
        setSV.add(new SinhVien("Nguyen Van A", "002", 11));
        setSV.add(new SinhVien("Nguyen Van A", "002", 11));
        
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
        System.out.println("set Sinh Vien");
        Set<String> set = new HashSet<>();
        set.add("sssss");
        set.add("sssss");
        set.add("sssss");
        set.add("sssss");
        set.add("sssss");
        set.add("sssss");
        
        for (String string : set) {
            System.out.println(string);
        }
    }
}
