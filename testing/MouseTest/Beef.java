import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beef extends Ingredient
{
    public boolean locked;
    /**
     * Act - do whatever the Beef wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        MyWorld world = (MyWorld)getWorld();
        Movement mover = world.getMover();
        
        mover.trackMouse(this);
    }
}
