public class Main {

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.EnQueue(9);
        queue.EnQueue(78);
        queue.EnQueue(21);
        queue.EnQueue(36);
        queue.EnQueue(10);
        queue.EnQueue(54);
        //9-78-21-36-10-54
        queue.Show();
        System.out.println("-------------------------");
            queue.DeQueue();
          System.out.println(queue.Peek())  ;




    }
}
