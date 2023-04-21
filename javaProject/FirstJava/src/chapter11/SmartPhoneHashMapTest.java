package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {

		HashMap<String, SmartPhone> hashmap = new HashMap<String, SmartPhone>();

		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashmap.put("ver", p);

		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222");
		hashmap.put("programName", p2);
		// p.getPhoneNumber()

		System.out.println(hashmap.get("ver"));
		System.out.println(hashmap.get("programName"));

		System.out.println("--------------------------------------------------------------");

		Set<String> keySet = hashmap.keySet();
		for (String keyname : keySet) {
			System.out.println(keyname + " : " + hashmap.get(keyname));
		}
	}

}
