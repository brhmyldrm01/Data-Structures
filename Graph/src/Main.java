public class Main {



    public static void main(String[] args) {

        int [] []adjacencyMatrix=
                {{0,1,0,0,1},
                {1,0,1,1,1},
                {0,1,0,1,0},
                {0,1,1,0,1},
                {1,1,0,1,0}};

                AdjacencyList adjacencyList=new AdjacencyList(adjacencyMatrix.length);
                adjacencyList.CreateAdjancencyList(adjacencyMatrix);
                adjacencyList.Show();
                System.out.println("Depth First Search");
                adjacencyList.clean();
                adjacencyList.DFS(0);
                System.out.println("Breadth First Search");
                adjacencyList.clean();
                adjacencyList.BFS(0);






    }
}
