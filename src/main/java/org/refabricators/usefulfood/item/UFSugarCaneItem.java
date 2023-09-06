package org.refabricators.usefulfood.item;

import org.refabricators.usefulfood.block.UFCakeBlock;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class UFSugarCaneItem extends UFBlockItem {
    String name;

    public UFSugarCaneItem(UFCakeBlock cakeBlock) {
        super(cakeBlock, new FabricItemSettings().maxCount(1));
    }
    
}
