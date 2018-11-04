/**
 * 
 */
package com.cfed.thread;

/**
 * @author cfed
 *
 */
public class ConsumerfedThread implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ConsumerfedThread());
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stu
		System.out.println(Thread.currentThread());
		
	}

}
