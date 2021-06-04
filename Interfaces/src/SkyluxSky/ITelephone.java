package SkyluxSky;

//Example of simple interface
//Does not include code - only signatures for implementation

public interface ITelephone {
    //Create class signatures
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
