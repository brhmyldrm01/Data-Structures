public class Main {

    public static void main(String[] args) {

        String infix="(2+3)*5";
        String postfix =InfixToPostfix.InfixToPostfix(infix);
        System.out.println(postfix);
        int result=InfixToPostfix.CalculatePostfix("2 3 + 5 *");
        System.out.println(result);
    }
}
