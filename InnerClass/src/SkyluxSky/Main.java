package SkyluxSky;

/*
* There are four types of nested classes
* -Static Nested Class
* -Non-Static Nested Class (Inner Class)
* -Local Class (Inner Class - Defined inside a scope block...)
* -Anonymous Class (Nested Class without a class name...)
* */

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        //Gearbox.Gear because an inner class must be called through its parent class...
        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);

        //Examples of what you cannot do:
        //Gearbox.Gear second = new Gearbox.Gear(2,2.33);
        //Gearbox.Gear third = new mcLaren.Gear(3,3.22);

        //System.out.println(first.driveSpeed(1000));

        //test clutch and change gear
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);

        //test wheel speed
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));


        /**Local Class Example**/
        class ClickListener implements Button.OnClickListener {
            //Constructor
            public ClickListener(){
                System.out.println("I've been attached");
            }

            //Methods
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        //Initiate Click Listener
        //btnPrint.setOnClickListener(new ClickListener());

        /**Anonymous Class Example**/
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }


    //Listen Method
    private static void listen(){
        boolean quit = false;

        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case  1:
                    btnPrint.onClick();
            }
        }
    }
}
