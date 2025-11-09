package com.onubogu.monopolyplus.controllers;

import com.onubogu.monopolyplus.board.Property;

import java.util.Set;

public abstract class Controller {

    private String name;
    private Piece piece;
    private  Set<Property> propertySet;
    private int balance;
    private int canRoll;
    private int jailCards;

    private Set<Property.ColorGroup> groupSet;




    public void requestTrade (){

    }

    public
    public void buy(){}

    public void

    public boolean hasSufficientFunds( int cost){
        return cost >= balance;
    }


    public boolean isBankrupt(){
        return balance < 0;
    }

    public void updateGroupSet(){

        for( Property.ColorGroup group: Property.ColorGroup.values() ){

            long propsInGroup = propertySet.stream()
                    .filter(p -> p.getGroup() == group)
                    .count();

            if (!groupSet.contains(group) && propsInGroup == group.getGroupSize() ) {
                groupSet.add(group);
            } else if (groupSet.contains(group) && propsInGroup != group.getGroupSize()){
                groupSet.remove(group);
            }

        }

    }


    //-----------------Getters---------------------------------
    public int getJailCards() {
        return jailCards;
    }
    public int getBalance() {
        return balance;
    }
    public Set<Property> getPropertySet() {
        return propertySet;
    }
    public Set<Property.ColorGroup> getGroupSet() {
        return groupSet;
    }

    //----------------Setters------------------------------------
    public void setJailCards(int jailCards) {
        this.jailCards = jailCards;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}
