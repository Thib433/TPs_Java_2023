package Echecs;

import Echecs.Piece.Pieces;

public class Cell {
    public Pieces pieces;
    public Position position;
    boolean isEmpty ;
    //ajouter un attribut qui permet de spécifier la pièce qui se trouve sur cette case

    public Position getPosition(){
        return position;
    }

    public Pieces getPieces(){
        return pieces;
    }

    public void setPieces(Pieces newPiece){
        pieces = newPiece;
        this.isEmpty=false;
    }
    public Pieces currentPiece ;
}
