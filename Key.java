import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
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
}
