public class Main {

    public static void main(String[] args) {




        AVLTree avlTree=new AVLTree();
        Node root=null;
        root=avlTree.Add(root,10);
        root=avlTree.Add(root,20);
        root=avlTree.Add(root,30);
        root=avlTree.Add(root,40);
        root=avlTree.Add(root,50);
        root=avlTree.Add(root,25);
        root=avlTree.Add(root,60);
        avlTree.PreorderTraversal(root);
        System .out.println("----------------------");
        root=avlTree.DeleteNode(root,50);
        avlTree.PreorderTraversal(root);
    }
}
