package zad1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class TravelData {
    List<Offer> offers = new ArrayList<>();
    public TravelData(File dataDir) {
        List<String> data_lines;
        for (File f : dataDir.listFiles()) {
            try {
                data_lines = Files.readAllLines(f.toPath());
                for (String data: data_lines) {
                    offers.add(new Offer(data));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> getOffersDescriptionsList(String locale, String dateFormat) {
    return null;
    }
}
