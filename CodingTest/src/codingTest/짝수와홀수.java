package codingTest;

import java.util.Scanner;

public class 짝수와홀수 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자 : ");
		int num = scanner.nextInt();
		
		System.out.println("출력값 : " + solution(num));
		
		System.out.println("다시 시도하시겠습니까? 1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			
			System.out.println("종료");
			
		}
		
		} while(retry == 1);

	}
	
	public static String solution(int num) {
		
		String answer = "";
		
		if(num == 0) {
			answer = "Even";
		} else if(num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		

		return answer;
		
	}

}
