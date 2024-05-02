package nu2;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person C1 = new Person("길동이", 22);
		Student C2 = new Student("황진이", 23, 100);
		ForeignStudent C3 = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		
		Person[] personList = new Person[] {C1, C2, C3};//배열 잘 안된것,,,, ㅎ
		
		for (Person p : personList) {
			p.show();
		
	}

}
}
