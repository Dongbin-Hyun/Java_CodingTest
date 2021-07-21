package codingTest;

import java.util.Scanner;

public class 평균구하기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		int size = (int)(Math.random()*100 + 1);
		int[] arr = new int[size];

		arr = new int[size];

	
		System.out.println("평균 : " + solution(arr));
		
		System.out.println("다시 시도하시겠습니까? 1.네 0.아니오");
		retry = scanner.nextInt();
		if(retry != 1) {
			System.out.println("종료");
		}
		
		} while(retry == 1);
		


	}

	public static double solution(int[] arr) {

		double sum = 0;
		double answer = 0;


		for(int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random()*10);
			System.out.println("arr[" + i +"] : " + arr[i]);
			sum += arr[i];
		}

		answer = sum / arr.length;

		return answer;
	}



}
