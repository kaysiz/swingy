package za.co.swingy.controller;

import za.wtc.swingy.model.hero.Hero;
import za.wtc.swingy.view.MapView;

import static za.wtc.swingy.tools.Log.*;
import static za.wtc.swingy.tools.Log.log;

/**
 * MapFactory
 * 
 * @author  Thapelo Masethe
 */
public class MapFactory {

    public static MapView generateMap(Hero hero) {
        int mapSize = (hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2);
        
        if (mapSize >= 25) {
            mapSize = 25;
        }
        MapView map = new MapView(mapSize);
        map.registerHero(hero);
        map.spreadEnemies();
        log("Level: " + hero.getLevel() + "; Mapsize: " + mapSize);
        return (map);
    }
}