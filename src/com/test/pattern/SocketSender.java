package com.test.pattern;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketSender {

	//("192.168.95.40", 8080);
	
	public void sendMessage(){
		try {
			ServerSocket ss = new ServerSocket(2002);
			Socket so = ss.accept();
			DataInputStream dis = new DataInputStream(so.getInputStream());
			DataOutputStream dos = new DataOutputStream(so.getOutputStream());
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//String str = "";
			//while("stop".equals(str)){
				String is = (String)dis.readUTF();
				System.out.println("ServerSocket input: " + is);
				dos.write("Response from server...".getBytes());
				//str = br.readLine();
			//}
			//dis.close();
			//dos.close();
			//so.close();
			ss.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
