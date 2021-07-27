package codingTest;

import java.util.Scanner;

public class 서울에서김서방찾기 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int retry;
		
		do {
		
		System.out.print("number : ");
		int number = scanner.nextInt();
		
		String[] seoul = new String[number];
		for(int i = 0; i < seoul.length; i ++) {
			System.out.print("seoul[" + i +"] : ");
			seoul[i] = scanner.next();
		}
		
		System.out.print("찾으려는 성 : ");
		String str = scanner.next();
		
		solution(seoul, str);
		
		System.out.println("1.계속 0.종료");
		retry = scanner.nextInt();
		
		if(retry == 0) {
			System.out.println("종료");
		}
		
		} while(retry == 1);

	}
	
	public static void solution(String[] seoul, String str) {
		
		int place = 0;
		
		for(int i = 0; i < seoul.length; i ++) {
			if(seoul[i].equals(str)) {
				place = i;
			}
		}
		
		System.out.println("김서방은 " + place + "에 있다");

	}

}
