public class Stack {
        Node Upper=new Node();

        public Stack(){
            Upper=null;
        }

        public boolean IsEmpty(){
            if(Upper==null)
                return true;
            else return false ;
        }

        public void Push(int value){
            Node newly=new Node(value);
            newly.next=this.Upper;
            this.Upper=newly;
        }

        public int Peek(){
            if(this.IsEmpty())
                return -1;
            return this.Upper.data;
        }

        public int Pop(){
            if(this.IsEmpty())
                return -1;
            int value=this.Upper.data;
            this.Upper=this.Upper.next;
            return value;
        }







    }

