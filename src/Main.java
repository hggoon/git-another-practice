//	1. 문자 찾기
//	한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//	대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
//
//	입력
//	첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//	문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//	출력
//	첫 줄에 해당 문자의 개수를 출력한다.
//
//	예시 입력 1 
//	Computercooler
//	c
//	
//	예시 출력 1
//	2

//import java.util.*;
//
//class Main {
//	public int solution(String str, char t) {
//		int answer = 0;
//		str = str.toUpperCase();
//		t = Character.toUpperCase(t);
//		
//		for(int i = 0; i<str.length(); i++) {
//			if(str.charAt(i) == t) answer++;
//		}
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//		String str = kb.next();
//		char c = kb.next().charAt(0);
//		System.out.println(T.solution(str, c));
//	}
//}

//2. 대소문자 변환
//설명
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//입력
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//출력
//첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
//
//예시 입력 1 
//StuDY
//
//예시 출력 1
//sTUdy

import java.util.*;

class Main {
	public String solution(String str, String t) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) 
				answer+=Character.toUpperCase(x);				
			 	else answer+=Character.toLowerCase(x);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
//		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, str));
	}
}