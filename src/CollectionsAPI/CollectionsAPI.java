
package CollectionsAPI;

import com.demo.SinhVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Hải
 */
public class CollectionsAPI {
    public static void main(String[] args) {
        List list = new ArrayList(); 
//        list.add("fff");

            for (int i = 0; i < 10; i++) {
                SinhVien sv = new SinhVien("Nguyen van a" + i, "00" + i, i + 10);
                list.add(sv);
                list.add(sv);
            }
            for (int i = 0; i < list.size(); i++) {
            Object get = list.get(i);
                if (get instanceof SinhVien) {
                    SinhVien sv = (SinhVien) get;
                    System.out.println(sv);
                }
            }
            System.out.println("************************");
            for (Object get : list) {
             if (get instanceof SinhVien) {
                    SinhVien sv = (SinhVien) get;
                    System.out.println(sv);
                }
        }
    }
}
