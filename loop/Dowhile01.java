package loop;

import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		
		

		int sum = 0;
		int i = 1;
		do {
			i = sc.nextInt();
			sum += i;

		} while(i!=0);
		System.out.println("지금까지 입력한 숫자의 합은" + sum + "입니다");
	}
}