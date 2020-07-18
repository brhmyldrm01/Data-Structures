public class Main {
    public static void main(String[] args) {
        List DoublyLinkedList=new List();
        DoublyLinkedList.AddFirst(1);
        DoublyLinkedList.AddLast(10);
        DoublyLinkedList.AddFirst(11);
        DoublyLinkedList.AddLast(15);
        DoublyLinkedList.AddFirst(21);
        DoublyLinkedList.AddFirst(6);
        //6-21-11-1-10-15
        DoublyLinkedList.Show();
        System.out.println("------------------------");
        DoublyLinkedList.head=null;
        DoublyLinkedList.AddInOrder(1);
        DoublyLinkedList.AddInOrder(10);
        DoublyLinkedList.AddInOrder(11);
        DoublyLinkedList.AddInOrder(15);
        DoublyLinkedList.AddInOrder(21);
        DoublyLinkedList.AddInOrder(6);
        //1-6-10-11-15-21
        DoublyLinkedList.Show();
        DoublyLinkedList.ListLoad();




    }
}
