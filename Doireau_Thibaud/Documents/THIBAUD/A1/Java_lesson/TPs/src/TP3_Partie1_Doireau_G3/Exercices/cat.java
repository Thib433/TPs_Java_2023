package TP3_Partie1_Doireau_G3.Exercices;

public class cat {
    public static void drawCat(int height, int width){
        String front = "---";
        String museau ="-";
        String menton = "^";
        String joue = "|";
        for (int k=1; k<=height; k++){
             front += "--";
             museau +="--";
             menton +="^^";
        }
        System.out.println("|\\"+front+"/|");

        for (int i = 1; i<=width; i++){
            System.out.print("|");
            for (int k=1; k<=height+6; k++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("| o"+museau+"o |");
        for (int i = 1; i<=width; i++){
            System.out.print("|");
            for (int k=1; k<=height+6; k++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println(" \\_"+menton+"_/ ");

    }
}
