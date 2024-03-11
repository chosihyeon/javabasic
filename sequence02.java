package jp1;
import java.util.Scanner;
public class sequence02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("금액을 입력하세요(원):");
		int a = input.nextInt();
		
		System.out.println("500원 동전" + a/500 + "개와"+"100원 동전" + (a%500)/100 + "개가 필요합니다." );
		
		// TODO Auto-generated method stub

	}

}
