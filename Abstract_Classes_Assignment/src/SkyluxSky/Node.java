package SkyluxSky;

/*Creating a Linked List Class From Scratch!*/

public class Node extends ListItem {

    //Constructor
    public Node(Object value) {
        super(value);
    }

    /**Methods (Implemented from Abstract Class)**/
    @Override
    ListItem next() {
        //Returns our right link item (field in ListItem class)
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        //Sets our right link item...
        this.rightLink = item;
        return this.rightLink; //Also returns said item...
    }

    @Override
    ListItem previous() {
        //Returns our left link item (field in ListItem class)
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        //Sets our left link item...
        this.leftLink = item;
        return this.leftLink; //Also returns said item...
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            //Casts both values to a String.
            //Retrieves value with .getValue()
            //Calls .compareTo() function from String class
            return ((String) super.getValue()).compareTo((String) item.getValue());

        } else {
            //Test fails because value is null...
            return -1;

        }
    }
}
