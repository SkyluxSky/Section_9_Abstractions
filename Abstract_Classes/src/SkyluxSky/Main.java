/*Abstraction is when you describe the functionality of something without going into the details.*/

/*What is the difference between an interface and an abstract class
*
* A dog and a bird is an animal, so in this case, it makes more sense to implement inheritance.
*
* Interfaces can be a more flexible solution.
*
* An abstract class can have member variables that are inherited. an interface cannot.
* - Interfaces are static.
* - An interface cannot have a constructor.
* - Abstract Classes can have any visibility
*
*
* */

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


