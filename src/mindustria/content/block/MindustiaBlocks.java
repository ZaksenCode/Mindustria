package mindustria.content.block;

import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.Turret;

public final class MindustiaBlocks {

    public static Block test;

    public static void init() {
        test = new Turret("Test");
    }
}