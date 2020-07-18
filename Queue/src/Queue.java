public class Queue {
    Node head;
    Node rear;

    public Queue(){
        head=null;
        rear=null;
    }

    public boolean IsEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void EnQueue(int value) {
        Node newly = new Node(value);
        if (this.IsEmpty()) {
            this.head = newly;
            this.rear = newly;
            return;
        }
        this.rear.next = newly;
        this.rear = newly;
    }

    public int DeQueue(){
        if (this.IsEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp=this.head.value;
        if(this.head.next==null) {
            this.rear=null;
        }
        this.head=this.head.next;
        return temp;
    }
    public int Peek(){
        if(IsEmpty()) {
            System.out.println("Queue is Empty");
            return 9;
        }
        int temp=this.head.value;
        return temp;

    }
    public void Show(){
        Node temp=this.head;
        if(temp==null){
            System.out.println("Queue is Empty");
                return;
        }
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }

    }



}
