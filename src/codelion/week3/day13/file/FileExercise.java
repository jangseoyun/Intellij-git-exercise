package codelion.week3.day13.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFiles() throws FileNotFoundException {// 현재 디렉토리 확인
        File dir = new File("home:\\");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException {// 한글자 읽어오기
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }

    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char ch = fileExercise.readAChar("a_file.txt");
        System.out.println(ch);
    }

}

//현재 디렉토리 보기
/*./java-exercise-1005.iml
./out
./README.md
./.gitignore
./.git
./a_file.txt
./.idea
./src
*/
