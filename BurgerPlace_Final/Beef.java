import greenfoot.*;  

/**
 * Beef.
 * 
 * @author Daniel Fankhauser
 * @version 1.2
 */
public class Beef extends Ingredient
{
    public boolean locked;
    /**
     * Constructor for Beef class, takes two booleans as input
     * l: determines if the beef is locked or not
     * isSource: determines if the beef is the source or not
     */
    public Beef(boolean l, boolean isSource) {}
    
    /**
     * This method updates the position of the Bacon object in the game world 
     * based on mouse movement.
     */
    public void act() {
        trackMovement(this);
    }
}
