package homework.fileUtil;

import java.io.*;
import java.util.*;


public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // fileSearch();
        //  contentSearch();
        //  findLines();
        //  printSizeOfPackage();
        createFileWithContent();

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input Path");
        String path = scanner.nextLine();
        System.out.println("Please input fileName");
        String fileName = scanner.nextLine();

        File file = new File(path + fileName);
        System.out.println(file.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.endsWith(".txt");
            }
        });
        assert files != null;

        for (File filePath : files) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(filePath.getName());
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("Please input txtPath");
        String txtPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(txtPath);
        DataInputStream inputStream = new DataInputStream(new FileInputStream(txtPath));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(keyword)) {
                System.out.println(line);
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        if (file.isDirectory()) {
            if (files != null) {
                int size = 0;
                for (File file1 : files) {
                    size += file1.length();
                }
                System.out.println(size);
            }
        } else {
            System.out.println("Please try again");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Please input Path");
        String path = scanner.nextLine();
        System.out.println("Plese input fileName");
        path = path + scanner.next();
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        File file = new File(path);

        boolean result = false;
        try {
            result = file.createNewFile();
        } catch (IOException e) {
            e.getMessage();
        }
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(path));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        try {
            out.writeBytes(content);
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
