package DataHandler;

import java.io.*;

public class InputHandler extends Thread {
	
	public InputHandler() {
		
	}
	
	public void inputHandler(DataInputStream data) {
		InputStreamReader reader = new InputStreamReader(data);
		boolean stop = false;
		int i;
		try {
			while (!stop) {
				i = reader.read();
				if (i != -1 ) {
					//do something
				}
				sleep(5);
			}
		} catch (Exception e /*various exceptions??*/) {
			
		}
	}
	
	public static void main(String[] args) {
		InputHandler inputHandler = new InputHandler();
		inputHandler.start();
	}

}
