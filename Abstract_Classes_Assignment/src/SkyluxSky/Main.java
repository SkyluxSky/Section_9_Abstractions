package SkyluxSky;

public class Main {

    public static void main(String[] args) {

        //Linked List
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" "); //identifies space as csv. therefore stringData equals an array of strings

        //For each loop
        for (String s : data) {
            list.addItem(new Node(s)); //Creates a new node and assigns
        }

        list.traverse(list.getRoot()); //prints out list
        list.removeItem(new Node("3")); //removes item...
        list.traverse(list.getRoot());
        System.out.println(" ");



        //Binary Search Tree:
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringDataTree = "5 7 3 9 8 2 1 0 4 6 g a b h c";

        String[] treeData = stringDataTree.split(" "); //identifies space as csv. therefore stringData equals an array of strings

        //For each loop
        for (String s : treeData) {
            tree.addItem(new Node(s)); //Creates a new node and assigns
        }

        tree.traverse(tree.getRoot()); //prints out list
        tree.removeItem(new Node("4")); //removes item...
        tree.traverse(tree.getRoot());
        
    }
}
