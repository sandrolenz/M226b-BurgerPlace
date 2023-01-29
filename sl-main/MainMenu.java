import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Starting Screen of the Game. It contains a few instructions.
 * 
 * @author Sandro Lenz
 * @version 2023-01-29
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     */
    public MainMenu()
    {    
        // Create a new world.
        super(1700, 900, 1); 
    }
    
    /**
     * Check if Enter key is pressed and update the world on pressing.
     */
    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Restaurant());
        }
    }
}
