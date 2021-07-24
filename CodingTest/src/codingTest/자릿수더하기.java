package codingTest;

import java.util.Scanner;

public class 자릿수더하기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자를 입력하세요.");
		int number = scanner.nextInt();
		
		System.out.println("정답 : " + solution(number));
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			
			System.out.println("종료");
			
		}
		
		} while(retry == 1);
		

	}
	
	public static int solution(int number) {
		
		int answer = 0;
		
		String str = Integer.toString(number);
		
		String[] s = str.split("");
		
		int[] answerList = new int[s.length];
		
		for(int i = 0; i < s.length; i ++) {
			
			answerList[i] = Integer.parseInt(s[i]);
			
			answer += answerList[i];

		}

		return answer;
		
	}

}
