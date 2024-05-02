package nu5;

public class Telephone extends Phone {
	String when;
	Telephone(String owner,String when){
		super(owner);
		this.when = when;
	}
	
	Telephone(String owner){
		super(owner);
	}
	
		void autoAnswering() {
		System.out.printf("%s가 부재 중이니 %d에 전화요망",owner,when);//%안에는 ""를 꼭 넣어야함.
	}
}
