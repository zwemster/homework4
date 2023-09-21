package presenter;

import model.Table;
import java.util.Collection;
import java.util.Date;

public interface IModel {
    Collection<Table>loadTables();
    int reservationTable(Date reservationDate, int tableNumber, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String name);
}
