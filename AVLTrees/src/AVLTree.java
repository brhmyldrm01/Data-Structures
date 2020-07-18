public class AVLTree {
    public int getHeight(Node node){
        if(node==null)return 0;
        return node.height;
    }
    public int getBalance(Node node){
        if( node==null)return   0;
        return getHeight(node.leftchild)-getHeight(node.rightchild);
    }

    public Node TurnLeft(Node node){
        Node tempR=node.rightchild;
        Node tempRL=tempR.leftchild;
        tempR.leftchild=node;
        node.rightchild=tempRL;
        node.height=Math.max(getHeight(node.leftchild),getHeight(node.rightchild))+1;
        tempR.height=Math.max(getHeight(tempR.leftchild),getHeight(tempR.rightchild))+1;
        return tempR;
    }

    public Node TurnRight(Node node){
        Node tempL=node.leftchild;
        Node tempLR=tempL.rightchild;
        tempL.rightchild=node;
        node.leftchild=tempLR;
        node.height=Math.max(getHeight(node.leftchild),getHeight(node.rightchild))+1;
        tempL.height=Math.max(getHeight(tempL.leftchild),getHeight(tempL.rightchild))+1;
        return tempL;
    }

    public Node Add(Node root,int value){
        if (root==null)return new Node(value);
        if (value<root.data)root.leftchild=Add(root.leftchild,value);
        else if(value>root.data) root.rightchild=Add(root.rightchild,value);
        else   return root;
        root.height=Math.max(getHeight(root.rightchild),getHeight(root.leftchild))+1;
        int balance=getBalance(root);
        //LL
        if (balance>1&&value<root.leftchild.data){
            return TurnRight(root);
        }
        //RR
        if(balance<-1&&value>root.rightchild.data){
            return TurnLeft(root);
        }
        //LR
        if (balance>1&& value>root.leftchild.data){
            root.leftchild=TurnLeft(root.leftchild);
            return TurnRight(root);
        }
        //RL
        if (balance<-1&&value<root.rightchild.data){
            root.rightchild=TurnRight(root.rightchild);
            return TurnLeft(root);
        }
        return root;

    }
    Node MinNode(Node node)
    {
        Node temp= node;

        while (temp.leftchild != null)
            temp = temp.leftchild;

        return temp;
    }


    public Node DeleteNode(Node root ,int data){
        if(root==null)return null;
        if(root.data>data){
            root.leftchild=DeleteNode(root.leftchild,data);
        }
        else if (root.data<data){
            root.rightchild=DeleteNode(root.rightchild,data);
        }
        else{
            if (root.rightchild==null||root.leftchild==null){
                Node temp=null;
                if(temp==root.leftchild) temp=root.rightchild;
                else  temp=root.leftchild;
                if(temp==null){
                    temp=root;
                    root=null;
                }
                else root=temp;
            }
            else{
                Node temp=MinNode(root.rightchild);
                root.data=temp.data;
                root.rightchild=DeleteNode(root.rightchild,temp.data);
            }
        }
        if(root==null)return root;
        root.height=Math.max(getHeight(root.rightchild),getHeight(root.leftchild))+1;
        int balance=getBalance(root);

        if (balance > 1 && getBalance(root.leftchild) >= 0)
            return TurnRight(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.leftchild) < 0)
        {
            root.leftchild =TurnLeft(root.leftchild);
            return TurnRight(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.rightchild) <= 0)
            return TurnLeft(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.rightchild) > 0)
        {
            root.rightchild = TurnRight(root.rightchild);
            return TurnLeft(root);
        }

        return root;
    }


    public void PreorderTraversal(Node root){
        if(root!=null){
            System.out.println(root.data+" ");
            PreorderTraversal(root.leftchild);
            PreorderTraversal(root.rightchild);
        }
    }









}
