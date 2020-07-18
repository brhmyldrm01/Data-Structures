public class Main {

    public static void main(String[] args) {

        Stack stack=new Stack();
        System.out.println(stack.IsEmpty());
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);
        stack.Push(6);
       System.out.println(stack.IsEmpty());
       System.out.println(stack.Peek());
       stack.Pop();
       System.out.println(stack.Peek());


    }
}
