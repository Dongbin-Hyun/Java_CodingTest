package codingTest;

import java.util.Scanner;

public class 피보나치수열 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자 입력 : ");
		int x = scanner.nextInt();
		
		System.out.println("정답 : " + solution(x));
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);

	}
	
	public static int solution(int x) {
		
		if(x <= 1) {
			return x;
		} else {
			return solution(x-1) + solution(x-2);
		}
	
	}
		

}
