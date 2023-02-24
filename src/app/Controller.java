package app;

import building.House;
import buildingunit.Room;
import cooling.AC;

public class Controller {

    //---------------------------------------------------
    public static void main(String[] args) {

        AC.acStats();

        Room kitchen = new Room("Kitchen","White",15.5,10.0,78.0);
        kitchen.roomStats("");

        Room livingRoom = new Room("Living Room", "Tan",25.00,20.70,76.50);
        livingRoom.roomStats("");

        Room bathroom = new Room("Bathroom", "White", 15.00,10.00,74.30);
        bathroom.roomStats("");

        Room bedroom = new Room("Bedroom","Blue",8.00,8.00,78.00);
        bedroom.roomStats("");

        House myHouse = new House(kitchen, livingRoom, bathroom, bedroom);
        myHouse.displayInfo();

        System.out.println("-------------------------------------------------");
        System.out.println("What is the house's total square feet: " + myHouse.getHouseSquareFeet());
        System.out.println("-------------------------------------------------");
        System.out.println();


        AC.acStats();

        //Call by Value
        //-------------------------------------------------------------------
        livingRoom.roomStats("");
        AC.changeTemperatureUp(livingRoom.getTemperature(),2);

        System.out.println("");

        myHouse.getKitchen().roomStats("");
        AC.changeTemperatureUp(myHouse.getKitchen().getTemperature(),1);

        AC.acStats();
        //-----------------------------------------------------------------


        //Call by Reference
        //-------------------------------------------------------------------
        livingRoom.roomStats("");
        AC.changeTemperatureDown(livingRoom,1);

        myHouse.getKitchen().roomStats("");
        AC.changeTemperatureDown(myHouse.getKitchen(),7);

        AC.acStats();
        //-----------------------------------------------------------------

    }//end main

}//end Controller
