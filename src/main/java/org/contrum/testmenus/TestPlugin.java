package org.contrum.testmenus;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.contrum.chorpu.chat.CC;
import org.contrum.chorpu.drink.CommandService;
import org.contrum.chorpu.drink.Drink;
import org.contrum.chorpu.menu.MenuManager;

@Getter
public class TestPlugin extends JavaPlugin {

    private MenuManager menuManager;

    @Override
    public void onEnable() {
        this.menuManager = new MenuManager(this);

        menuManager.register(new ExampleMenu());
        menuManager.register(new ExamplePaginatedMenu());

        menuManager.registerHandlersInPackage("org.contrum.testmenus.implementer");

        // menuManager.registerClickHandler("Example", "TEST",
        //        (player, type) -> player.sendMessage(CC.RED + "Hi!"));

        CommandService service = Drink.get(this);
        menuManager.registerProvider(service);

        service.register(new ExampleCommand(this), "example");
        service.registerCommands();
    }

    @Override
    public void onDisable() {
        menuManager.save();
    }
}
