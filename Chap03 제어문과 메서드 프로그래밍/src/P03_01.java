import java.util.Scanner;

public class P03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum =0;
		do{
			System.out.println("양의 정수를 입력하세요 :");
			n = sc.nextInt();
			if(n % 2==0){
				sum += n;
			}
			
		}while(n > 0);
		System.out.println("입력한 양의 정수를 입력하세요."+sum);
		

	}

}
