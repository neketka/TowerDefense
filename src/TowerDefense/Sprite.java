package TowerDefense;

import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by nikita on 1/14/2017.
 */
public class Sprite {
    private float x, y;
    private float scalex, scaley;
    private float direction;
    private Image icon;
    private Sprite parent = null;
    public Sprite(float x, float y, Image img, float dir) {
        this.x = x;
        this.y = y;
        this.icon = img;
        this.direction = dir;
    }

    public void attach(Sprite parent)
    {
        this.parent = parent;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getScaleX() {
        return scalex;
    }

    public void setScaleX(float scale) {
        this.scalex = scale;
    }

    public float getScaleY() {
        return scaley;
    }

    public void setScaleY(float scale) {
        this.scaley = scale;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public AffineTransform getTransform()
    {
        AffineTransform af = new AffineTransform();
        af.rotate(-direction * Math.PI / 180);
        af.translate(x, y);
        af.scale(scalex, scaley);
        if (parent != null)
            af.concatenate(parent.getTransform());
        return af;
    }
}
