package SkyluxSky;

//An interface in java specifies methods that a particular class that implements the interface must implement
//Interfaces are Abstract - Provides a common behavior
//Code in an interface does not change.

public class Main {

    public static void main(String[] args) {

        //How to implement interfaces in main method - Do not type new interface, only call the class that implements the interface.
        ITelephone camsPhone;
        camsPhone = new DeskPhone(12325);

        camsPhone.powerOn();
        camsPhone.callPhone(12325);
        camsPhone.answer();
    }
}
