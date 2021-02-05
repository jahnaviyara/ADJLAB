package collections;
import java.util.*;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(1201, "AnuLekha");
		mp.put(1202, "Jhansi");
		mp.put(1203, "Bhargavi");
		Set keys = mp.entrySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue()); 
		}
		System.out.println();
		mp.remove(1202);
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue()); 
		}
		System.out.println();
		mp.replace(1203, "Supriya");
		Iterator it1 = keys.iterator();
		while(it1.hasNext()) {
			Map.Entry me = (Map.Entry)it1.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue()); 
		}
	}
}
