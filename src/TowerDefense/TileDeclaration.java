package TowerDefense;

import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by nikita on 1/14/2017.
 */
public class TileDeclaration {
    private HashMap<Integer, TileProperties> tiles;
    public TileDeclaration()
    {
        this.tiles = new HashMap<Integer, TileProperties>();
    }

    public void addTile(int id, SpriteFactory sf, boolean empty, boolean holdsTurret)
    {
        TileProperties prop = new TileProperties();
        prop.spriteFactory = sf;
        prop.holdTurrets = holdsTurret;
        prop.isEmpty = empty;
        tiles.put(id, prop);
    }

    public SpriteFactory getSpriteFactory(int id)
    {
        return tiles.get(id).spriteFactory;
    }

    public boolean canHoldTurret(int id) {
        return tiles.get(id).holdTurrets;
    }

    public  boolean isEmpty(int id) {
        return tiles.get(id).isEmpty;
    }
}

class TileProperties {
    public TileProperties() {}
    public boolean isEmpty;
    public boolean holdTurrets;
    public SpriteFactory spriteFactory;
}
