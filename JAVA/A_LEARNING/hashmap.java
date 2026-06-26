package A_LEARNING;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1","hello");
        m.put("2", "bye");

        System.out.println("hello & " + m.get("2"));
    }
}
