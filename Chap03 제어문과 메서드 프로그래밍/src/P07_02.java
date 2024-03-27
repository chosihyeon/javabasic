import java.util.Scanner;

public class P07_02 {
	
		public static String input(String a) { 
			Scanner sc = new Scanner(System.in);
			System.out.print(a +" : ");
			String rsp = sc.next();
			
			return rsp;
	
		}
			 	
		public static void whosWin(String c,String y) {
		
			
			if(c.equals("바위")){
				
				if(y.equals("바위")) {
				System.out.println("무승부");
				}
				
				else if(y.equals("보")){
				System.out.println("철수,승");}
				
				else{
				System.out.println("영희,승");	
				}
				
			}
			else if(c.equals("가위")) {
				
				if(y.equals("가위")){
				System.out.println("무승부");	
				}
				
				else if(y.equals("바위")){
				System.out.println("철수, 승");	
				}
				else{
				System.out.println("영희, 승");	
				}
			}
			else {
				if(y.equals("보")) {
				System.out.println("무승부");
				}
				else if(y.equals("바위")) {
				System.out.println("철수, 승");	
				}
				else{
				System.out.println("영희, 승");	
				}
		}

	}
		public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		
		whosWin(c,y);
		
		}

}


