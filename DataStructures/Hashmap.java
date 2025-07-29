package DataStructures;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) 
	{                                   
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"abc");
		hm.put(2, "pqr");
		hm.put(3, "xyz");
		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("abc"));
	}
}