package codingTest;

import java.util.Scanner;

public class 문자열을정수로바꾸기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do  {
		
		System.out.print("문장 입력 : ");
		String str = scanner.next();
		
		solution(str);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			
			System.out.println("종료");
			
		}
		
		} while(retry == 1);
		
	}
	
	public static void solution(String str) {
		
		int number = Integer.parseInt(str);
		System.out.println(number);

	}

}
