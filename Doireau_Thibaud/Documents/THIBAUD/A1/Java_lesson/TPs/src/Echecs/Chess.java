package Echecs;

import Echecs.Piece.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chess {
    Cell[][] board;
    Players[] players;
    Players currentPlayer; //identifier le joueur en cours

    public void play(){
        //démarre une partie
        while(true){
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()){
                printBoard();
                String move;
                do{
                    move = askMove();
                }while(!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }

    private void createPlayers(){
        Scanner scanner = new Scanner(System.in);
        //demande au joueur de rentrer un nom et instancie de objet de type Player.
        System.out.println("Joueur 1: choisissez un nom");
        String name_player_one = scanner.nextLine();
        Players players1 = new Players();
        players1.addName(name_player_one);
        players1.attributeColor(0);

        System.out.println("Joueur 2: saisissez un nom");
        String name_players_two = scanner.nextLine();
        Players players2 = new Players();
        players2.addName(name_players_two);
        players2.attributeColor(1);

        currentPlayer = players1;
        //Initialiser la valeur de currentPlayers (blanc)
    }

    private void initialiseBoard(){
        //initialisation du plateau
        Cell[][] board = new Cell[8][8];

        System.out.print(board);

        for (int k = 1; k<=8; k++){
            //board[2][k]= new Pawn();
        }

        //initialisation des pions du blanc
//        King king0 = new King();
//        king0.position.column='e';
//        king0.position.row = 1;
//
//        Queen queen0 = new Queen();
//        queen0.position.column="d";
//        queen0.position.row=1;
//
//        Bishop bishop01 = new Bishop();
//        bishop01.position.column="c";
//        bishop01.position.row=1;
//
//        Bishop bishop02 = new Bishop();
//        bishop02.position.column="f";
//        bishop02.position.row=1;
//
//        Knight knight01 = new Knight();
//        knight01.position.column="b";
//        knight01.position.row=1;
//
//        Knight knight02 = new Knight();
//        knight02.position.column="g";
//        knight02.position.row=1;
//
//        Rook rook01 = new Rook();
//        rook01.position.column="a";
//        rook01.position.row=1;
//
//        Rook rook02 = new Rook();
//        rook02.position.column="h";
//        rook02.position.row=1;
//
//        Pawn pawn01 = new Pawn();
//        pawn01.position.column="a";
//        pawn01.position.row=2;
//
//        Pawn pawn02 = new Pawn();
//        pawn02.position.column="b";
//        pawn02.position.row=2;
//
//        Pawn pawn03 = new Pawn();
//        pawn03.position.column="c";
//        pawn03.position.row=2;
//
//        Pawn pawn04 = new Pawn();
//        pawn04.position.column="d";
//        pawn04.position.row=2;
//
//        Pawn pawn05 = new Pawn();
//        pawn05.position.column="e";
//        pawn05.position.row=2;
//
//        Pawn pawn06 = new Pawn();
//        pawn06.position.column="f";
//        pawn06.position.row=2;
//
//        Pawn pawn07 = new Pawn();
//        pawn07.position.column="g";
//        pawn07.position.row=2;
//
//        Pawn pawn08 = new Pawn();
//        pawn08.position.column="h";
//        pawn08.position.row=2;
//
//        List<Pieces> whitePieces = new ArrayList<>();
//        whitePieces.add(king0);
//        whitePieces.add(queen0);
//        whitePieces.add(bishop01);
//        whitePieces.add();
//
//
//
//        //initialisation des pions du noir
//        King king1 = new King();
//        king1.position.column="e";
//        king1.position.row = 8;
//
//        Queen Queen1 = new Queen();
//        Queen1.position.column="d";
//        Queen1.position.row=8;
//
//        Bishop bishop11 = new Bishop();
//        bishop11.position.column="c";
//        bishop11.position.row=8;
//
//        Bishop bishop12 = new Bishop();
//        bishop12.position.column="f";
//        bishop12.position.row=8;
//
//        Knight knight11 = new Knight();
//        knight11.position.column="b";
//        knight11.position.row=8;
//
//        Knight knight12 = new Knight();
//        knight12.position.column="g";
//        knight12.position.row=8;
//
//        Rook rook11 = new Rook();
//        rook11.position.column="a";
//        rook11.position.row=8;
//
//        Rook rook12 = new Rook();
//        rook12.position.column="h";
//        rook12.position.row=8;
//
//        Pawn pawn11 = new Pawn();
//        pawn11.position.column="a";
//        pawn11.position.row=7;
//
//        Pawn pawn12 = new Pawn();
//        pawn12.position.column="b";
//        pawn12.position.row=7;
//
//        Pawn pawn13 = new Pawn();
//        pawn13.position.column="c";
//        pawn13.position.row=7;
//
//        Pawn pawn14 = new Pawn();
//        pawn14.position.column="d";
//        pawn14.position.row=7;
//
//        Pawn pawn15 = new Pawn();
//        pawn15.position.column="e";
//        pawn15.position.row=7;
//
//        Pawn pawn16 = new Pawn();
//        pawn16.position.column="f";
//        pawn16.position.row=7;
//
//        Pawn pawn17 = new Pawn();
//        pawn17.position.column="g";
//        pawn17.position.row=7;
//
//        Pawn pawn18 = new Pawn();
//        pawn18.position.column="h";
//        pawn18.position.row=7;
//        // initialise l'échiquier

    }

    private void printBoard(){
        //afficher l'état actuel de l'échiqier
    }

    private String askMove(){
        Scanner scanner = new Scanner(System.in);
        //demander au joueur en cours de saisir son prochain coup, en spécifiant la pièce à déplacer puis le nouvel emplacement
        System.out.println("Saisissez votre prochain déplacement sous la forme : Pcl (Piece/colonne/ligne) Pnn(Piece/nouvelle_col/ nouvelle_lign");
        return scanner.nextLine();
    }

    private boolean isCheckMate(){
        //déterminer si un joueur  est echec et mate
        return false;
    }

    private boolean isValidMove(String move){
        //demander à l'utilisateur de saisir le déplacement au bon format
        char typePiece = move.charAt(0);
        char lastColumn = move.charAt(1);
        int lastRow = move.charAt(2);

        char newPiece = move.charAt(3);
        int newRow = move.charAt(4);

        if (typePiece == 'Q'){
            Pieces selectedPiece = null;
            //for (Pieces pieces : )
        }
        //va ensuite appeler la méthode isValidMove() de la class de la pièce correspondante

        return false;
    }


    private void updateBoard(String move){
        //mettre à jour l'échiquier suite au coup qui vient de finir
    }

    private void switchPlayer(){
        //changer la valeur de currentPlayer
    }


}
