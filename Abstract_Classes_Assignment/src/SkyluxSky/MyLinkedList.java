package SkyluxSky;

/**Linked List Class*/

public class MyLinkedList implements NodeList{

    //Field - Sets Our Root Value as Null
    private ListItem root = null;

    //Constructor:
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root; //Returns the root
    }

    @Override
    public boolean addItem(ListItem newItem) {

        //check if list is empty
        if (this.root == null){
            //The list was empty, so this item becomes the head of the list.
            this.root = newItem;
            return true;
        }

        //Sets current item to root value
        ListItem currentItem = this.root;

        //Loops through list
        while (currentItem != null){
            int comparison = (currentItem.compareTo(newItem));

            if(comparison < 0){
                //newItem is greater, move right if possible
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    //There is no next, so insert at end of list.
                    currentItem.setNext(newItem);//sets value as new item in list.
                    newItem.setPrevious(currentItem);//sets the current value as the previous entry in the list.
                    return true;
                }

            } else if (comparison > 0){
                //newItem is less, insert before.
                if (currentItem.previous() != null){
                    //Inserting a new item before what was the current item.
                    currentItem.previous().setNext(newItem);//Set current item previous entry to the value of newItem.
                    newItem.setPrevious(currentItem.previous());//Set the previous link to that item
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                } else {
                    //the node with a previous is the root
                    //sets the new item as the root
                    //inserts item before the original root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;

            } else {
                //equal - We do not want duplicate values...
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false; //Return function to satisfy method - We should never reach this return statement.
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
