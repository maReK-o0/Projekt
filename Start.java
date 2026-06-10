import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        super(1700, 950, 1); 
        setBackground(new GreenfootImage("Start.png")); 
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("z")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
