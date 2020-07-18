public class Main {
    public static void main(String[] args) {

        List singlyLinkedList=new List();

        singlyLinkedList.AddFirst(1);
        singlyLinkedList.AddFirst(10);
        singlyLinkedList.AddLast(20);
        singlyLinkedList.AddLast(50);
        singlyLinkedList.AddFirst(9);
        singlyLinkedList.AddLast(15);
        //9--10-1-20-50-15
        singlyLinkedList.Show();
        System.out.println("--------------------");
        singlyLinkedList.head=null;
        singlyLinkedList.AddInOrder(1);
        singlyLinkedList.AddInOrder(10);
        singlyLinkedList.AddInOrder(20);
        singlyLinkedList.AddInOrder(50);
        singlyLinkedList.AddInOrder(9);
        singlyLinkedList.AddInOrder(15);
        //1-9-10-15-20-50
        singlyLinkedList.Show();
        singlyLinkedList.ListLoad();

    }
}
