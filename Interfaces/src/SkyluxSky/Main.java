package SkyluxSky;

//An interface in java specifies methods that a particular class that implements the interface must implement
//Interfaces are Abstract - Provides a common behavior
//Code in an interface does not change.

public class Main {

    public static void main(String[] args) {

        //How to implement interfaces in main method - Do not type new interface, only call the class that implements the interface.
        ITelephone camsPhone;

        //Desk Phone
        camsPhone = new DeskPhone(12325);
        camsPhone.powerOn();
        camsPhone.callPhone(12325);
        camsPhone.answer();

        //Because our initial object is initialized as ITelephone Interface
        //We can create a single instance that stores multiple objects that use the same interface.
        camsPhone = new MobilePhone(23456);
        camsPhone.powerOn();
        camsPhone.callPhone(23456);
        camsPhone.answer();
    }
}
