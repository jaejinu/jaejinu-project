package example;

import java.util.Scanner;

public class Example_001 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� ���ʴ�� �����Ͻÿ� ");
		System.out.println("a��");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
		
			for (int j = i; j <= a*a; j=j+a) {
				
				System.out.print(j);
				System.out.print(" ");
			}
		//1 2 4 7 11  == 1 2 3 4 5 ...������ ++ 
		// 1 3 6 10  == 2 3 4 5 6 .... ������ ++ 
				
			System.out.println();
		}
		
		}
	}

