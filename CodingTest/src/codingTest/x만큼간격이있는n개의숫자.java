package codingTest;

import java.util.Scanner;

public class x만큼간격이있는n개의숫자 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("x = ");
		int x = scanner.nextInt();
		System.out.print("n = ");
		int n = scanner.nextInt();
		
		solution(x, n);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);

	}
	
	public static void solution(int x, int n) {
		
		long[] answer = new long[n];
		
		int tmp = x;
		
		System.out.println("----answer---");
		
		for(int i = 0; i < answer.length; i ++) {
			
			answer[i] = tmp * (i + 1);
			System.out.println("answer[" + i + "] = " + answer[i]);
			
			
		}
	
	}
	
}
