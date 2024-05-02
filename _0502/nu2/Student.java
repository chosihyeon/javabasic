package nu2;

public class Student extends Person {

	//필드
	int StudentNumber;
	//생성자 //생성자의 이름이랑 클라스 이름이 같아야됨
	public Student(String name, int age, int StudentNumber){ 
		super(name, age);//부모 클래스의 생성자 호출
		this.StudentNumber = StudentNumber;

	}
	void show() {
		System.out.println ("학생[이름 : "+ name+ "," + "나이 :"+ age+ ", 학번 :"+ StudentNumber+"]");
	}//System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, num);

}
