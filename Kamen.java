import greenfoot.*;

public class Kamen extends Actor
{
    private int rychlost = 5; 

    public void act()
    {
        setLocation(getX(), getY() + rychlost);
        if (isTouching(Player.class)) {
            Player hrac = (Player) getOneIntersectingObject(Player.class);
            if (hrac != null) {
                hrac.hp--; 
            }
            getWorld().removeObject(this);
            return; 
        }
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}