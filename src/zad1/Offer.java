package zad1;

public class Offer {
    String[] data;
    public Offer(String input){
        data = input.split("\t");
    }

    public String getLocale() {
        return data[0];
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
