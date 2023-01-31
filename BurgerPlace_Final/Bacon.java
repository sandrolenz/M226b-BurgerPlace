import greenfoot.*;  

/**
 * Bacon.
 * 
 * @author Daniel Fankhauser
 * @version 1.1
 */
public class Bacon extends Ingredient
{
    public boolean locked;
    /**
     * Constructor for Bacon class, takes two booleans as input
     * l: determines if the bacon is locked or not
     * isSource: determines if the bacon is the source or not
     */
    public Bacon(boolean l, boolean isSource) {}
    
    /**
     * This method updates the position of the Bacon object in the game world 
     * based on mouse movement.
     */
    public void act() {
        trackMovement(this);
    }
}
