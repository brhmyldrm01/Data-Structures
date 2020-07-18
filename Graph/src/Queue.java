public class Queue {
        public int[] Queue;
        public int head;
        public int rear;
        public int index;
        public int load;


        public Queue(int n){
            this.head=0;
            this.index=0;
            this.rear=-1;
            this.load=n;
            this.Queue=new int [this.load];
        }
        public boolean IsFull(){
            if(this.index==this.load)
                return true;
            else return false;
        }
        public boolean IsEmpty(){
            if(this.index==0)
                return true;
            else return false;
        }
        public void Enqueue(int value){
            if(!IsFull()){
                rear++;
                index++;
                if(rear==load){
                    rear=0;
                }
                Queue[rear]=value;
            }
        }

        public int DeQueue(){
            int data=0;
            if(!this.IsEmpty()){
                data=this.Queue[this.head];
                this.head++;
                this.index--;
                if(this.head==this.load){
                    this.head=0;
                }
            }
            return data;
        }

    }
