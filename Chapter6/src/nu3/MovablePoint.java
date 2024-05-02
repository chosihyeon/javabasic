package nu3;

public class MovablePoint extends Point {
//필드
	int xSpeed;
	int ySpeed;

	MovablePoint(int xSpeed, int ySpeed, int x, int y) {
		super(x,y);
		this.xSpeed = xSpeed;
		
		this.ySpeed = ySpeed;
//생성자

	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

//메서드

}
