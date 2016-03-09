import java.util.*;

public class WordCount {

    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(input.toLowerCase().replaceAll("[\\p{Punct}]", ""));

        while (sc.hasNext()) {
            String key = sc.next();
            Integer value = map.get(key);
            if (value == null) value = 0;
            map.put(key, value + 1);
        }
        return map;
    }
}
