package Echecs.Piece;

import Echecs.Cell;
import Echecs.Position;

public class Queen extends Pieces {
    @Override

    public boolean isValidMove(Position newPosition, Cell[][] board){
        int startRow = newPosition.row;
        //String startColumn = newPosition.column;
        //int finRow = board.position[0]; //créer l'attribut board et donc le reste de des classes
        Cell[] finColumn = board[2];

        if ((startRow <= 1) | (startRow >= 8) ){ //(startColumn <= "a") | (startColumn >= "h")){

        }


        return false;
    }
    @Override
    public String toString(){

        return "Q";
    }

}
