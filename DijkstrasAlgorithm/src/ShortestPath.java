public class ShortestPath {
    int[][] adjacencyMatrix;
    int[] path;
    int head;
    int[] pointed;




    public ShortestPath(int[][] adjacencyMatrix, int head) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.head = head;
        path=new int[adjacencyMatrix.length];
        pointed=new int[adjacencyMatrix.length];

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            path[i] = Integer.MAX_VALUE;
            pointed[i]=0;
        }
    }




    public int[] Dijkstra() {
        path[head] = 0;
        int min,minIndex;
        for(int i=0;i<adjacencyMatrix.length;i++){
            min=Integer.MAX_VALUE;
            minIndex=-1;
            for (int a=0;a<path.length;a++){
                if (pointed[a]==0&&path[a]<min){
                    min=path[a];
                    minIndex=a;
                }
            }
            head=minIndex;
            pointed[head]=-1;
            int[] temp=adjacencyMatrix[head];


            for(int j=0;j<adjacencyMatrix.length;j++){
                if (temp[j]!=0&&pointed[j]==0&&(path[head]+temp[j]<path[j])){
                    path[j]=path[head]+temp[j];
                }
            }
        }
        return path;
    }
}
