import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("철수 :");
		String a = sc.next();

		System.out.print("영희 :");
		String b = sc.next();

		if (a.equals("바위")) {

			if (b.equals("바위")) {
				System.out.println("무승부");
			}

			else if (b.equals("보")) {
				System.out.println("철수,승");
			}

			else {
				System.out.println("영희,승");
			}

		} else if (a.equals("가위")) {

			if (b.equals("가위")) {
				System.out.println("무승부");
			}

			else if (b.equals("바위")) {
				System.out.println("철수, 승");
			} else {
				System.out.println("영희, 승");
			}
		} else {
			if (b.equals("보")) {
				System.out.println("무승부");
			} else if (b.equals("바위")) {
				System.out.println("철수, 승");
			} else {
				System.out.println("영희, 승");
			}
		}

	}
}
