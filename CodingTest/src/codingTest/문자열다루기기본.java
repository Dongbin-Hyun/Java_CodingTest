package codingTest;

import java.util.Scanner;

public class 문자열다루기기본 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("문자를 입력하세요.");
		String s = scanner.next();
		
	
	}
	
		
		public boolean solution(String s) {
			
			boolean answer = true;
			
			int length = s.length();
			if(length != 4 && length != 6) {
				return false;
			}
			for(int i=0; i<length; i++) {
				char c = s.charAt(i);
				if(c<'0' || c>'9') {
					return false;
				}
			}
			return answer;
		}
	

}
