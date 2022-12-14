package zad1;

import java.util.*;

public class Offer {
    Locale locale;
    
    public Offer(String input) {

        String[] data = input.split("\t");
        String[] ToLocale = data[0].split("_");
        locale = new Locale(ToLocale[0], ToLocale[1]);

    }

    public Locale getLocale() {
        return
                new Locale() data[0];
    }

    public String getCountry() {
        return data[1];
    }

    public String getDateStart() {
        return data[2];
    }

    public String getDateEnd() {
        return data[3];
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
