package view;

import model.Table;
import presenter.IView;
import presenter.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements IView {
    private ViewObserver observer;

    public void reservationTable(Date orderDate, int tableNumber, String name) {
        observer.onReservationTable(orderDate, tableNumber, name);

    }
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String name) {
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNumber, name);
    }
    @Override
    public void printReservationTableResultUI(int reservationNumber) {
        if (reservationNumber > 0) {
            System.out.printf("\nСтолик успешно забронирован. Номер Вашего бронирования: %d.\n", reservationNumber);
        }
        else {
            System.out.println("\nНе удалось забронировать столик. Попробуйте выполнить операцию позднее.\n");
        }
    }
    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }
}
