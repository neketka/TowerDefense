package TowerDefense;

import java.awt.*;

/**
 * Created by nikita on 1/14/2017.
 */
public class SpriteFactory {
    private Image icon;
    private float direction;
    public SpriteFactory(Image icon, float direction) {
        this.icon = icon;
        this.direction = direction;
    }

    public Sprite instance(float x, float y)
    {
        return new Sprite(x, y, icon, direction);
    }
}
