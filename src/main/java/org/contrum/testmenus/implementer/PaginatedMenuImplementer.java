package org.contrum.testmenus.implementer;

import com.google.common.collect.Lists;
import org.bukkit.entity.Player;
import org.contrum.chorpu.chat.CC;
import org.contrum.chorpu.inventory.ItemBuilder;
import org.contrum.chorpu.menu.MenuManager;
import org.contrum.chorpu.menu.button.FixedButton;
import org.contrum.chorpu.menu.clicker.ButtonClickHandler;
import org.contrum.chorpu.menu.clicker.ButtonReplacementHandler;
import org.contrum.chorpu.menu.clicker.ButtonVisibilityHandler;
import org.contrum.chorpu.menu.implementer.MenuImplementer;
import org.contrum.chorpu.xseries.XMaterial;

import java.util.List;
import java.util.Map;

public class PaginatedMenuImplementer extends MenuImplementer {

    public PaginatedMenuImplementer(MenuManager manager) {
        super(manager);
    }

    @Override
    public String getMenuIdentifier() {
        return "EXAMPLE_PAGINATED";
    }

    @Override
    public List<FixedButton> getPaginatedButtons(Player player) {
        List<FixedButton> buttons = Lists.newArrayList();

        for(int i = 1; i <= 50; i++) {
            int finalI = i;

            buttons.add(FixedButton.of(ItemBuilder.of(XMaterial.PAPER)
                    .setName(CC.YELLOW + "Index #" + i)
                    .toItemStack(), (clicker, type) -> {
                clicker.sendMessage("You clicked index #" + finalI + "!");
            }));
        }

        return buttons;
    }

    @Override
    public Map<String, ButtonReplacementHandler> getReplacerHandlers() {
        return null;
    }

    @Override
    public Map<String, ButtonVisibilityHandler> getVisibilityHandlers() {
        return null;
    }

    @Override
    public Map<String, ButtonClickHandler> getButtonHandlers() {
        return null;
    }
}
