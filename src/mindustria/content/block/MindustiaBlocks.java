package mindustria.content.block;

import arc.struct.ObjectMap;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

public final class MindustiaBlocks {

    private static final ObjectMap<String, Block> blocks = new ObjectMap<>();

    public static void init() {
        createBlock(
                "test",
                new Wall("test")
        );
    }

    private static void createBlock(String name, Block block) {
        blocks.put(name, block);
    }

    public static Block getBlock(String name) {
        return blocks.get(name);
    }
}