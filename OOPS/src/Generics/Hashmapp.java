package Generics;
import java.util.*;

public class Hashmapp {
	public static <K,V> void printmap(Map<K,V> map){
		for(Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("key is :" +entry.getKey() + "value is" +entry.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Swathi", 1);
		map.put("Chops", 2);
		printmap(map);
	}
}
