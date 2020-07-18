public class AdjacencyList {
    public int nodeNumber;
    public Node [] neighborArray;
    public  int[] pointed;

    public AdjacencyList(int nodeNumber){
        this.nodeNumber=nodeNumber;
        this.neighborArray=new Node[nodeNumber];
        pointed=new int[nodeNumber];
    }

    public void CreateAdjancencyList(int array[][]){
        Node temp;
        for(int i=0;i<this.nodeNumber;i++){
            temp=this.neighborArray[i]=new Node(i);
            for(int j=0;j<this.nodeNumber;j++){
                if(array[i][j]!=0){
                    temp.nextNeighbor=new Node(j);
                    temp=temp.nextNeighbor;
                }
            }
        }
    }





    public void Show(){
        Node temp;
        for(int i=0;i<this.nodeNumber;i++){
            temp=this.neighborArray[i];
            System.out.println("Node Name:"+temp.nodeTag);
            while (temp!=null){
                temp=temp.nextNeighbor;
                if(temp==null)break;
                System.out.println("Its neighbor ::"+ temp.nodeTag);
            }
            System.out.println("------------------------------------");
        }
    }

    public void clean(){

        for(int i=0;i<pointed.length;i++){
            pointed[i]=0;
        }
    }


    public void DFS(int head){
        Node temp; int temp_tag;
        this.pointed[head]=1;
        System.out.println(head+1+" ");
        temp=this.neighborArray[head];
        while (temp!=null){
            temp_tag=temp.nodeTag;
            if(this.pointed[temp_tag]==0)
                DFS(temp_tag);
            temp=temp.nextNeighbor;
        }
    }




    public void BFS(int head){
        int temp_tag;
        Node temp;
        Queue queue=new Queue(100);
        temp_tag=head;
        this.pointed[temp_tag]=1;
        System.out.println(temp_tag+1+" ");
        queue.Enqueue(temp_tag);
        while (!queue.IsEmpty()){
            temp_tag=queue.DeQueue();
            temp=this.neighborArray[temp_tag];
            while (temp!=null){
                temp_tag=temp.nodeTag;
                if(this.pointed[temp_tag]==0){
                    queue.Enqueue(temp_tag);
                    this.pointed[temp_tag]=1;
                    System.out.println(temp_tag+1+" ");
                }
                temp=temp .nextNeighbor;
            }
        }
    }

}
