package nu2;

//필드 
public class Person {
	String name;
	int age;


//생성자
	public Person(String name, int age) {
		this.age = age;// =뒤의 내용이 바뀌는 경우가 있나? 그게 아니라 매개변수에서 받아온것을 선언해줘야되므로 
		//매개변수랑 이름이 같아야됨, 이거 없어도 컴파일러에 자동 생성 단 하나라도 없을경우에만..
		this.name = name;
	}
//메서드
	void show(){
		System.out.println ("사람[이름 "+ name + ","+" 나이 : "+ age +"]");
	}
	
}