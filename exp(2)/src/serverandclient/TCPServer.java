package serverandclient;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(2004);
		System.out.println("Server is ready for clients");
		Socket c = ss.accept();
		
		//DataInputStream din = new DataInputStream(c.getInputStream());
		PrintStream pw = new PrintStream(c.getOutputStream());
		//String s = din.readLine();
		
		pw.println("Hello, I am server");
	}

}
