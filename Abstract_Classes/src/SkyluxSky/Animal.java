package SkyluxSky;

/*Abstract Class*/
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //Abstract Methods
    public abstract void eat();
    public abstract void breathe();

    //Getter
    public String getName() {
        return name;
    }
}
