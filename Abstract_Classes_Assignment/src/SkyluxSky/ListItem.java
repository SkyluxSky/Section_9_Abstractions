package SkyluxSky;

/*Base List Item Class - Holds Links to previous and next item...*/

public abstract class ListItem {
    //Fields
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    //Constructor
    public ListItem(Object value) {
        this.value = value;
    }

    //Abstract Methods Responsible for List Manipulation (Next and Previous)
    abstract ListItem next();
    abstract ListItem setNext(ListItem item); //Sets next value...
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item); //Sets previous value...

    //Abstract Method for in depth comparisons
    abstract int compareTo (ListItem item);

    //Getter & Setter Methods
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
