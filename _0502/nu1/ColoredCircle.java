package nu1;

public class ColoredCircle extends Circle {
//필드 
	private String color;
//생성자
	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
		
	void show() {
		System.out.println("반지름이" + getRadius()+"인"+color+"색 원이다");
		
		}

	private int getRadius() {
		return radius;
	}

	}
