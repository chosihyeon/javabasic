import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		System.out.println("양의 정수를 입력하시요:");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		if (isPrime(num)) {
			System.out.println(num+"는 소수입니다.");
		}
		else {
			System.out.println(num+"는 소수가 아닙니다.");
		}

	}
	
	static boolean isPrime(int num) {
		//2부터 num-1까지 숫자로 나누어지면, 소수가 아니다. 
		for (int a = 2; a <= num-1; a++) {
			if (num % a == 0) {
				return false;
			}
		}
		return true;
	}

}
