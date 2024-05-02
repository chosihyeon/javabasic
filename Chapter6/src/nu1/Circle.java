package nu1;

public class Circle {
	
	int radius;//필드 생성

	Circle(int radius) {
		this.radius = radius;
	}//생성자
	
//Cicle 참조변수명 = new Circle();-> 객체를 불러올때 사용

	void show() {
		
		System.out.println("반지름이" +radius+"인 원이다.");
		
	
	}
}
