package level1;

import java.util.Scanner;

public class bj2588 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int input1 = sc.nextInt();
	        String input2 = sc.next();
	        sc.close();
	        System.out.println(input1 * (input2.charAt(2) - '0'));
	        System.out.println(input1 * (input2.charAt(1) - '0'));
	        System.out.println(input1 * (input2.charAt(0) - '0'));
	        System.out.println(input1 * Integer.parseInt(input2));
	    }
	}