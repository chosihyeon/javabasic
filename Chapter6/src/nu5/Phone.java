package nu5;

public class Phone {
//필드 
	String owner;
//생성자
	Phone(String owner){
		this.owner = owner;
	}
	//메서드 
	void talk() {
		System.out.printf("%s가 통화중",owner);
	}
	
}
