package codingTest;

import java.util.Scanner;

public class 최댓값과최솟값 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do  {

		System.out.print("입력하세요. ");
		String str = scanner.nextLine();

		solution(str);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);

	}

	public static void solution(String str) {
		
		String[] strArr = str.split("\\s");
		int[] numArr = new int[strArr.length];
		


		for(int i = 0; i < strArr.length; i ++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}

		sort(numArr);
		
		for(int i = 0; i < numArr.length; i ++) {
			strArr[i] = Integer.toString(numArr[i]);
		}
		
		System.out.println("정답 : {" +strArr[0] + " " + strArr[strArr.length - 1] + "}");
		
		
		

	}

	public static void change(int[] numArr, int a, int b) {

		int tmp = numArr[a];
		numArr[a] = numArr[b];
		numArr[b] = tmp;

	}

	public static void sort(int[] numArr) {

		for(int i = 0; i < numArr.length - 1; i ++) {

			int min = numArr[i];

			for(int j = numArr.length - 1; j > i; j --) {

				if(min> numArr[j]) {

					min = numArr[j];

					change(numArr, i, j);

				}

			}

		}


	}
}
