import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.*;

public class DrawMyRect extends JPanel
{
    public void paint(Graphics g){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur");
        int longueur = scanner.nextInt();
        System.out.println("Entrez la largeur");
        int largeur = scanner.nextInt();

        g.drawRect(35, 35, longueur, largeur);
    }

    public static void main(String[] args){

        JFrame f = new JFrame("Dessiner un rectangle");
        f.getContentPane().add(new DrawMyRect());
        f.setSize(500, 400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}