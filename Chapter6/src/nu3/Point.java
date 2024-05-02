package nu3;
//필드
public class Point {
	private int x;
	private int y;
	//생성자
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	//private 클래스 외부에서 설정해서 얻어와야됨 외부꺼는 사용
	int getX() {
		return x;
	}
	void setX(int x) {
		this.x = x;
	}
	int getY() {
		return y;
	}
	void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
