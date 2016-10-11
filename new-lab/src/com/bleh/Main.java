package com.bleh;

        import java.util.ArrayList;
        import java.util.Random;

public class Main {
    static String carColor = "Red";
    static String carBrand = "Volkswagen";

    static ArrayList<Car> traffic = new ArrayList<>();
    public static void main(String[] args) {
        StopLight stopLight = new StopLight();
        Random ranGen = new Random();

        traffic.add(new Car("Red", "Volkswagen", 65));


        for (int i = 0; i < 30; i++) {
            System.out.println("The stoplight is "+stopLight.getLightColor());
            for (Car myCar:traffic) {
                if (stopLight.isGreen()) {
                    myCar.go();
                }
                else if (stopLight.isYellow()) {
                    myCar.slow();
                }
                else if (stopLight.isRed()) {
                    myCar.stop();
                }
                else {
                    System.out.println("uh oh :( something went wrong");
                }
            }
            System.out.println("\n\n");
            if (stopLight.isGreen()){
                stopLight.setLightColor("yellow");
            }
            else if (stopLight.isRed()){
                stopLight.setLightColor("green");
            }
            else if (stopLight.isYellow()){
                stopLight.setLightColor("red");
            }
            else{
                System.out.println("uh oh :( something went wrong");
            }
        }

    }
}