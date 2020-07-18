public class Node {
    char value;
    Node leftchild;
    Node rightchild;

    public Node(char value,Node leftNode ,Node rightNode){
        this.value=value;
        this.leftchild=leftNode;
        this.rightchild=rightNode;
    }

    public Node(char value){
        this.value=value;
        this.leftchild=null;
        this.rightchild=null;
    }

}
