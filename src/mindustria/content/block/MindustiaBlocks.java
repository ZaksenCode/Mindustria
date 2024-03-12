package mindustria.content.block;

import mindustria.content.block.defence.MindustriaDefenceBlocks;
import mindustria.content.block.enviroment.MindustriaEnvironmentBlocks;
import mindustria.content.block.production.MindustriaProductionBlocks;

public class MindustiaBlocks {

    private MindustiaBlocks() {
        // Ignore
    }

    public static void init() {
        MindustriaDefenceBlocks.init();
        MindustriaEnvironmentBlocks.init();
        MindustriaProductionBlocks.init();
    }
}