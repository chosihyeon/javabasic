package _1;

public class Concrete extends Abstract {
	
	int j;//필드 
	public Concrete(int i, int j) {
		super(i);//super(i)가 안들어감 i 안들어가면 0값 나옴 omg
		this.j=j;
		
	};//생성자
	
	void show() {
		System.out.printf("i= %d, j = %d", i, j);
	}
	//매서드 
	//상속 받아서 구현하면 구현 클래스임.
	//new 키워드로 객체를 생성할 수 잇는 클래스. 모든 메서드를 완벽하게 구현한 클래스 
	

}
