package SkyluxSky;

public class Main {

    public static void main(String[] args) {

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
        
    }
}
