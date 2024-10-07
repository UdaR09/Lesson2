package main.java.com.trimetrica;

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