import java.util.Scanner;
import java.awt.Graphics;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Instantiation de l'objet scanner
        Scanner scanner = new Scanner(System.in);
        //Déclaration des deux variables par la fonction nextInt et nextFloat
        /*
        int unEntier = 0;
        float unReel = scanner.nextFloat();

        while(unEntier!=2){
            System.out.println("Veuillez entrer un 2");
            unEntier = scanner.nextInt();
        }
        //Affichage dans la console des chaine de caractères pour introduire puis afficher les bonnes valeurs
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);



        System.out.println(" Bonjour,\n" + "quel est votre prénom ?");

        String prenom = scanner.next();

        System.out.println("Bienvenue " + prenom);
        */
        division();
        somme();
        volume();


    }


    public static void somme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxièmeEntier = scanner.nextInt();

        System.out.println("La somme de " + premierEntier + "et"+ deuxièmeEntier+ " donne " + (premierEntier + deuxièmeEntier));

    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier float");
        float premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième float");
        float deuxièmeEntier = scanner.nextInt();
        float sommeEntier = premierEntier / deuxièmeEntier;
        System.out.println("La division de " + premierEntier + " et de " + deuxièmeEntier + " donne " + sommeEntier);
    }

    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Longueur");
        float longueur = scanner.nextInt();
        System.out.println("largeur");
        float largeur = scanner.nextInt();
        System.out.println("Hauteur");
        float hauteur = scanner.nextInt();
        float vol = longueur * largeur * hauteur ;
        System.out.println("Le volume correspondant est " + vol);
    }



}