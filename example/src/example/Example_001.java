package example;

import java.util.Scanner;

public class Example_001 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 차례대로 정렬하시오 ");
		System.out.println("a는");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
		
			for (int j = i; j <= a*a; j=j+a) {
				
				System.out.print(j);
				System.out.print(" ");
			}
		//1 2 4 7 11  == 1 2 3 4 5 ...순으로 ++ 
		// 1 3 6 10  == 2 3 4 5 6 .... 순으로 ++ 
				
			System.out.println();
		}
		
		}
	}

