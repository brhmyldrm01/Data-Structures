public class List {
        public Node head;
        int counter = 0;


        public List() {
            this.head = null;
        }

        public void FindData(int wanted) {
            counter = 0;
            if (this.head == null) {
                System.out.println("List is Empty");
                return;
            }
            temp = this.head;
            while (temp != null) {
                counter++;
                if (temp.data == wanted) {
                    System.out.println("Sequence: " + counter + "DATA::" + temp.data );
                    return;

                } else {
                    temp = temp.next;

                }
            }
            System.out.println("Not found");
        }


        public void FindDelete(int wanted) {
            temp = this.head;
            boolean control = false;
            if(this.head==null){
                System.out.println("List is Empty");
                return;
            }

            if(wanted==temp.data){
                DeleteNode(1);
                return;
            }
            while (temp.next.data!=wanted) {
                temp = temp.next;
                if( temp.next==null){
                    control=true;
                    break;
                }
            }

            if (control == false) {
                temp.next = temp.next.next;
                System.out.println("Deleted-->"+wanted );
                return;
            }
            System.out.println("Not found");


        }


        public void AddFirst(int value) {
            Node temp = new Node(value);
            temp.next = this.head;
            head = temp;


        }

        Node temp = new Node();

        public void Show() {
            temp = this.head;
            if (temp == null) {
                System.out.println("List is Empty");
            }

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void AddLast(int value) {
            Node newly = new Node(value);
            if (this.head == null) {
                this.head = newly;
                return;
            }
            temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newly;

        }

        public void AddBetween(int value, int indices) {
            int counter = 1;
            if (this.head == null || indices <=1) {
                AddFirst(value);
                return;
            }
            temp = this.head;
            Node newly = new Node(value);
            while (temp.next != null) {
                if (counter + 1 == indices) {
                    break;
                }
                counter++;
                temp = temp.next;
            }
            newly.next = temp.next;
            temp.next = newly;
        }

        public void DeleteNode(int seq) {
            if (this.head == null) {
                System.out.println("List is Empty");
                return;
            }
            temp = this.head;
            if (seq <= 1) {
                this.head = temp.next;
                System.out.println("Deleted");

            } else {
                for (int i = 0; i < seq - 2; i++) {
                    temp = temp.next;
                    if (temp == null) {
                        System.out.println("Not Exist");
                        return;
                    }

                }
                if (temp.next!=null){
                    temp.next = temp.next.next;
                    System.out.println("Deleted");
                }else{
                    System.out.println("Not Exist");
                }

            }

        }

        public void ListLoad(){
            counter=0;
            temp=this.head;
            while(temp!=null){
                temp=temp.next;
                counter++;
            }
            System.out.println("List Load::"+counter);
        }


        public void AddInOrder(int value){
            Node newly=new Node(value);
            if(this.head==null) {
                this.head=newly;
                return;
            }
            temp=this.head;
            if( value<temp.data){
                AddFirst(value);
                return;
            }
            while(temp.next!=null&&temp.next.data<value){
                temp=temp.next;
            }
            newly.next=temp.next;
            temp.next=newly;
        }
    }


