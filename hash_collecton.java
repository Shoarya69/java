// import java.util.HashMap;
import java.util.*;
public class hash_collecton {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"Shoarya");
        map.put(2,"bansal");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.values());
        System.out.println(map.containsValue("Shoarya"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.entrySet());
        map.remove(1);
        System.out.println(map);
        map.clear();

    }
}
