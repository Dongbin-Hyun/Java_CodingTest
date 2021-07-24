package codingTest;

import java.util.Scanner;

public class 자연수뒤집어배열만들기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("숫자 입력 : ");
		long number = scanner.nextLong();
		
		solution(number);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			
			System.out.println("종료");
			
		}
		
		} while(retry == 1);

	}
	
	public static void change(int[] numberList, int a, int b) {
		
		int tmp = numberList[a];
		numberList[a] = numberList[b];
		numberList[b] = tmp;
		
	}
	
	public static void sort(int[] numberList) {
		
		for(int i = 0; i < numberList.length / 2; i++) {
			
			change(numberList, i, numberList.length - 1 -i);
			
		}
		
	}
	
	public static void solution(long number) {
		
		String str = Long.toString(number);
		String[] s = str.split("");
		
		
		int[] numberList = new int[s.length];
		
		for(int i = 0; i < s.length; i ++) {
			
			numberList[i] = Integer.parseInt(s[i]);
			
		}
		
		sort(numberList);
		
		for(int i = 0; i < numberList.length; i ++) {
			
			System.out.println("numberList[" + i + "] = " + numberList[i]);
			
		}
	
	}
}
