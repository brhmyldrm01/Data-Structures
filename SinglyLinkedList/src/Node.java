public class Node {
        public int data;
        public Node next;

        public void Show(){
            System.out.println(this.data);
        }

        public Node(){
            this.data=0;
            this.next=null;
        }

        public Node(int value){
            this.data=value;
            this.next=null;
        }

    }
