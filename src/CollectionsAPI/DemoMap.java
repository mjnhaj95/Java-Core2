
package CollectionsAPI;

import com.demo.SinhVien;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Minh Hải
 */
public class DemoMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        
        map.put("key", "Value");
        map.put(56, "Value");
        map.put(55, "Value");
        map.put(5.5, "Value");
        
        Map<String, SinhVien> mapSV = new HashMap<String, SinhVien>();
        mapSV.put("001", new SinhVien("abc abc", "001", 0));
        mapSV.put("002", new SinhVien("abc abc", "002", 0));
        mapSV.put("003", new SinhVien("abc abc", "003", 0));
        
        System.out.println(mapSV.get("002"));
        
        System.out.println("**********************");
        
        Set<String> dsKey = mapSV.keySet();
        for (String key : dsKey) {
            System.out.println(mapSV.get(key));
        }
        
        System.out.println("^^^^^^^^^^^^^^^^^");
        Set<Map.Entry<String, SinhVien>> entrySet = mapSV.entrySet();
        
        for(Map.Entry<String, SinhVien> entry : entrySet){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        
    }
}
