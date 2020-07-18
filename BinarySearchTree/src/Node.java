public class Node {
    public int data;
    public Node leftchild;
    public Node rightchild;
    public Node(int data){
        this.data=data;
        this.leftchild=null;
        this.rightchild=null;

    }
    public void Show(){
        System.out.println("->"+this.data);
    }


}
