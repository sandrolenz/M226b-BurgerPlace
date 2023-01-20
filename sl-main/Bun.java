import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bun here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Bun extends Ingredient
{
    public boolean locked;
    public Bun(boolean l, boolean isSource) {
        locked = l;
        if(isSource) {
            setImage("ingredient_Bun.png");
        }
    }
    /**
     * Act - do whatever the Bun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        trackMovement(this);
    }
}
