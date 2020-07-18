public class Node {
    int value;
    Node next;


    public Node(){
        this.value=0;
        this.next=null;
    }

    public  Node(int value){
        this.value=value;
        this.next=null;
    }



    public void Show(){
        System.out.println("Value  on the this node: "+ this.value);
        return;
    }
}
