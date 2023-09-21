package model;

import presenter.IModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements IModel {
    private Collection<Table> tables;
    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNumber, String name) {
        for (Table table : loadTables()) {
            if (table.getNumber() == tableNumber) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String name) {
        for (Table table : loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    table.getReservations().remove(reservation);

                    Reservation newReservation = new Reservation(reservationDate, name);
                    table.getReservations().add(newReservation);

                    return newReservation.getId();
                }
            }
        }
        return -1;
    }
}
