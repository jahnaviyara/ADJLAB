package RMIs;
import java.util.*;
import java.rmi.*;

public class RMIclient {
	public static void main(String[] args) throws Exception{
		int x,y,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();

		Multiplication mul =(Multiplication)Naming.lookup("rmi://localhost:1099/multiplicationServer");

		result = mul.multiply(x,y);
		System.out.println("Multiplication Result:"+result);
	}
}