import java.util.Scanner;

public class P07_final {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 철수가 어떤것을 낼지 값을 입력받는다.//철수는 a
		String c = sc.nextLine();
		// 영희가 어떤것을 낼지 값을 입력받고//영희는 b
		String y = sc.nextLine();
		// 누가 이겼는지 판단한다.
		String who = whosWin(c,y);

	}
	 static String whosWin(String a,String b) {
	// if 철수가 가위일때
			if (a.equals("s")) {
				// 영희가 가위이면 무승부-->출력
				if (b.equals("s")) {
					return "무승부";
				} // 영희가 바위일때 영희 승-->출력
				else if (b.equals("r")) {
					System.out.println("영희,승");
				} // 영희가 보일때 철수 승-->출력
				else if (b.equals("p")) {
					System.out.println("철수,승");
				}
			} else if (a.equals("r")) {
				// 영희가 바위일때
				if (b.equals("s")) {
					System.out.println("철수,승");
					//영희가 가위이면 철수 승-->출력
				} else if (b.equals("r")) {
					System.out.println("무승부");
					//영희가 바위이면 무승부-->출력
				} else if (b.equals("p")) {
					System.out.println("영희, 승");
					//영희가 보이면 영희 승-->출력
				}

			} else if (a.equals("p")) {
				// 영희가 보일때
				if (b.equals("s")) {
					System.out.println("영희,승");
					//영희가 가위이면 영희 승-->출력
				} else if (b.equals("r")) {
					System.out.println("철수,승");
					//영희가 바위이면 철수 승-->출력
				} else if (b.equals("p")) {
					System.out.println("무승부");
					//영희가 보일떼 무승부-->출력
				}
			}
}
}