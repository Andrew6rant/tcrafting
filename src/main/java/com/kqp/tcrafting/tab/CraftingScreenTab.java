package com.kqp.tcrafting.tab;

import com.kqp.inventorytabs.tabs.tab.Tab;
import com.kqp.tcrafting.init.TCrafting;
import com.kqp.tcrafting.init.TCraftingClient;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Util;

public class CraftingScreenTab extends Tab {
    protected CraftingScreenTab() {
        super(new ItemStack(Blocks.CRAFTING_TABLE));
    }

    @Override
    public void open() {
        TCraftingClient.triggerOpenCraftingMenu();
    }

    @Override
    public boolean shouldBeRemoved() {
        return false;
    }

    @Override
    public Text getHoverText() {
        return new TranslatableText(Util.createTranslationKey("gui", TCrafting.id("crafting")));
    }

    @Override
    public int getPriority() {
        return 99;
    }
}
