package nu2;

public class ForeignStudent extends Student {
	//필드
		String Country;
		//생성자 //생성자의 이름이랑 클라스 이름이 같아야됨
		public  ForeignStudent(String name, int age, int StudentNumber, String Country){ 
			super(name, age,StudentNumber);//부모 클래스의 생성자 호출
			this.StudentNumber = StudentNumber;
			this.Country = Country;

		}
		void show() {
			System.out.println ("학생[이름 : "+ name+ "," + "나이 :"+ age+ ", 학번 :"+ StudentNumber+ ", 국적 :"+ Country +"]");
		}

	}
//메서드 

