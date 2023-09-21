import model.TableModel;
import presenter.BookingPresenter;
import view.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();

        view.reservationTable(new Date(),3, "Максим Андреич");

        view.changeReservationTable(101, new Date(), 1, "Максим Андреич");
    }
}