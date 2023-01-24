import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Beef ingredient.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Beef extends Ingredient
{
    public boolean locked;
    /**
     * Create the beef ingredient.
     * @param l True if the ingredient is locked
     * @param isSource True if the Object is the source of this ingredient
     */
    public Beef(boolean l, boolean isSource) {
        locked = l;
        if(isSource) {
            setImage("ingredient_Beef.png");
        }
    }
    /**
     * Act - Track the movement.
     */
    public void act() {
        // Add your action code here.
        trackMovement(this);
    }
}
