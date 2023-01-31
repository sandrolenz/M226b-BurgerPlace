import greenfoot.*;  

/**
 * Cheese.
 * 
 * @author Daniel Fankhauser
 * @version 1.2
 */
public class Cheese extends Ingredient
{
    public boolean locked;
    /**
     * Constructor for Cheese class, takes two booleans as input
     * l: determines if the cheese is locked or not
     * isSource: determines if the cheese is the source or not
     */
    public Cheese(boolean l, boolean isSource) {}
    
    /**
     * This method updates the position of the Cheese object in the game world 
     * based on mouse movement.
     */
    public void act() {
        trackMovement(this);
    }
}
