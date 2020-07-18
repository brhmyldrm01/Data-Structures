import java.util.Stack;

public class ExpressionTree {
    Node root;
    public ExpressionTree(){
        root=null;
    }

    public boolean IsOperator(char value){
        if(value=='+'||value=='/'||value=='*'||value=='-'){
            return true;
        }return false;
    }
    public boolean IsOperand(char value){
        if((value>='0' && value <='9') || (value>='a' && value <='z')){
            return true;
        }return false;
    }

    public Node CreateExpTree(String Expression){
        Stack<Node> stack=new Stack<>();
        Expression+=Expression+"#";
        int i=0;
        Node node,temp1,temp2;
        char symbol=Expression.charAt(i);
        while(symbol!='#'){
            if(IsOperand(symbol)){
                node=new Node(symbol);
                stack.push(node);
            }
            else if (IsOperator(symbol)){
                node=new Node(symbol);
                temp1=stack.pop();
                temp2=stack.pop();
                node.leftchild=temp2;
                node.rightchild=temp1;
                stack.push(node);
            }
            symbol=Expression.charAt(++i);
        }
        this.root=stack.pop();
        return this.root;
    }


    int counter=0;
    public void InOrder(Node root) {
        if(root!=null){
            counter++;
            InOrder(root.leftchild);
            System.out.print(root.value+" ");
            InOrder(root.rightchild);
        }
    }

}
