package nu5;

public class TestProgram {

	public static void main(String[] args) {
		Phone[]Phones = { new Phone("황진이"),new Telephone("길동이","내일"),
				new Smartphone("민국이","갤러그")};
		for(Phone p : Phones) {
			if (p instanceof Smartphone){
				((Smartphone) p).playgame();
			} else if(p instanceof Telephone) {
				((Telephone) p).autoAnswering();//
			} else {
				p.talk();
			}
	}
	}

	}//다운캐스터


