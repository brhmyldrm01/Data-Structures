public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.Add(13);
        tree.Add(7);
        tree.Add(10);
        tree.Add(5);
        tree.Add(8);
        tree.Add(18);
        tree.Add(6);
        tree.Add(15);
        tree.Add(17);
        tree.Add(20);
        tree.Add(9);
        tree.InOrderTraverse(tree.root);
System.out.println("--------------------------");
        tree.Delete(tree.root,7);
        tree.Delete(tree.root,13);
        tree.InOrderTraverse(tree.root);
        System.out.println("MAX:::"+tree.MaxNode(tree.root).data);
        System.out.println("MIN:::"+tree.MinNode(tree.root).data);

    }
}
