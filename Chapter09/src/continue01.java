import java.util.Scanner;

public class continue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int line = 2; line <= 9; line++) {
			for (int number = 1; number <= 9; number++) {
				if (line == 4 || line == 7) {
					continue;
				}
				System.out.println("[" + line + "]" + "*" + "[" + number + "]" + line * number);
			}

		}
	}
}
