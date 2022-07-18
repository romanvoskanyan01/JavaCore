package classwork.javabook.chapter13.fileExample.fileExample.ioExamples;

import java.io.*;

public class FileReadAndWrite {

    public static final String FILE_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\classwork\\javabook\\chapter13\\fileExample\\fileExample\\ioExamples\\file\\example.txt";

    public static void main(String[] args) throws IOException {
        // write();
        read();
    }

    private static void write() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("H e llo From JAVA \r\n");
            bw.write("Hello From JAVA line 2!!!!!!!!!!");
        }
    }

    private static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }
            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.println(a);
            }
            System.out.println("aCount = " + aCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
