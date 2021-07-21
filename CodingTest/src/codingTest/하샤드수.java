package codingTest;

import java.util.Scanner;

public class 하샤드수 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int retry;
		
		do {

		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();

		System.out.println("판별 : " + solution(num));

		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);

	}

	public static boolean  solution(int num) {

		boolean answer = true;//하샤드수

		int sum = 0;

		String str = Integer.toString(num);

		String[] s = str.split("");

		for(int i = 0; i < s.length; i ++) {

			sum  += Integer.parseInt(s[i]);

		}

		if(num % sum == 0) {

			answer = true;

		} else {

			answer = false;

		}


		return answer;

	}

}
