package view;

import presenter.IView;

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
}
