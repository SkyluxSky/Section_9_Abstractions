/*Abstract class that extends from another abstract class...*/
package SkyluxSky;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");

    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat");
    }

    public abstract void fly();
}
