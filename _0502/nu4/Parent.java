package nu4;

public class Parent {
	String name="영조";
	//생성자
	public Parent() {
		//기본 생성자의 내용-> 필드의 가려짐 해결 자식 클래스에서 부모 클래스의 생성자를 호출하지 않아도 됨
	}
		Parent(String name){
			this.name = name;
		}
	//메서드
		void print() {
			System.out.println(name);
			}
		}

