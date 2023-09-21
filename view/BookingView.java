package view;

import model.Table;
import presenter.IView;

import java.util.Collection;

public class BookingView implements IView {
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
}
