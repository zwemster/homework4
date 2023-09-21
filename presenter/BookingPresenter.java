package presenter;

import model.Table;

import java.util.Collection;

public class BookingPresenter {
    private IModel tableModel;
    private IView bookingView;

    public BookingPresenter(IModel tableModel, IView bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
    }

    public Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void updateReservationResultUI(int reservationId) {
        bookingView.printReservationTableResultUI(reservationId);
    }
}
