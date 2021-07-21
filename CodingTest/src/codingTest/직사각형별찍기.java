package codingTest;

import java.util.Scanner;

public class 직사각형별찍기 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		for (int i = 0; i < y; i ++) {
			for (int j = 0; j < x; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
