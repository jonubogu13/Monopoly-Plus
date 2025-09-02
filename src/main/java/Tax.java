public class Tax extends Space{

    private int value;


    public Tax (String name, int index, Group group, int value){
        super(name, index, group);
        this.value = value;

        Board.getBoard().addSpace(index, (Space) this);
    }




}
