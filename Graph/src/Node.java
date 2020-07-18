public class Node {
        public int nodeTag;
        public Node nextNeighbor;

        public Node(int Tag){
            this.nodeTag=Tag;
            this.nextNeighbor=null;
        }
        public void Show(){
            System.out.println("Tag::"+this.nodeTag);
        }

    }
