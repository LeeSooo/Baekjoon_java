package level6;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

// [입력] String 으로 입력받는다.
// -> [charAt()] String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
// -> int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.

// But, 이 방법은 Scanner를 쓰지 않고, 가장 기초 입력방법인 System.in을 쓰는 방법이다.
// 반드시 주의해야 할 점은 예외처리를 해주어야한다.
// IOException (java.io 패키지를 import 해야함)으로 메인 옆에 써주어도 되고, 
// 그냥 Exception으로 처리해도 된다.

public class Boj11654 {
	public static void main(String[] args) throws Exception {
		int a = System.in.read();
		System.out.print(a);
	}
}