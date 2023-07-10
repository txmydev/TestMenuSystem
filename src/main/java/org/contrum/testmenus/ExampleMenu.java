package org.contrum.testmenus;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.contrum.chorpu.menu.button.Button;
import org.contrum.chorpu.menu.storage.StorageMenu;

public class ExampleMenu extends StorageMenu {

    public ExampleMenu() {
        super("Example");

        this.setRows(6);

        this.getButtons().add(new Button(
                "TEST",
                13,
                new ItemStack(Material.ARROW),
                true,
                true
        ));
    }
}
