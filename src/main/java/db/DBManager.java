package db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Footballer> footballers = new ArrayList<>();
    private static Long id = 5L;

    static {
        footballers.add(new Footballer(1L, "Vinicius", "Junior", 6000000, "Real Madrid", 700000000));
        footballers.add(new Footballer(2L, "Ruslan", "Malinovskti", 4000000, "Atlanta", 80000000));
        footballers.add(new Footballer(3L, "Askar", "Aidosuly", 8000000, "Napoli", 900000000));
        footballers.add(new Footballer(4L, "Uali", "Junior", 8000000, "Inter", 60000000));
    }
    public  static void addFootballer(Footballer footballer){
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }

    public static ArrayList<Footballer> getFootballers(){
        return footballers;
    }
}
