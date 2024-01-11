package ¹Ýº¹¹®;

import java.util.Scanner;

public class Baek25314 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String Result = "";
		
		for(int i = 4; i <= N; i++)
		{
			if(i % 4 == 0)
			{
				Result += "long ";
			}
		}
		Result += "int";
		System.out.print(Result);
		
	}
}
