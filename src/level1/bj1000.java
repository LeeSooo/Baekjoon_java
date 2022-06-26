package level1;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class bj1000 {
	public static void main(String[] args) {
		
		// System.in 은 입력한 값을 Byte 단위로 읽는 것을 뜻한다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(a+b);
		
	}
}
