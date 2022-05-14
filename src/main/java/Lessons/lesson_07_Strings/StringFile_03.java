package Lessons.lesson_07_Strings;

import java.io.*;
import java.util.Arrays;

public class StringFile_03 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("src/main/resources/lib/file_01.txt");

        //var is = new FileInputStream(file1);
        var is = new BufferedInputStream(new FileInputStream(file1));

        /*********** сразу весь текст **************/
        //String a = new String(is.readAllBytes());
        //System.out.println(a);

        /*********** посимвольно *******************/
        int size = is.available();   // размер файла (кол-во символов)
        System.out.println(size);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append((char) is.read());
        }
        System.out.println(sb.toString());

    }
}
