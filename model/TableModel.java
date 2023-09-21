package model;

import presenter.IModel;

import java.util.ArrayList;
import java.util.Collection;

public class TableModel implements IModel {
    private Collection<Table> tables;
    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }
}
