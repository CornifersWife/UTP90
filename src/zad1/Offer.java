package zad1;

import java.util.*;

public class Offer {
    Locale lokalizacja;
    String kraj; // w jezyku kontrahenta
    Date data_wyjazdu;  //daty w RRRR-MM-DD
    Date data_powrotu;
    String miejsce; // w jezyku kontrahenta
    double cena;
    String symbol_waluty;
    public Offer(String input) {

        String[] data = input.split("\t");
        String[] ToLocale = data[0].split("_");
        lokalizacja = new Locale(ToLocale[0], ToLocale[1]);
        kraj = data[1];
        data_wyjazdu = new Date(data[2]);
        data_powrotu = new Date(data[3]);
        miejsce = data[4];
        cena = Double.parseDouble(data[5]);
        symbol_waluty = data[6];
    }

    public String getPlace() {
        return data[4];
    }

    public double getPrice() {
        return Double.parseDouble(data[5]);
    }

    public String getCurrency() {
        return data[6];
    }
}
