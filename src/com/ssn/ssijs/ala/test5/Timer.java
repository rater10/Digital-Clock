package com.ssn.ssijs.ala.test5;

public class Timer {

	public void show(int h, int m, int s, int ms) {
		showUp(h, m, s, ms);
		System.out.println();
		showMid(h, m, s, ms);
		System.out.println();
		showDown(h, m, s, ms);
		System.out.println();
	}

	public void showUp(int h, int m, int s, int ms) {
		printUp(h / 10);
		printUp(h % 10);
		System.out.print("   ");
		printUp(m / 10);
		printUp(m % 10);
		System.out.print("   ");
		printUp(s / 10);
		printUp(s % 10);
		System.out.print("   ");
		printUp(ms);
		printUpAMPM();
	}

	public void showMid(int h, int m, int s, int ms) {
		printMid(h / 10);
		printMid(h % 10);
		System.out.print(" o ");
		printMid(m / 10);
		printMid(m % 10);
		System.out.print(" o ");
		printMid(s / 10);
		printMid(s % 10);
		System.out.print("   ");
		printMid(ms);
		printMidAMPM();
	}

	public void showDown(int h, int m, int s, int ms) {
		printDown(h / 10);
		printDown(h % 10);
		System.out.print(" o ");
		printDown(m / 10);
		printDown(m % 10);
		System.out.print(" o ");
		printDown(s / 10);
		printDown(s % 10);
		System.out.print(" o ");
		printDown(ms);
		printDownAMPM(h);
	}

	public void printUpAMPM() {
		System.out.print(" __ ");
		System.out.print("    ");
	}

	public void printMidAMPM() {
		System.out.print("|__|");
		System.out.print("|\\/|");
	}

	public void printDownAMPM(int h) {
		if (h > 12) {
			System.out.print("|   ");
		} else {
			System.out.print("|  |");
		}
		System.out.print("|  |");
	}

	public void printUp(int aux) {
		if (aux == 1 || aux == 4) {
			System.out.print("    ");
		} else {
			System.out.print(" __ ");
		}
	}

	public void printMid(int aux) {
		if (aux == 2 || aux == 3) {
			System.out.print(" __|");
		}
		if (aux == 4 | aux == 5 || aux == 6) {
			System.out.print("|__ ");
		}
		if (aux == 1 || aux == 7) {
			System.out.print("   |");
		}
		if (aux == 0) {
			System.out.print("|  |");
		}
		if (aux == 8 || aux == 9) {
			System.out.print("|__|");
		}
	}

	public void printDown(int aux) {
		if (aux == 1 || aux == 4 || aux == 7) {
			System.out.print("   |");
		}
		if (aux == 3 | aux == 5 || aux == 9) {
			System.out.print(" __|");
		}
		if (aux == 6 || aux == 8 || aux == 0) {
			System.out.print("|__|");
		}
		if (aux == 2) {
			System.out.print("|__ ");
		}
	}
}
