package homework.arrayutil;


public class ArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) ;
            {
            }
        }
        count++;
        System.out.println("c փոփոխականի քանակը = " + count);

//գրել կոդ որը կտպի մեջտեղի 2 սինվոլները
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("մեջտեղի 2 սիմվոլները = " + chars2[chars2.length / 2 - 1]);
        System.out.print(" " + chars2[chars2.length / 2]);

        System.out.println();
//տպել true եթե մասիվը վեջանում է ly-ով
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean a = false;
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            a = true;
        } else
            a = false;

        System.out.println(a);


//Տպել true եթե տեքստը պարունակում է bob բառը։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char isBob = 'b';
        boolean b = false;
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == isBob && bobArray[i + 2] == isBob) {
                b = true;
            }
            break;
        }
        System.out.println(b);

//Տպել այն սինվոլները որոնք պռաբել չեն
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char space = ' ';
        for (int i = 0; i < text.length; i++) {
            if (text[i] != space) {
                System.out.print(text[i]);
            }
        }

    }
}