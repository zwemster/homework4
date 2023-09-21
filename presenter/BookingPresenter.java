package presenter;

import model.Table;
import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{
    private IModel tableModel;
    private IView bookingView;

    public BookingPresenter(IModel tableModel, IView bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTables(){
        return tableModel.loadTables();
    }
    public void updateReservationResultUI(int reservationId) {
        bookingView.printReservationTableResultUI(reservationId);
    }
    public void updateTablesUI() {
        bookingView.showTables(loadTables());
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNumber, String name) {
        int reservationNumber = tableModel.reservationTable(orderDate, tableNumber, name);
        updateReservationResultUI(reservationNumber);
    }
    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNumber, String name) {
        int newReservationNumber = tableModel.changeReservationTable(oldReservation, reservationDate, tableNumber, name);
        updateReservationResultUI(newReservationNumber);
    }
}
