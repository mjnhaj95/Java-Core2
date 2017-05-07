package CollectionsAPI;

import com.demo.SinhVien;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Minh Hải
 */
public class DemoSet {
    public static void main(String[] args) { 
        Set set = new HashSet();
         for (int i = 0; i < 10; i++) {
                SinhVien sv = new SinhVien("Nguyen van a" + i, "00" + i, i + 10);
                set.add(sv);
                set.add(sv);
                set.add(sv);
                set.add(sv);
        }
         
        Iterator it = set.iterator();
        System.out.println("iiiiiiiiiiiiiiiiiiiii");
        while(it.hasNext()){
            Object object = it.next();
            if (object instanceof SinhVien) {
                SinhVien sv = (SinhVien) object;
                System.out.println(sv);
            }
        }
        
         System.out.println("iiiiiiiiiiiiiiiiiiiii");
         for (Object object : set) {
            if (object instanceof SinhVien) {
                    SinhVien sv = (SinhVien) object;
                    System.out.println(sv);
            }
        }
         
         
    }
}
