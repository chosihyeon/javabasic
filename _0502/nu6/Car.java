package nu6;

public class Car extends Vehicle{
int displacement;
int gears;

public Car(String color,int speed, int displacement, int gears) {
	super(color,speed);
	this.displacement =displacement;
	this.gears = gears;
	}

void show() {
	System.out.println(color);
	System.out.println(speed);
	System.out.println(displacement);
	System.out.println(gears);
}
}
