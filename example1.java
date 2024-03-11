package jp1;
import java.util. Scanner;
public class example1 {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.println("정수 타입 숫자를 입력하세요");
		 int a = input.nextInt();//정수타입받는것  
		 System.out.println("실수 타입 숫자를 입력하세요");
		 double b = input.nextDouble();
		 System.out.println(a + b);
		 System.out.println(a - b);
		 System.out.println(a * b);
		 System.out.println(a / b);

	 }
}