package com.bleh;

/**
 * Created by colinbradley on 10/11/16.
 */
public class Car {
     String mColor;
     String mBrand;
     int mTopSpeed;

    public Car(String color, String brand, int topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed= topSpeed;
    }

    public void go(){
        System.out.println("The "+mColor +" "+ mBrand + " is now accelerating.");
    }
    public void slow(){
        System.out.println("The "+mColor +" "+ mBrand + " is now deccelerating.");
    }
    public void stop(){
            System.out.println("The "+mColor +" "+ mBrand + " has stopped completely.");
        }


    public int getTopSpeed(){
        return mTopSpeed;
    }

    public String getColor(){
        return mColor;
    }

    public String getBrand(){
        return mBrand;
    }

    public void setTopSpeed(int topSpeed){
        mTopSpeed=topSpeed;
    }

    public void setColor(String color){
        mColor = color;
    }

    public void setBrand(String brand){
        mBrand= brand;
    }

}