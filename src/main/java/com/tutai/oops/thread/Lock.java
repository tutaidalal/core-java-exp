package com.tutai.oops.thread;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
	
	private static ReentrantLock lock = new ReentrantLock();
	
	
	private static void check() {
		try {
			System.out.println("Try Aqquared by 1");
			lock.lock();
			System.out.println("Lock Aqquared by 1");
			
			lock.lock();
			System.out.println("Lock Aqquared by 1.1");
			
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
			lock.unlock();
		}
	}
	
	private static void check1() {
		try {
			System.out.println("Try Aqquared by 2");
			lock.lock();
			System.out.println("Lock Aqquared by 2");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}

	
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				Lock.check();
			}
		}.start();
		new Thread() {
			public void run() {
				Lock.check1();
			}
		}.start();
	}
}
