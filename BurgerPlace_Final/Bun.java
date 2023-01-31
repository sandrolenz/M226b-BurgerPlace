import greenfoot.*;  

/**
 * Bun.
 * 
 * @author Daniel Fankhauser
 * @version 1.2
 */
public class Bun extends Ingredient
{
    public boolean locked;
    /**
     * Constructor for Bun class, takes two booleans as input
     * l: determines if the bun is locked or not
     * isSource: determines if the bun is the source or not
     */
    public Bun(boolean l, boolean isSource) {}
    
    /**
     * This method updates the position of the Bun object in the game world 
     * based on mouse movement.
     */
    public void act() {
        trackMovement(this);
    }
}
