package TP2_Doireau_G3D;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        //parite();
        //discriminant();
        //max();
        //egaliteStr();
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        //nombrePremier();
        tableMultiplication();
    }



    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b,2) -4 * a * c);

        float rZero = 0;
        float rUn = 0;
        float rDeux = 0;

        float Real = 0;
        float Im = 0;



        if (delta<0){
            Real = -b/(2*a);
            Im = (float) (Math.sqrt(-delta) / 2 * a);
            System.out.println("Ce polynome a deux racines complexes : "+ Real+"+i"+Im+ " et "+Real+"-i"+Im);
        }else if(delta==0){
            rZero = -b / (2*a);
            System.out.println("On a une racine double : " + rZero);

        }else {
            rUn = (float) (-b + Math.sqrt(delta))/2*a;
            rDeux = (float) (-b - Math.sqrt(delta))/2*a;
            System.out.println("On a deux racines réelles " + rUn + " et " + rDeux);

        }


    }
    public static void parite(){
        System.out.println("entrez un nombre");
        Scanner scanner = new Scanner(System.in);
        int entier = scanner.nextInt();
        if (entier%2==0){
            System.out.println(entier+" est pair");
        }else{
            System.out.println(entier+" est impair");
        }
    }

    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez deux entiers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = 0;
        if (a>b){
            max = a;
        }else if (a<b){
            max = b;
        }else {
            System.out.println("Les deux chiffres sont égaux");
        }

        System.out.println("Le maximum est "+max);
    }



    public static void egaliteStr(){
        System.out.println("Saisissez deux chaine de caractère");
        Scanner scanner = new Scanner(System.in);
        String fstChaine = scanner.next();
        String sndChaine = scanner.next();
        System.out.println("Même chaine ? "+fstChaine.equals(sndChaine));
    }

    public static void factorielle(){
        Scanner scanner = new Scanner (System.in);
        int factorielle = 1;
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++ ){
            factorielle*=i;

        }
        System.out.println(n + "! = " + factorielle);

    }

    public static void countdown(){

        for (int i = 10; i >=0; i--){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);

        }
        System.out.println("BOOM");
    }

    public static void carres(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Saisissez un nombre strictement positif");
        float x = scanner.nextFloat();
        System.out.println("X et son carré : "+x+ " et "+ (x*x));
    }

    //Table de multiplication : le type de boucle le plus approprié est la boucle for car on sait déjà jusquà quelle chiffre on veut aller

    public static void tableMultiplication(){
        for (int i = 1; i<=10; i++){
            for (int k = 1; k<=10; k++){
                System.out.print(" "+i*k);

            }
            System.out.println("\t");

        }
    }

    public static void division(){
        Scanner scanner = new Scanner (System.in);
        int int1 ;
        int int2 ;
        do{
            System.out.println("Saisissez deux entier différents de 0");
            int1 = scanner.nextInt();
            int2 = scanner.nextInt();
        }while(int2==0);
        int total = int1/int2;
        System.out.println("Le résultats de la division d'entier de "+int1+" et "+int2+" donne "+total);


    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int val;
        int k = 1;

        do {
            System.out.println("Saisissez une valeur entière strictement positive");
            val = scanner.nextInt();
        } while (val <= 0);

        for (int i = 1; i<=val; i++){

            if (k==10){
                System.out.print("-"+"|");
                k = 1;
            }else{
                System.out.print("-");
                k+=1;
            }

        }
    }

    public static void nombrePremier(){
        Scanner scanner = new Scanner(System.in);
        int val;
        do{
            System.out.println("Saisissez un une valeur entière strictement positif");
            val = scanner.nextInt();
        }while(val<=0);

        // dijonction de cas

        if (val == 2){
            System.out.println("Ce nombre est premier");

        } else {
            for (int k= 2; k<=val; k++){
                if (val % k == 0) {
                    System.out.println("Ce nombre n'est pas premier");
                    break;
                }
            }

        }System.out.println("Ce nombre est premier");



    }
}