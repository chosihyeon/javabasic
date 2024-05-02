package C2;

class Girl {
	protected String name;

	Girl(String name){
	this.name = name;
	}//상속된 클래스에서 부모 클래스의 생성자를 호출하도록 해야하는데 자식 클래스에서 따로 초기화 작업을 할 필요가 없는 경우 
	//기본적으로 부모 클래스의 생성자가 호출되도록 하되, 자식 클래스에서 초기화 작업을 수행할 필요가 있을때 
	//클래스 내부에서 다른 메서드를 통해 속성을 초기화 하는 방식을 사용할대
	
	Girl(){
		
	}
	void show() {
	System.out.printf("%s는 자바 초보자이다\n",name);
	}
}
	



class GoodGirl extends Girl {
	GoodGirl() {
		
		
	}
     GoodGirl(String name){
		super(name);
	}

	void show() {
		System.out.printf("%s는 자바를 잘 안다\n", name);
	}
}

class BestGirl extends GoodGirl {
	
	int age;
	
	BestGirl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	BestGirl(){
		
	}

	void show() {
		System.out.println("%s는 자바를 무지하게 잘 안다");
	}
}

public class GirlTest {

	public static void main(String[] args) {

		Girl g1 = new Girl("춘향");
		Girl g2 = new GoodGirl("시현");
		GoodGirl gg = new BestGirl();
		BestGirl ggg = new BestGirl();
		
		g1.show();
		
		g2.show();
		
		gg.show();
		
		gg.show();
		
		ggg.show();
		
		
	}


}
