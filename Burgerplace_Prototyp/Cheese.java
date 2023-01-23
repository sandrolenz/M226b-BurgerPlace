import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (Daniel Fankhauser) 
 * @version (1.0)
 */
public class Cheese extends Ingredient
{
    public boolean locked;
    /**
     * Act - do whatever the Cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        Restaurant world = (Restaurant)getWorld();
        Movement mover = world.getMover();
        
        mover.trackMouse(this);
    }
}
