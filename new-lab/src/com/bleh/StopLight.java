package com.bleh;

/**
 * Created by colinbradley on 10/11/16.
 */

 public class StopLight {
    String mLightColor;

    public StopLight() {
        mLightColor = "green";
    }

    public boolean isRed() {
        if (mLightColor.equals("red")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isYellow() {
        if (mLightColor.equals("yellow")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isGreen() {
        if (mLightColor.equals("green")) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getLightColor() {
        return mLightColor;
    }

    public void setLightColor(String color) {
        if (color.equals("red") || color.equals("green") || color.equals("yellow")) {
            mLightColor = color;
        }
        else {
            System.out.println("uh oh :(something went wrong");
        }
    }
}