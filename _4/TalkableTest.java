package _4;

public class TalkableTest{
	static void speak(talkable a) {
		a.talk();
		//talkable인터페이스를 정의하여 speak()메서드에 전달될 객체들이 해당 인터페이스를 구현하도록함.
		//korean,American클래스가 Talkable인터패ㅔ이스를 구현하도록 하였다.
		// speak() 메서드는 Talkable 타입의 객체를 매개변수로 받아 그 객체의 speak() 메서드를 호출
	}
	public static void main(String[] args) {
		speak(new korean());//-> korean클래스의 인스턴스 생성
		speak(new American());
		//Korean koreanPerson = new Korean();
       // American americanPerson = new American();
	}
}
