package codingTest;

import java.util.Scanner;

public class 제일작은수제거하기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("숫자입력");
		int number = scanner.nextInt();
		int[] arr = new int[number];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scanner.nextInt();
		}
		
		solution(arr);
	}
	
	public static void solution(int[] arr) {
		int[] answer2 = new int[arr.length - 1];
		sortDesc(arr);
		if(arr.length == 1) {
			int[] answer1 = {-1};
			System.out.println("[" + answer1[0] +"]");
		}
		else {
			System.out.print("[");
			for(int i = 0; i < answer2.length; i ++) {
				answer2[i] = arr[i];
				System.out.print(answer2[i]);
			}
			System.out.println("]");
		}

	}
	
	public static void change(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public static void sortDesc(int[] arr) {
		for(int i = 0; i < arr.length - 1; i ++) {
			int max = arr[i];
			for(int j = arr.length - 1; j > i; j --) {
				if(max < arr[j]) {
					change(arr, i ,j);
				}
			}
		}
	}
	
	

}
