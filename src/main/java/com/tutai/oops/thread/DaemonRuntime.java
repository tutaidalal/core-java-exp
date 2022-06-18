package com.tutai.oops.thread;

public class DaemonRuntime {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				while (true) {
					System.out.println("Hello World");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.setDaemon(true);
		
		
	}
}
