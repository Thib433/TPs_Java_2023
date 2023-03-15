package Echecs.Piece;

import Echecs.Cell;
import Echecs.Position;

public abstract class Pieces {
    // on note la visibilité des attributs définies a protected
    public Position position;
    protected int color;


    public abstract boolean isValidMove(Position position, Cell[][] board);
    public abstract String toString();
}



