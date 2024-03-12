package mindustria;

import arc.*;
import arc.util.*;
import mindustria.content.block.MindustiaBlocks;
import mindustria.content.item.MindustriaItems;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Mindustria extends Mod {

    public Mindustria(){
        //listen for game load event

        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Welcome to mindustria!");
                dialog.cont.add("Thank you for downloading mindustria!").row();
                dialog.cont.add("This is alpha version, Good luck!").row();
//                mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
//                dialog.cont.image(Core.atlas.find("mindustria-frog")).pad(20f).row();
                dialog.cont.button("Ok", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.debug("Loading mindustria content!");


        MindustriaItems.init();

        MindustiaBlocks.init();


    }

}
