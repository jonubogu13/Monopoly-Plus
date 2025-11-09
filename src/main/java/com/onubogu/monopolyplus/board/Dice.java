package com.onubogu.monopolyplus.board;

import java.security.SecureRandom;

public class Dice {

    private final SecureRandom random = new SecureRandom();
    private boolean doubled;




    public Dice(){

        this.doubled = false;
    }

    private int rollOnce(){
        return random.nextInt(1,7);
    }


    public int rollTwice(){
        int value1 = rollOnce();
        int value2 = rollOnce();

        doubled = value1 == value2;

        return value1 + value2;

    }

}
