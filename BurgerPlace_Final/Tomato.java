import greenfoot.*;  

/**
 * Tomato.
 * 
 * @author Daniel Fankhauser
 * @version 1.2
 */
public class Tomato extends Ingredient
{
    public boolean locked;
    /**
     * Constructor for Tomato class, takes two booleans as input
     * l: determines if the tomato is locked or not
     * isSource: determines if the tomato is the source or not
     */
    public Tomato(boolean l, boolean isSource) {}
    
    /**
     * This method updates the position of the Tomato object in the game world 
     * based on mouse movement.
     */
    public void act() {
        trackMovement(this);
    }
}
