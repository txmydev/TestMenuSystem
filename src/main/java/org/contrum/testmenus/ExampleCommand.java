package org.contrum.testmenus;

import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.contrum.chorpu.drink.annotation.Command;
import org.contrum.chorpu.drink.annotation.Sender;
import org.contrum.chorpu.menu.storage.StorageMenu;

@RequiredArgsConstructor
public class ExampleCommand {

    private final TestPlugin plugin;

    @Command(name = "", desc = "")
    public void root(@Sender Player player) {
        plugin.getMenuManager().open(player, "Example");
    }

    @Command(name = "paginated", desc = "")
    public void paginated(@Sender Player player) {
        plugin.getMenuManager().open(player, "EXAMPLE_PAGINATED");
    }

    @Command(name = "edit", desc = "")
    public void edit(@Sender Player player, StorageMenu menu) {
        plugin.getMenuManager().edit(player, menu);
    }

}
