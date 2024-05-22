package tlgus0312;

import java.io.File;
import java.io.IOException;

public class FileInfoExample {

    public static void main(String[] args) throws IOException {

        // 파일 및 디렉토리 경로 설정
        File imgDir = new File("C:/Temp/images");
        File testFile = new File("C:/Temp/test.txt");

        // imgDir 디렉토리가 존재하지 않으면 생성
        if (imgDir.exists() == false) { 
            imgDir.mkdirs();//경로상에 없는 모든 디렉토리를 생성
            System.out.println(imgDir.getName() + "을 생성합니다.");
        }

        // testFile 파일이 존재하지 않으면 생성
        if (testFile.exists() == false) {
            testFile.createNewFile();//새로운 파일을 생성 
            System.out.println(testFile.getName() + "을 생성합니다.");
        }

        // Temp 디렉토리의 내용을 출력
        File tempDir = new File("C:/Temp");
        File[] contents = tempDir.listFiles();
        System.out.println(tempDir.getName() + "의 내용을 출력합니다.");
        for (File file : contents) {
            System.out.print("\t" + file.getName());
            if (file.isDirectory()) {
                // 디렉토리일 경우
                System.out.print("<DIR>");
            } else {
                // 파일일 경우
                System.out.print("<" + file.length() + ">");
            }
            System.out.println();
        }
    }
}