package codingTest;

import java.util.Scanner;

public class 핸드폰번호가리기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("Phone Number : ");
		String phoneNumber = scanner.next();
		
		solution(phoneNumber);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);
		
	}
	
	public static void solution(String phoneNumber) {
		
		String answer = "";
		
		String[] s = phoneNumber.split("");
		
		for(int i = 0; i < s.length - 4; i ++) {
			
			s[i] = "*";
	
		}
		
		for(int i = 0; i < phoneNumber.length(); i ++) {
			
			answer += s[i];
			
		}
		
		System.out.println("정답 : " + answer);
		 
		
	}

}
