package com.onubogu.monopolyplus.board.spaces;

public class Street extends Property{

    private int houses;
    private int hotels;


    public Street (String name, int index, ColorGroup group, int value, int mortgage, int rent){
        super(name, index, group, value, mortgage, rent);
        this.houses = 0;
        this.hotels = 0;
    }



}
