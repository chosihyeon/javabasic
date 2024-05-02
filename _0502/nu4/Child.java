package nu4;

public class Child extends Parent {
	//필드 
	String name="사도세자";
//생성자
	Child(){
		
	}// 필드의 가려짐 shadowing //부모클래스의 기본생성자를 추가하면 
	//자식 클래스에서 부모 클래스의 생성자를 호출하지 않아도 됨
//메서드
	void print() {
	System.out.println("나는 "+name+"이다");
	}
}

