package codingTest;

import java.util.Scanner;

public class 최대공약수최소공배수 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int retry;

		do {
			System.out.print("a : ");
			int x = scanner.nextInt();
			System.out.print("b : ");
			int y = scanner.nextInt();

			solution(x, y);

			System.out.println("계속하기 1");
			System.out.println("종료하기 0");
			retry = scanner.nextInt();

			if (retry  == 0) {
				System.out.println("종료합니다.");

			}

		} while(retry == 1);


	}

	public static void solution(int x, int y) {

		int[] answer = new int[2];

		int gcd = 1;
		int lcm = 1;

		int m = 1;
		int n = 1;

		if(x >= y) {
			for(int i = 1; i <= y; i++) {
				if(x % i == 0 && y % i == 0) {
					gcd = i;				
				}
			}			

		} else {
			for(int i = 1; i <= x; i++) {
				if(x % i == 0 && y % i == 0) {
					gcd = i;				
				}
			}

		}

		m = x / gcd;
		n = y / gcd;

		lcm = m * n * gcd;

		answer[0] = gcd;
		answer[1] = lcm;


		System.out.println("최대공약수 : " + answer[0]);
		System.out.println("최소공배수 : " + answer[1]);

	}

}
