import model.TableModel;
import presenter.BookingPresenter;
import view.BookingView;

public class Main {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();
    }
}