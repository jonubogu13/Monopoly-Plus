import java.util.Map;

public class Property extends Space {

    private int value;
    private int mortgage;
    private int rent;
    private boolean isMortgaged;

    public Property (String name, int index, Group group, int value, int mortgage, int rent) {
        super(name, index, group);
        this.value = value;
        this.mortgage = mortgage;
        this.rent = rent;
        this.isMortgaged = false;

        //lazy initialization of board spaces into the board; very unnecessary but good practice
        Board.getBoard().addSpace(index, (Space) this);
    }








    //--------------Getters------------------------
    public int getValue(){
        return value;
    }
    public int getMortgage(){
        return mortgage;
    }
    public int getRent(){
        return rent;
    }

    //--------------Setters------------------------
    public void setValue(int value){
        this.value = value;
    }
    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
}
