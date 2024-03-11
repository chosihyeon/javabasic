package jp1;

import java.util.Scanner;

public class Sequence01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("변수 a에 넣을 숫자 입력:");
		int a = input.nextInt();
		System.out.println("변수 b에 넣을 숫자 입력:");
		int b = input.nextInt();
		int temp = 0;//선언만 
		temp = a;
		a = b;
		b =temp;
		System.out.println("변수 a의 값=" + a + "\n변수 b의 값=" + b);
		//System.out.printf("변수 a의 값 = %d 변수 b의 값 = %d", a, b);

		// TODO Auto-generated method stub

	}

}
