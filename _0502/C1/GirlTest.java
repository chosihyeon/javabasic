package C1;
public class GirlTest {
	public static void main(String[] args) {
	Girl g1 = new Girl();//클래스(자료형) 변수 (참조 값 저장 인스턴스 핸들) = new (메모리 할당) 클래스()->생성자 호출 
	Girl g2 = new GoodGirl();//자식을 부모객체에 대입// 
	GoodGirl gg = new BestGirl();//부모는 자식꺼를 사용을 못함 그래서 바꿔줘야함.그래서 오류
//
//	g2.show();
	gg.show();
	}
}
