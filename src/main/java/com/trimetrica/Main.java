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
