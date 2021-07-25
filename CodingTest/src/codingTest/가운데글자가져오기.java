package codingTest;

import java.util.Scanner;

public class 가운데글자가져오기 {
	
	public static  Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		System.out.print("단어를 입력하세요. ");
		String s = scanner.next();
		
		solution(s);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종");
		}
		
		
		} while(retry == 1);

	}
	
	public static void solution(String s) {
		
		
		
		
		
		String answer = "";
		String[] arr = s.split("");
		
		
		if(arr.length % 2 != 0) {
			
			answer = arr[arr.length / 2];
			
		} else {
			
			answer = arr[arr.length / 2 - 1] + arr[(arr.length / 2)];
			
		}
		
		System.out.println("정답 : " + answer);
		
		
		
		
		
		
		
	}

}
