public class List {
        public Node head;
        public List(){
            this.head=null;
        }

        public void FindData(int wanted){
            Node temp=this.head;
            int counter=1;
            if(temp==null){
                System.out.println("List is Empty");
                return;
            }
            while(temp!=null){
                if(temp.data==wanted){
                    System.out.println("DATA:: "+temp.data+" Sequence::"+counter);
                    return;
                }
                counter++;
                temp=temp.next;
            }
            System.out.println("Not found");
        }





        public void FindDelete(int wanted){
            Node temp=this.head;
            if(temp==null){
                System.out.println("List is Empty");
                return;
            }
            if (temp.data==wanted){
                DeleteNode(1);
                return;
            }

            while(temp.data!=wanted){
                if(temp.next==null){
                    System.out.println("Not found");
                    return;
                }
                temp=temp.next;
            }

            System.out.println("Deleted:: "+temp.data );
            if(temp.next!=null){
                temp.next.prev=temp.prev;
            }
            temp.prev.next=temp.next;

        }







        public void ListLoad(){
            int  counter=0;

            Node temp=this.head;
            while(temp!=null){
                temp=temp.next;
                counter++;
            }
            System.out.println("List Load::: "+counter);


        }



        public void AddInOrder(int value){
            Node newly=new Node(value);
            if(this.head==null) {
                this.head=newly;
                return;
            }
            Node temp;
            temp=this.head;

            if( value<temp.data){
                this.AddFirst(value);
                return;
            }
            while(temp.next!=null&&temp.next.data<value){
                temp=temp.next;
            }
            if(temp.next!=null){
                temp.next.prev=newly;
            }
            newly.next=temp.next;
            temp.next=newly;
            newly.prev=temp;
        }


        public void DeleteNode(int seq) {
            Node temp=this.head;
            if (this.head == null) {
                System.out.println("List is Empty");
                return;
            }
            if (seq <= 1) {
                System.out.println("Deleted:"+temp.data);
                this.head = temp.next;
                this.head.prev=null;
                return;

            }
            for (int i = 0; i < seq - 2; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Not exist");
                    return;
                }

            }
            System.out.println("Deleted:"+temp.next.data);
            if(temp.next.next!=null){
                temp.next.next.prev=temp;
            }
            temp.next = temp.next.next;


        }


        public void AddFirst(int value){
            Node newly=new Node(value);
            if(this.head==null){
                this.head=newly;
                return;
            }
            this.head.prev=newly;
            newly.next=this.head;
            this.head=newly;


        }

        public void AddLast(int value){
            Node newly=new Node(value);
            Node temp=this.head;
            if(temp==null){
                this.head=newly;
                return;

            }
            while(temp.next!=null){
                temp=temp.next;
            }
            newly.prev=temp;
            temp.next=newly;


        }


        public void Show(){

            Node temp=this.head;

            if(temp==null){
                System.out.println("List is Empty");
                return;
            }
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }



        public void AddBetween(int value, int indices) {
            int counter = 1;
            Node temp=this.head;
            if (this.head == null || indices <= 1) {
                this.AddFirst(value);
                return;
            }
            Node newly = new Node(value);
            while (temp.next != null) {
                if (counter + 1 == indices) {
                    break;
                }
                counter++;
                temp = temp.next;
            }

            if(temp.next!=null){
                temp.next.prev=newly;
            }
            newly.next = temp.next;
            temp.next = newly;
            newly.prev=temp;

        }

    }


