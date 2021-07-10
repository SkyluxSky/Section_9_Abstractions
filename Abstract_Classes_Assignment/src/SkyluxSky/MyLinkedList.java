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
                    currentItem.setNext(newItem).setPrevious(currentItem); //sets value as new item in list.
                    //newItem.setPrevious(currentItem); //sets the current value as the previous entry in the list.
                    return true;
                }

            } else if (comparison > 0){
                //newItem is less, insert before.
                if (currentItem.previous() != null){
                    //Inserting a new item before what was the current item.
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());//Set current item previous entry to the value of newItem.
                    //newItem.setPrevious(currentItem.previous()); //Set the previous link to that item
                    newItem.setNext(currentItem).setPrevious(newItem);
                    //currentItem.setPrevious(newItem);

                } else {
                    //the node with a previous is the root
                    //sets the new item as the root
                    //inserts item before the original root
                    newItem.setNext(this.root).setPrevious(newItem); //Example of short cut (implements both set next and previous in same line)
                    //this.root.setPrevious(newItem);
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

        //Check if item is not Null.
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root; //start at head and go one by one
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);//compares root to item entered

            if (comparison == 0){
                //found the item to delete
                if (currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    //takes previous value and delete whatever value follows it.
                    currentItem.previous().setNext(currentItem.next());

                    if (currentItem.next() != null) {
                        //if we are at the end of the list replace current item with previous.
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                    return true;
                }

            } else if (comparison < 0) {
                currentItem = currentItem.next();// continue through the list to see if we can find the record.
            } else { // comparison > 0
                //We are at an item greater that the one to be deleted.
                //item is not in the list
                return false;
            }
        }

        return false;//no item to delete
    }

    @Override
    public void traverse(ListItem root) {

        //Check if list is empty
        if(root == null){
            System.out.println("The list is empty");

        } else {
            while (root != null){
                System.out.println(root.getValue());// print element
                root = root.next(); // get next element
            }
        }
    }
}
