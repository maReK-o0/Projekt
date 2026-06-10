import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    protected void addedToWorld(World world)
    {
        int x = Greenfoot.getRandomNumber(90) * 20 + 30;
        int y = Greenfoot.getRandomNumber(50) * 20 + 30;
        
        setLocation(x, y);
        
        if (isTouching(Stena.class)) {
            x = Greenfoot.getRandomNumber(90) * 20 + 30;
            y = Greenfoot.getRandomNumber(50) * 20 + 30;
            setLocation(x, y);
        }
        if (isTouching(Stena.class)) {
            x = Greenfoot.getRandomNumber(90) * 20 + 30;
            y = Greenfoot.getRandomNumber(50) * 20 + 30;
            setLocation(x, y);
        }
    }
    public void act()
    {
        // Add your action code here.
    }
}
