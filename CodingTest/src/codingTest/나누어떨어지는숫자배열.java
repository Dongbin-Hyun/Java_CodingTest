package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 나누어떨어지는숫자배열 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {

		System.out.print("number : ");
		int number = scanner.nextInt();
		int arr[] = new int[number];
		System.out.print("div : ");
		int div = scanner.nextInt();

		for(int i = 0; i < arr.length; i ++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(solution(arr, div));
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);


	}
	
	public static int[] solution(int[] arr, int div) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] % div == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.isEmpty()) {
			list.add(-1);
		}
		
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		
		return answer;
		
	}

	
}
