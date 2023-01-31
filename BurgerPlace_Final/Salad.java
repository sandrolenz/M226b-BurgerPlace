import greenfoot.*;  

/**
 * Salad.
 * 
 * @author Daniel Fankhauser
 * @version 1.3
 */
public class Salad extends Ingredient
{
    public boolean locked;
    /**
     * Constructor for Slad class, takes two booleans as input
     * l: determines if the salad is locked or not
     * isSource: determines if the salad is the source or not
     */
    public Salad(boolean l, boolean isSource) {}
    
    /**
     * This method updates the position of the Salad object in the game world 
     * based on mouse movement.
     */
    public void act() {
        trackMovement(this);
    }
}
