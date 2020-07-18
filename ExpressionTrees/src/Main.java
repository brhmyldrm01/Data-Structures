public class Main {

    public static void main(String[] args) {
        ExpressionTree expressionTree=new ExpressionTree();
        expressionTree.CreateExpTree("ab+ef*g*-");
        expressionTree.InOrder(expressionTree.root);

    }
}
