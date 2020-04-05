import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hiếu", 25);
        hashMap.put("Hiền", 28);
        hashMap.put("Hòa", 29);
        hashMap.put("Hậu", 22);
        System.out.print("Hiển thị các mục trong HashMap: ");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.print("Hiển thị các mục theo thứ tự tăng dần của khóa: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hiếu", 25);
        linkedHashMap.put("Hiền", 28);
        linkedHashMap.put("Hòa", 29);
        linkedHashMap.put("Hậu", 22);
        System.out.println("\nĐộ tuổi cho " + "Hòa là " + linkedHashMap.get("Hòa"));
    }
}
