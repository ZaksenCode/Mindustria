package mindustria.content.item;

import mindustry.type.Item;

public class MindustriaItems {

    public static Item empty_can, red_can, green_can, blue_can, yellow_can;


    public static void init() {
        empty_can = new Item("empty_can");
        red_can = new Item("red_can");
        green_can = new Item("green_can");
        blue_can = new Item("blue_can");
        yellow_can = new Item("yellow_can");
    }
}
