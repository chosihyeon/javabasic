package nu6;

public class Vehicle {
	String color;// 자동차 색상
	int speed;// 자동차 속도

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	void show() {
		System.out.println(color+speed);
	}
}
//@Override
//void show() {
	//System.out.println("자동차 색상 : " + color + "\n자동차 속도 : " + speed + "\n자동차 배기량 : " + displacement + "\n자동차 기어 단수 : " + gear);