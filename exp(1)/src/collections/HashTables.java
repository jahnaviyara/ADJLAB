package collections;
import java.util.*;

public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> ht = new Hashtable<>();
		ht.put(1211, 10);
		ht.put(1202, 9);
		ht.put(1216, 9);
		for(Map.Entry itr:ht.entrySet()) {
			System.out.println(itr.getKey()+":"+itr.getValue());
		}
		System.out.println();
		ht.remove(1211);
		for(Map.Entry itr1:ht.entrySet()) {
			System.out.println(itr1.getKey()+":"+itr1.getValue());
		}
	}

}
