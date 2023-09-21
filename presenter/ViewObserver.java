package presenter;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNumber, String name);
}
