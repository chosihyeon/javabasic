package tlgus0312;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassExample {
    // 입력 및 출력파일 이름
    String orgFilename = "D1_Student.txt";// 원본 파일
    String copiedFilename = "D1_Student_copied.txt";// 복사된 파일
    
    File inFile = new File(orgFilename); // 원본 파일을 나타내는 File 객체
    File outFile = new File(copiedFilename); // 복사된 파일을 나타내는 File 객체
    
    FileReader fr; // 파일을 읽기 위한 FileReader 객체
    FileWriter fw; // 파일을 쓰기 위한 FileWriter 객체
    //변수 선언 
    
    
    public FileClassExample() throws IOException {
    	// 생성자: 파일을 읽고 쓰기 위한 FileReader와
    	// FileWriter 객체를 초기화한다.
    	
    	// 원본 파일이 존재하는지 확인하고 있으면 FileReader 객체 초기화
    	//그렇지 않은 경우 메시지를 인쇄한다.
        if (inFile.exists()) {
            fr = new FileReader(inFile);
        } else {
            System.out.println(orgFilename + "을 찾을 수 없습니다."); 
            // 파일을 찾을 수 없는 경우 메시지 출력
            return;
        }
        
        // 복사된 파일이 존재하는지 확인하고 FileWriter 객체 초기화(새파일을 생성한다)
        //그렇다면 경고 메시지를 인쇄한다.
        if (!outFile.exists()) {
            outFile.createNewFile(); // 복사된 파일이 없는 경우 생성
        } else {
            System.out.println(copiedFilename + "이 존재합니다. 기존 내용이 삭제됩니다."); 
            // 복사된 파일이 이미 존재하는 경우 경고 메시지 출력
        }
        fw = new FileWriter(outFile); // FileWriter 객체 초기화
    }
}