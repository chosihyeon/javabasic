package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		
		//
		while(num<=0){
			System.out.println("양의 숫자가 아닙니다.다시 입력하세요:");
			num = sc.nextInt();//num선언은 한번만
			
		}for(int i= 1; num >= i; i++){
			sum += i; 
		}
		System.out.println("1부터"+num+"까지의 합은"+sum+"입니다." );
		//for(;;) {안에 있는거 생략가능 무한 반복문
			
		}
	}

