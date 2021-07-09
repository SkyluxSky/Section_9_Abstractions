package SkyluxSky;

/*Interface for Linked List Nodes*/

public interface NodeList {
    ListItem getRoot(); //List item itself
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);

    //Any data structure we create must have a starting node.
    void traverse(ListItem root);
}
