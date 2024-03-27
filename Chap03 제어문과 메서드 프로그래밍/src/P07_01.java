import java.util.Scanner;

public class P07_01 {
	
	public static String input(String a) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String a = sc.next();
	}
		
	public static void main(String[] args) {
	
				
				if(a.equals("바위")){
					
					if(b.equals("바위")) {
					System.out.println("무승부");
					}
					
					else if(b.equals("보")){
					System.out.println("철수,승");}
					
					else{
					System.out.println("영희,승");	
					}
					
				}
				else if(a.equals("가위")) {
					
					if(b.equals("가위")){
					System.out.println("무승부");	
					}
					
					else if(b.equals("바위")){
					System.out.println("철수, 승");	
					}
					else{
					System.out.println("영희, 승");	
					}
				}
				else {
					if(b.equals("보")) {
					System.out.println("무승부");
					}
					else if(b.equals("바위")) {
					System.out.println("철수, 승");	
					}
					else{
					System.out.println("영희, 승");	
					}
			}

		
		

	}

}
