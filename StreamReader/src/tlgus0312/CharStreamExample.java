package tlgus0312;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		//입력 및 출력파일 이름
		String orgFilename = "D1_Student.txt";//원본 파일
		String copiedFilename = "D1_Student_copied.txt";//복사된 파일
		
		try {
			//입력 및 출력 스트림 열기
			FileReader fr = new FileReader(orgFilename);
			FileWriter fw =new FileWriter(copiedFilename); 
			//파일을 문자 단위로 복사
			copyCharData(fr, fw);
			//파일을 문자 배열 단위로 복사
			//copyCharArrData(fr, fw);
			//출력 스트림 플러시 및 닫기
			fw.flush();
			fw.close();
			fr.close();
			//완료 메시지 출력
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			//파일을 찾을 수 없을때 예외처리
			System.out.println(e.getMessage());
		}

	}
 // 파일을 문자배열 단위로 복사하는 메서드
	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		char[] charArrData = new char[100];
		while (fr.read(charArrData) != -1) {
			System.out.print(charArrData);
			fw.write(charArrData);
		}
		
	}
	// 파일을 문자 단위로 복사하는 메서드
	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData;
		while ((charData = fr.read()) != -1) {
			System.out.print((char)charData);
			fw.write(charData);
		}
	}

}

	