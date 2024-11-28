package oops_concept;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String sentence = "Java is fun, and Java is powerful";
        
        
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> wc = new HashMap<>();
        for (String word : words) {
            if (wc.containsKey(word)) {
                wc.put(word, wc.get(word) + 1);
            } else {
                wc.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wc.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

