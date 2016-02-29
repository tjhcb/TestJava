package com.test.pattern;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketReceiver {

	public void receiveMsg(){
		try {
			Socket so = new Socket("192.168.95.40", 2002);
			DataOutputStream dos = new DataOutputStream(so.getOutputStream());
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputStream is = so.getInputStream();
			
			//String str = "";
			//while("stop".equals(str)){
				dos.writeUTF("Sending packets..");
				dos.flush();
				dos.close();
				so.close();
				//str = br.readLine();
				System.out.println(is.read());
			//}
			is.read();
			is.close();
		} catch (UnknownHostException e) {
			//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
}
