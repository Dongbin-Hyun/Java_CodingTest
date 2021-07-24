package codingTest;

import java.util.Scanner;

public class 정수내림차순으로배치하기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		System.out.println("숫자를 입력하세요.");
		long number = scanner.nextLong();
		
		solution(number);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			
			System.out.println("종료");
			
		}
		
		} while(retry == 1);
		
	}
	
	public static long solution(long number) {
		
		String answer = "";
		
		long realAnswer = 0;
		
		String str = Long.toString(number);
		
	
		
		String[] s = str.split("");
		
		int[] sToInt = new int[s.length];
		
		for(int i =0; i < s.length; i ++) {
			
			sToInt[i] = Integer.parseInt(s[i]);
			
		}
		
		sort(sToInt);
		
		for(int i = 0; i < sToInt.length; i ++) {
			
			//System.out.println(sToInt[i]);
			
			s[i] = Integer.toString(sToInt[i]);
			
			
			
			answer += s[i];
			
			realAnswer = Long.parseLong(answer);
			
			
			
		}	
		System.out.println(realAnswer);

		return realAnswer;
		
	}
	
	public static void change(int[] sToInt, int a, int b) {
		
		int tmp = sToInt[a];
		sToInt[a] = sToInt[b];
		sToInt[b] = tmp;
		
		
	}
	
	public static void sort(int[] sToInt) {
		
		for(int i = 0; i < sToInt.length - 1; i ++) {
			
			int max = sToInt[i];
			
			for(int j = sToInt.length - 1; j > i; j --) {
				
				if(max < sToInt[j]) {
					
					max = sToInt[j];
					
					change(sToInt, i, j);
					
				}
				
			}
			
		}
		
		
		
	}

}
