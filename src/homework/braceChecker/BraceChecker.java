package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        int stackSize = text.length();
        Stack st = new Stack();

        for (char i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            char last;
            switch (a) {
                case '(':
                case '{':
                case '[':
                    st.push(a);
                    break;
                case ')':
                case '}':
                case ']':
                    last = (char) st.pop();
                    if (a == ')' && last != '(' || a == '}' && last != '{' || a == ']' && last != '[') {
                        System.out.println("Eror: opened " + last + " but closed " + a);
                    }
            }
        }
    }
}




