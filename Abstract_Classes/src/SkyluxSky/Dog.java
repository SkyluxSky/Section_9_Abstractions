package SkyluxSky;

public class Dog extends Animal {

    //Implementing extends on Dog class
    //Review - super passes to the parent animal constructor for animal name.
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat");
    }
}
