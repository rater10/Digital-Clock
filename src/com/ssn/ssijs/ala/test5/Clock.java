package com.ssn.ssijs.ala.test5;

public class Clock {
	public static void main(String[] args) {

		Clock cl = new Clock();

		cl.run();
	}

	public void run() {
		Timer timer = new Timer();
		while (true) {
			int h = (int) (System.currentTimeMillis() / (1000 * 60 * 60)) % 24 + 3;
			int m = (int) (System.currentTimeMillis() / (1000 * 60)) % 60;
			int s = (int) (System.currentTimeMillis() / 1000) % 60;
			int ms = (int) (System.currentTimeMillis() / 1000);
			System.out.println(ms % 10);
			timer.show(h, m, s, ms);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				//
			}
		}
	}
}