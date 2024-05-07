package _2;

public interface food extends Edible, Sweetable {
//상수
}
	/*interface Edible{
		void eat();
	}

	interface Sweetable{
		void eat();
	}
	*/
	interface Edible{
		void eat();
	}

	interface Sweetable{
		void sweet();
	}
//interface를 지정해줘야 되는데 짜구 class를 지정해서 안되는거임... 
	// class는 이중상속이 안됌. 그래서 빨간줄 자꾸 뜸.
//같은 메서드를 두번이나 사용이 불가능하다.*/
//추상 메서드 

//인터페이스는 구현된 메서드가 없기 때문에 다중상속이 가능하다. 
//하지만 클래스나 추상 클래스는 이미 구현된 메서드가 존재하기 때문에 다중 상속이 불가능함

//선언병합 컴파일러가 같은 이름으로 선언된 개별적인 선언 두개를 하나의 정의로 합치는 것을 의미

//extends
//부모에서 선언 / 정의를 모두하며 자식은 메소드 / 변수를 그대로 사용할 수 있음
//implements (interface 구현)
//부모 객체는 선언만 하며 정의(내용)은 자식에서 오버라이딩 (재정의) 해서 사용해야함
 // implement와 extend가 헷갈려서 자꾸 틀림.