package presenter;

import model.Table;
import java.util.Collection;

public interface IView {
    void printReservationTableResultUI(int reservationNumber);
    void showTables(Collection<Table> tables);
}
