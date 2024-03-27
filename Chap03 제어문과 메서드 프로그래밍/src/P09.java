
public class P09 {

	public static void main(String[] args) {
		foo("안녕",1);
		foo("안녕하세요",1,2);
		foo("잘 있어");
		
		
		

	}
	static void foo(String a, int b) {
		System.out.println(a+" "+b);	
	}
	static void foo(String a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	static void foo(String a) {
		System.out.println(a);	
	}
}
