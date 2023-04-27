package Echecs;

public class Position {
    public char column; //colonne
    public int row;//ligne

    public static void main(String[] args){

    }

    /*public String toString(){

        return column+row;
    }*/

    public int translate(char a){
        switch (a){
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                break;
        }

        return 0;
    }
}
