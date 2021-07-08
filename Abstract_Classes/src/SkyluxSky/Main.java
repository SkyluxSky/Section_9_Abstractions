/*Abstraction is when you describe the functionality of something without going into the details.*/
package SkyluxSky;

public class Main {

    public static void main(String[] args) {
	    //Instantiate and run Dog class - (implements abstract class).
        Dog dog = new Dog("Yorkie");
	    dog.breathe();
	    dog.eat();

	    //Start Parrot - inherits from a nested abstract class.
	   	Parrot parrot = new Parrot("Australian Ringneck");
	    parrot.breathe();
	   	parrot.eat();
	   	parrot.fly();

	   	//Second example of how we can utilize nested abstract classes.
	   	Penguin penguin =  new Penguin("Emperor");
	   	penguin.breathe();
	   	penguin.eat();
	   	penguin.fly();
    }
}


