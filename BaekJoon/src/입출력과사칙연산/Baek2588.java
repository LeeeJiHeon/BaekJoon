package 입출력과사칙연산;

import java.util.Scanner;

public class Baek2588 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int A = num1 * (num2 % 10);
		int B = num1 * ((num2 % 100) / 10);
		int C = num1 * (num2 / 100);
				
		System.out.println(A);
		System.out.println(B);	
		System.out.println(C);
		System.out.println(A + (B * 10) + (C * 100));
		
	}

}
