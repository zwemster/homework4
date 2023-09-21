package model;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;
    private final int number;

    {
        number = ++counter;
    }

    public int getNumber() {
        return number;
    }

    private final Collection<Reservation> reservations = new ArrayList<>();

    @Override
    public String toString() {
        return String.format("Столик #%d.", number);
    }
}
