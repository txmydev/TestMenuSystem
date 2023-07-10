package org.contrum.testmenus;

import org.contrum.chorpu.menu.storage.StorageMenu;
import org.contrum.chorpu.menu.storage.paginated.PaginatedData;

public class ExamplePaginatedMenu extends StorageMenu {

    public ExamplePaginatedMenu() {
        super("EXAMPLE_PAGINATED");

        this.setRows(5);
        this.setTitle("Example Paginated");

        PaginatedData paginated = new PaginatedData();

        paginated.setStart(10);
        paginated.setEnd( (this.getRows() - 1) * 9 - 2);
        paginated.setPaginated(true);

        this.setPaginatedData(paginated);
    }
}
