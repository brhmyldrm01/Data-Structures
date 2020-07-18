public class Node {
    public int height;
    public int data;
    public Node leftchild;
    public Node rightchild;

    public Node(int data){
        this.data=data;
        this.height=1;
        this.leftchild=null;
        this.rightchild=null;
    }

}
