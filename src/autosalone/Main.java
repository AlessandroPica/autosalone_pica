package autosalone;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Autosalone a1 = new Autosalone();
        Autosalone a2 = new Autosalone();
        Autosalone a3 = new Autosalone();
        Autosalone a4 = new Autosalone();
        Scanner in = new Scanner(System.in);

        System.out.println("inserisci la marca della prima auto: ");
        String marca1 = in.next();
        a1.setMarca(marca1);
        System.out.println("inserisci il modello della prima auto: ");
        String modello1 = in.next();
        a1.setModello(modello1);
        System.out.println("inserisci il prezzo della prima auto: ");
        double prezzo1 = in.nextDouble();
        a1.setPrezzo(prezzo1);

        System.out.println("inserisci la marca della seconda auto: ");
        marca1 = in.next();
        a2.setMarca(marca1);
        System.out.println("inserisci il modello della seconda auto: ");
        modello1 = in.next();
        a2.setModello(modello1);
        System.out.println("inserisci il prezzo della seconda auto: ");
        prezzo1 = in.nextDouble();
        a2.setPrezzo(prezzo1);

        System.out.println("inserisci la marca della terza auto: ");
        marca1 = in.next();
        a3.setMarca(marca1);
        System.out.println("inserisci il modello della terza auto: ");
        modello1 = in.next();
        a3.setModello(modello1);
        System.out.println("inserisci il prezzo della terza auto: ");
        prezzo1 = in.nextDouble();
        a3.setPrezzo(prezzo1);


        System.out.println("la prima auto è: "+ a1.getMarca() +" "+ a1.getModello() +" "+ a1.getPrezzo());
        System.out.println("la seconda auto è: "+ a2.getMarca() +" "+ a2.getModello() +" "+ a2.getPrezzo());
        System.out.println("la terza auto è: "+ a3.getMarca() +" "+ a3.getModello() +" "+ a3.getPrezzo());
    }
}
