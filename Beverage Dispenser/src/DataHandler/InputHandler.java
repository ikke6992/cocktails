package DataHandler;

import java.io.*;
import java.net.*;

public class InputHandler extends Thread {
	
	private Socket sock;
	private InputStream in;
	
	public InputHandler() {
		try {
		sock = new Socket();
		in = sock.getInputStream();
		} catch (IOException e) {
			
		}
	}
	
	public void inputHandler() {
		while(true) {
			int i;
			try {
				i = in.read();
				if (i != -1) {
					//do something
				}
			} catch (IOException e) {
				System.out.println("Input cannot be read");
			}
		}
	}
	
	public static void main(String[] args) {
		InputHandler inputHandler = new InputHandler();
		inputHandler.start();
	}
	

}

