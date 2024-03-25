import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;// int num을 while에다만 하면 안됨.
//양의 숫자 입력 받기 
		while (true) {
			System.out.print("숫자 입력:");
			num = input.nextInt();

			if (num > 0) {
				break;
			}
			System.out.println("0보다 큰 숫자를 입력하세요");
		}
		for (int plus = 1; plus <= num; plus++) {
			sum += plus;
		}
		System.out.println("1부터" + num + "까지의 합:" + sum);
	}

	
	/*
	 * int sum = 0; for (int plus = 1; plus <= sum; plus++) {
	 * System.out.println("1부터"+ num +"까지의 합:"+sum); }
	 */
}
