package jp1;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하시요.(cm):");	
		int a = input.nextInt();
		double b = 3.14 * a *a;
		System.out.println("원의 넓이는\t" + b + "입니다");//ctrl F11 바로 실행할수있음
		// TODO Auto-generated method stub

	}

}
