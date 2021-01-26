package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isChildPlayingOutside(true,34));
    }

    public static boolean isChildPlayingOutside (boolean summer, int temperature) {
        if ((summer == true) && (temperature > 45) || (temperature > 25) && (temperature < 35)) {
            return true;
        } else
            return false;
    }
}

// if true && 34 is inputted value returns  true

// if true && 37 is inputted value returns false

// if false && 33 is inputted value returns true

// if false && 20 is inputted value returns false