package SkyluxSky;

/*
* There are four types of nested classes
* -Static Nested Class
* -Non-Static Nested Class (Inner Class)
* -Local Class (Inner Class - Defined inside a scope block...)
* -Anonymous Class (Nested Class without a class name...)
* */

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        //Gearbox.Gear because an inner class must be called through its parent class...
        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);

        //Examples of what you cannot do:
        //Gearbox.Gear second = new Gearbox.Gear(2,2.33);
        //Gearbox.Gear third = new mcLaren.Gear(3,3.22);

        //System.out.println(first.driveSpeed(1000));



    }
}
