package collections;
import java.util.*;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Jahnavi");
		a.add("Supriya");
		a.add("Jhansi");
		System.out.println(a);
		a.add(2,"Prabha");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.remove("Supriya");
		System.out.println(a);
	}
}
