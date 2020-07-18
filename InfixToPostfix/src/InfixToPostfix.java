import java.util.Stack;

public class InfixToPostfix {
    String exp;
    public InfixToPostfix(){exp=null;}


    public static int Priority(char C){
        switch (C){
            case '+':
            case'-':
                return 1;
            case'*':
            case '/':
                return 2;
            case'^':
                return 3;
            default:
                return 0;
        }
    }


    public static String InfixToPostfix(String infix) {
        String postfix="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char C=infix.charAt(i);
            if(C==' '){
                break;
            }
            if(Priority(C)>0){
                while (!stack.empty()){
                    char temp=stack.peek();
                    if(temp=='('){
                        break;
                    }
                    if(Priority(temp)>=Priority(C)){
                        temp=stack.pop();
                        postfix=postfix+temp;
                    }else break;
                }
                stack.push(C);
            }
            else if(C=='('){
                stack.push(C);
            }

            else if(C==')'){
                char temp;
                while (!stack.isEmpty()){
                    temp=stack.pop();
                    if (temp=='('){
                        break;
                    }
                    postfix=postfix+temp;
                }
            }

            else{
                postfix=postfix+C;
            }
        }
        while (!stack.isEmpty()){
            if((char)stack.peek()=='('){
                stack.pop();
            }
            else {
                postfix = postfix + stack.pop();
            }
        }
        return postfix;
    }



    public static int CalculatePostfix(String Postfix) {
        try {
            String[] postfixArray = Postfix.split(" ");
            Stack<String> stack = new Stack<>();
            int C1 = 0, C2 = 0, C3 = 0;
            String C;
            for (int i = 0; i < postfixArray.length; i++) {
                C = postfixArray[i];
                C.trim();
                if (C.isEmpty()) {
                    continue;
                }

                if (C.equals("+")) {
                    C1 = Integer.parseInt(stack.pop());
                    C2 = Integer.parseInt(stack.pop());
                    C3 = C1 + C2;
                    stack.push(String.valueOf(C3));
                } else if (C.equals("-")) {
                    C2 = Integer.parseInt(stack.pop());
                    C1 = Integer.parseInt(stack.pop());
                    C3 = C1 - C2;
                    stack.push(String.valueOf(C3));
                } else if (C.equals("*")) {
                    C1 = Integer.parseInt(stack.pop());
                    C2 = Integer.parseInt(stack.pop());
                    C3 = C1 * C2;
                    stack.push(String.valueOf(C3));
                } else if (C.equals("/")) {
                    C2 = Integer.parseInt(stack.pop());
                    C1 = Integer.parseInt(stack.pop());
                    C3 = C1 / C2;
                    stack.push(String.valueOf(C3));
                } else {
                    stack.push(C);
                }
            }
            int result = Integer.parseInt(stack.pop());
            if (!stack.isEmpty()) {
                System.out.println("Wrong type");
            }
            return result;


        } catch (NullPointerException exception) {
            System.out.println("XXX");
        }
        return 0;
    }
}
