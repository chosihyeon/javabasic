package C3;

public class GirlTest {

	public static void main(String[] args) {
		Girl[]girls = {new Girl ("갑순이"), new GoodGirl("콩쥐"),new BestGirl("황진이")};
		for(Girl g :girls)
			g.show();
	}

 class Girl {
//필드
	public Girl(String name) {
	this.name =name;	
	}
	protected String name;// 해당 맴버를 동일 패키지 내의 클래스와 해당 클래스를 상속받은 클래스에서만 접근할 수 있도록 
	void show() {
		System.out.println(name+"는 자바 초보자이다");
	}
}
