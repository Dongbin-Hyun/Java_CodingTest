package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 문자열을내림차순으로정리하기 {


	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int retry;

		do {
			
			System.out.print("문자입력 : ");
			String s = scanner.next();

			solution(s);

			System.out.println("1.계속 0.종료");
			retry = scanner.nextInt();

			if(retry == 0) {
				System.out.println("종료");
			}

		} while(retry == 1);

	}

	public static void solution(String s) {

		String[] arr = s.split("");
		Arrays.sort(arr);
		Collections.reverse(Arrays.asList(arr));

		System.out.println(String.join("", arr));

	}

}
