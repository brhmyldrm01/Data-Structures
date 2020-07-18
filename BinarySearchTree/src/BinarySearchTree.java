public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }


    public void Add(int value){
        Node node=new Node(value);
        if(this.root==null){
            this.root=node;
            return;
        }
        Node parent;
        Node active=this.root;

        while (true){
            parent=active;
            if(value<active.data){
                active=active.leftchild;
                if(active==null){
                    parent.leftchild=node;
                    return;
                }
            }
            else if(value>active.data){
                active=active.rightchild;
                if (active==null){
                    parent.rightchild=node;
                    return;
                }
            }
            else {
                System.out.println("The value is exist");
                return;
            }
        }
    }


    public Node MaxNode(Node root){
        if(root==null){
            return null;
        }
        Node temp=root;
        while (temp.rightchild!=null){
            temp=temp.rightchild;
        }
        return temp;

    }

    public Node MinNode(Node root){
        if(root==null){
            return null;
        }
        Node temp=root;
        while (temp.leftchild!=null){
            temp=temp.leftchild;
        }
        return temp;
    }


    public Node Delete(Node root,int data){
        if(root==null){
            System.out.println("tree is not exist");
            return null;
        }
        if(data<root.data){
            root.leftchild=Delete(root.leftchild,data);
            return root;
        }
        else if (data>root.data){
            root.rightchild=Delete(root.rightchild,data);
            return root;
        }
        else{
            if(root.rightchild!=null&&root.leftchild!=null){
                Node temp=this.MinNode(root.rightchild) ;
                root.data=temp.data;
                root.rightchild=Delete(root.rightchild,temp.data);
                return root;
            }
            else if(root.leftchild!=null){
                root=root.leftchild;
                return root;
            }
            else if(root.rightchild!=null){
                root=root.rightchild;
                return root;
            }
            else{
                root=null;
                return null;
            }
        }
    }

    public void InOrderTraverse(Node root){
        if(root!=null){
            InOrderTraverse(root.leftchild);
            root.Show();
            InOrderTraverse(root.rightchild);

        }
    }



}
