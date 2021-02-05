package RMIs;
//RMI Server

import java.rmi.*;
import java.rmi.server.*;

public class RMIserver extends UnicastRemoteObject implements Multiplication{

	public RMIserver() throws RemoteException{
		super();
	}
	public int multiply(int a, int b) throws RemoteException,Exception{
		return a*b;
	}

	public static void main(String args[]) throws Exception{
		RMIserver server = new RMIserver();

		System.out.println("RMI Server is running");

		Naming.rebind("multiplicationServer",server);
	}
}
