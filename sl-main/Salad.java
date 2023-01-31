import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The salad ingredient.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Salad extends Ingredient
{
    public boolean locked;
    public boolean isSpeechBubble;
    public boolean dragStarted;
    /**
     * Create the salad ingredient.
     * @param l True if the ingredient is locked
     * @param isSource True if the object is the source of this ingredient
     * @param isSB True if the object is displayed in the speechbubble
     */
    public Salad(boolean l, boolean isSource, boolean isSB) {
        locked = l;
        isSpeechBubble = isSB;
        if(isSource) {
            setImage("ingredient_Salad.png");
        }
    }
    /**
     * Act - Track teh movement
     */
    public void act() {
        // Add your action code here.
        trackMovement(this);
    }
}
