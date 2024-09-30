package autosalone;

public class Autosalone{
    private String marca;
    private String modello;
    private double prezzo;

    //metodi set
    public void setMarca(String marca1){
        marca = marca1;
    }
    public void setModello(String modello1){
        modello = modello1;
    }
    public void setPrezzo(double prezzo1){
        prezzo = prezzo1;
    }

    //metodi get
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public double getPrezzo(){
        return prezzo;
    }

    //costruttori
    public Autosalone (String marca1, String modello1, double prezzo1){
        marca = marca1;
        modello = modello1;
        prezzo = prezzo1;
    }

    //costruttore senza parametri
    public Autosalone (){
        marca = " ";
        modello = " ";
        prezzo = 0.0;
    }
}