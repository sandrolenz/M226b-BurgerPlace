import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ingredient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ingredient extends Actor
{
    public boolean locked;    
    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    }
    
    public boolean isTouching(Ingredient i, Class cls) {
        if (i.isTouching(cls)) {
            return true;
        } else {
            return false;
        }
    }
}
