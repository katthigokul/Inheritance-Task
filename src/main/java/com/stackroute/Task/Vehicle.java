package com.stackroute.Task;


/* Java program for Below Mentioned ScenarioInheritance ChallengeStart with a base class of a Vehicle, t
hen create a Car class that inherits from thisbase class. F
inally, create another class, a specific type of Car (Say Honda City) that inherits from the Car class.
You should be able to hand steering, changing gears, and moving (speed in other words).
You will want to decide where to put the appropriate state and behaviours (fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For specific type of vehicle you will want to add something specific for that type of car.*/

//Solution
//Base Class Vehicle


class Vehicle {
    public void handSteering() {
        System.out.println("Hand Steering");
    }

    public void changingGear() {
        System.out.println("Changing Gear");
    }

    public void speed() {
        System.out.println("Speed");
    }
}

//Inheritance from Vehicle class to Car class
class Car extends Vehicle {

    public void carSteering(String turn) {
        turn = turn;
        System.out.println("Hand Steering:" + turn);
    }

    public void carModel(String model) {
        model = model;
        System.out.println("Car Model: " + model);
    }

    public void carSpeed(int speed) {
        speed = speed;
        System.out.println("Car Speed: " + speed);
    }

    public void changingGear(int gear) {
        gear = gear;
        System.out.print("Car Gear : " + gear);
    }
}


//Inheritance from car class to Specific carType as Honda City

class HondaCity extends Car {

    public void carSteering(String turn) {
        turn = turn;
        System.out.println("Hand Steering:" + turn);
    }

    public void carModel(String model) {
        model = model;
        System.out.println("Honda city Model: " + model);
    }

    public void carSpeed(int speed) {
        speed = speed;
        System.out.println("Honda city Speed : " + speed);
    }

    public void changingGear(int gear) {
        gear = gear;
        System.out.println("Honda City Gear: " + gear);
    }

    //Main Method
    public static void main(String[] args) {
        HondaCity hondaCity = new HondaCity();
        //Car car = new Car();
        {
            System.out.println("Honda city Attributes");
            System.out.println("-----------------");
            hondaCity.handSteering();
            hondaCity.changingGear(4);
            hondaCity.carModel("Xuv");
            hondaCity.carSpeed(180);
           /* System.out.println("-----------------");
            System.out.println("Car Attributes");
            System.out.println("-----------------");
            hondaCity.handSteering();
            hondaCity.carModel("SVU");
            hondaCity.carSpeed(200);
            hondaCity.changingGear(5);*/

        }
    }
}