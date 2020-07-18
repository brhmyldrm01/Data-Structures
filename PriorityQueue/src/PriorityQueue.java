public class PriorityQueue {
    Node head;
    Node rear;
    public  PriorityQueue(){
        head=null;
        rear=null;
    }

    public boolean IsEmpty(){
        if(this.head==null){
            return true;
        }
        return false;
    }

    public void EnQueue(int priority,int value) {
        Node newly = new Node(value, priority);
        if (IsEmpty()) {
            this.head = newly;
            this.rear = newly;
            return;
        }
        Node temp=this.head;
        if(temp.priority>newly.priority){
            newly.next=head;
            head=newly;
            return;
        }
        if(newly.priority>=this.rear.priority){
            this.rear.next=newly;
            rear=newly;
            return;
        }
        if(temp.next==null){
            head.next=newly;
            rear=newly;
            return;
        }
        while(temp.next.priority<=newly.priority){
            temp=temp.next;
        }
        newly.next=temp.next;
        temp.next=newly;
        return;
    }


    public int Peek(){
        if(IsEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp=this.head.value;
        return temp;

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

    public void Show (){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }


}
