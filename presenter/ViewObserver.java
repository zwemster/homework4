package presenter;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNumber, String name);
    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String name);
}
