import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bun ingredient.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Bun extends Ingredient
{
    public boolean locked;
    public boolean isSpeechBubble;
    /**
     * Create the Bun ingredient.
     * @param l True if the ingredient is locked
     * @param isSource True if the Object is the source of this ingredient
     */
    public Bun(boolean l, boolean isSource, boolean isSB) {
        locked = l;
        isSpeechBubble = isSB;
        if(isSource) {
            setImage("ingredient_Bun.png");
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
