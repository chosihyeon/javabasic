package nu5;

public class Smartphone extends Telephone {
	String game;

	
	Smartphone(String owner, String game) {
		super(owner);//오버로딩 Telephone(String owner){
		//super(owner);
	//을 받음
		this.game = game;}
		
		void playgame() {
			System.out.println("%s가 %s게임을 하는 중이다");
		}
	}

