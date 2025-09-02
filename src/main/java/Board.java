import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Board {

    private static Board board;
    private Map<Integer, Space> boardMap;

    private Board(){
        boardMap = new HashMap<Integer, Space>();
    }

    public Map<Integer, Space> getBoardMap(){
        return boardMap;
    }

    public void addSpace(int index, Space space){
        boardMap.put(index,space);
    }
    public void removeSpace(int index, Space space){
        boardMap.remove(index,space);
    }

    public void setBoardMap(Map<Integer, Space> boardMap) {
        this.boardMap = boardMap;
    }

    public static Board getBoard(){

        if (board == null){
            board = new Board();
        }
        return board;
    }


}
