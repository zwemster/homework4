package model;

import java.util.Date;
import java.util.zip.DataFormatException;

public class Reservation {
    private static int counter = 10;
    private final int id;
    private Date date;
    private String name;

    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
