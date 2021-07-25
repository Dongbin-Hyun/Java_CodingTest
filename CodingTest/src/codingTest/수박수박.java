package codingTest;

import java.util.Scanner;

public class 수박수박 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자를 입력하세요.");
		int number = scanner.nextInt();
		
		solution(number);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		} while(retry == 1);
	

	}
	
	public static void solution(int number) {
		
		String answer = "";
		
		for(int i = 0; i < number; i ++) {
			
			if(i % 2 == 0) {
				
				answer += "수";
				
			} else {
				
				answer += "박";
				
			}
			
		}
		
		System.out.println("결과 : " + answer);
		
	}


}
