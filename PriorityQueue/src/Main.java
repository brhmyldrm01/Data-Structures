public class Main {

    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.EnQueue(1,9);
        priorityQueue.EnQueue(2,78);
        priorityQueue.EnQueue(3,21);
        priorityQueue.EnQueue(1,36);
        priorityQueue.EnQueue(3,10);
        priorityQueue.EnQueue(2,54);
        //9-36-78-54-21-10
        priorityQueue.Show();
        System.out.println("-----------------");
        priorityQueue.DeQueue();
     System.out.println(priorityQueue.Peek()) ;
    }
}
