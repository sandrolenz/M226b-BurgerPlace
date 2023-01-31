import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The cheese ingredient.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Cheese extends Ingredient
{
    public boolean locked;
    public boolean isSpeechBubble;
    public boolean dragStarted;
    /**
     * Create the cheese ingredient.
     * @param l True if the ingredient is locked
     * @param isSource True if the object is the source of this ingredient
     * @param isSB True if the object is displayed in the speechbubble
     */
    public Cheese(boolean l, boolean isSource, boolean isSB) {
        locked = l;
        isSpeechBubble = isSB;
        if(isSource) {
            setImage("ingredient_Cheese.png");
        }
    }
    /**
     * Act - Track the movement
     */
    public void act() {
        // Add your action code here.
        trackMovement(this);
    }
}
