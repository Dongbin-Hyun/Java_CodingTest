package codingTest;

import java.util.Scanner;

public class 내적 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		int[] a = new int[number];
		int[] b = new int[number];
		
		System.out.println("내적 : " + solution(a, b));
		
		System.out.println("검토");
		
		for(int i =0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i =0; i < b.length; i ++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);
		
	
	}
	
	public static int solution (int[] a, int[] b) {
		
		int answer = 0;
		
		for(int i = 0; i < a.length; i ++) {
			a[i] = (int)(Math.random()*5);
			b[i] = (int)(Math.random()*5);
			answer += a[i] * b[i];
		}
		
		
		return answer;
		
	}

}
