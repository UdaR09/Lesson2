package main.java.com.trimetrica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car car = new Car(true, 'A', (short) 2018, (byte) 1, 100000101, (float)23.2, 50000, 25000, "BMW M2");
        car.afisareDate();
    }
}
class Car{
    boolean inStock;
    char clasa;
    short anulFabricarii;
    byte numarProprietari;
    long codIdentificare;
    float consumPe100Km;
    double pret;
    int kilometraj;
    String denumireAutomobil;

    public Car(boolean inStock, char clasa, short anulFabricarii, byte numarProprietari, long codIdentificare, float consumPe100Km, double pret, int kilometraj, String denumireAutomobil) {
        this.inStock = inStock;
        this.clasa = clasa;
        this.anulFabricarii = anulFabricarii;
        this.numarProprietari = numarProprietari;
        this.codIdentificare = codIdentificare;
        this.consumPe100Km = consumPe100Km;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.denumireAutomobil = denumireAutomobil;

    }

    void afisareDate(){
        String stock;

        if (inStock)
            stock = "In stock";
        else stock = "Outstock";

        System.out.println("\nAfisare date automobil " + codIdentificare + "\nDenumire: " + denumireAutomobil + "\nClasa: " + clasa + "\nAnul Fabricarii: " + anulFabricarii + "\nConsumul pe 100 kilometri: " + consumPe100Km + " litri"+
                "\nKilometraj: " + kilometraj + " Kilometri" + "\nNumar proprietari: " + numarProprietari + "\nÎn stock: " + stock + "\nPret: " + pret + " USD");
    }
}