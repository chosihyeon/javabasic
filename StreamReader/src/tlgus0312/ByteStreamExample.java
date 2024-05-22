package tlgus0312;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) throws IOException {
        // 입력 및 출력 파일 이름
        String orgFilename = "curi_01.jpg"; // 원본 파일
        String copiedFilename = "Curi_01_copied.jpg"; // 복사된 파일
        
        try {
            // 입력 및 출력 스트림 열기
            FileInputStream fis = new FileInputStream(orgFilename);
            FileOutputStream fos = new FileOutputStream(copiedFilename);
            
            // 파일을 바이트 단위로 복사
            copyEachOneByte(fis, fos);
            
            // 출력 스트림 플러시 및 닫기
            fos.flush();
            fos.close();
            
            // 입력 스트림 닫기
            fis.close();
            
            // 완료 메시지 출력
            System.out.println("복사가 완료되었습니다."); // 복사 완료
        } catch (FileNotFoundException e) {
            // 파일을 찾을 수 없는 예외 처리
            System.out.println(e.getMessage());
        }	
    }

    // 파일을 바이트 단위로 복사하는 메서드 // 문맥교환이 많이 일어나면 cpu의 성능이 떨어진다.
    private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
        int byteInput;
        while ((byteInput = fis.read()) != -1) {
            fos.write(byteInput);
        }
    }
    
    // 파일을 1024바이트 단위로 복사하는 메서드
    private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
        byte kbInput[] = new byte[1024];
        while (fis.read(kbInput) != -1) {
            fos.write(kbInput);
        }
    }
}
