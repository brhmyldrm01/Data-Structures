import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String exp="( ( x * ( ( x + y ) / ( j – 3 ) ) + y ) / ( 4 – 2.5 ) )]";
        char[] dizi=exp.toCharArray();
        Stack stack=new Stack();
        boolean isValid=true;
        char read, pull;
        for (int i=0;i<dizi.length;i++) {
            read = dizi[i];
            if ((read == '[') || (read == '{') || (read == '(')) {
                stack.push(read);
            }
            if ((read ==']') || (read == '}') ||( read == ')')) {
                if (stack.empty()) {
                    isValid = false;break;
                }
                pull =(char)stack.pop();
                if ((pull == '[') && (read != ']')) {
                    isValid = false;break;
                }
                else if ((pull == '{') && (read!= '}')) {
                    isValid = false;break;
                }
                else if ((pull == '(' )&&(read != ')')) {
                    isValid = false;break;
                }
            }
        }
        if(!stack.empty()){
            isValid=false;
        }
        System.out.println("Bracket Matching  "+isValid);
    }
}
