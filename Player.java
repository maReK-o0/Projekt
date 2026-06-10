import greenfoot.*;  

public class Player extends Actor
{
    int speed = 4;
    public int keys = 0;
    public int hp = 5; 

    public void act()
    {
        int oldX = getX();
        int oldY = getY();  

        if (Greenfoot.isKeyDown("w")) setLocation(getX(), getY() - speed);
        if (Greenfoot.isKeyDown("s")) setLocation(getX(), getY() + speed);
        if (Greenfoot.isKeyDown("a")) setLocation(getX() - speed, getY());
        if (Greenfoot.isKeyDown("d")) setLocation(getX() + speed, getY());
            
        if (isTouching(Stena.class)) setLocation(oldX, oldY);

        if (isTouching(Key.class)) {
            Actor klic = getOneIntersectingObject(Key.class);
        if (klic != null && klic.getWorld() != null) {
                removeTouching(Key.class); 
                keys++;                    
                MyWorld svet = (MyWorld) getWorld();
                if (svet != null){ 
                    svet.spawnovatKameny = true; 
                    }
        }

        if ((isTouching(Door.class) && keys >= 3) || hp <= 0) {
            Greenfoot.setWorld(new KonecSveta());
            Greenfoot.stop(); 
        }
        }
    }
}