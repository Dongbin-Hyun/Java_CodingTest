package codingTest;

import java.util.Scanner;

public class 약수의합 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자를 입력하세요. ");
		int number = scanner.nextInt();
		
		solution(number);
		
		System.out.print("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			
			System.out.println("종료");
			
		}
		
		} while(retry == 1);

	}
	
	public static void solution(int number) {
		
		int answer = 0;
		
		for(int i = 1; i < number + 1; i ++) {
			
			if(number % i == 0) {
				
				answer += i;
				
			}
			
		}
		
		System.out.println("결과 : " + answer);
		
	}
	
	

}
