import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * A global helper class to track movement of ingredients.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Movement  
{
    /**
     * Constructor
     */
    public Movement() {
    }

    /**
     * Track when a specified ingredient is dragged, set the correct image, lock its position and refill the ingredient.
     * @param  i The ingredient to track.
     * @see Ingredient#refill
     * @see Movement#lockPosition
     */
    public void trackMouse(Ingredient i) {
        if(!i.isLocked(i)) {
            if (Greenfoot.mouseDragged(i)) {
                i.setImage("ingredient_" + i.getClass().getName() + "_dragged.png");
                
                MouseInfo mouse = Greenfoot.getMouseInfo();
                i.setLocation(mouse.getX(), mouse.getY());
                
                i.refill(i);
            }
            if (Greenfoot.mouseDragEnded(i)) {
                lockPosition(i);
            }
        }
    }
    
    /**
     * Lock the position of an ingredient on the plate according to the last ingredient that was added.
     * @param i The ingredient to lock.
     */
    private void lockPosition(Ingredient i) {
        Restaurant world = (Restaurant)i.getWorld();
        if(!i.isLocked(i)) {
            if(Greenfoot.mouseDragEnded(i)) {
                Ingredient lastObject = world.getPlate().getLastObject();
                if (i.isTouching(i, Plate.class) && lastObject != null) {
                    i.setLocation(lastObject.getX(), lastObject.getY() - i.getImage().getHeight());
                    world.getPlate().addToArray(i);
                    i.lock(i);
                } else if(i.isTouching(i, Plate.class) && lastObject == null) {
                    int x = world.getPlate("x");
                    int y = world.getPlate("y") + ((world.getPlate("height")/2) - i.getImage().getHeight());
                    
                    i.setLocation(x, y);
                    world.getPlate().addToArray(i);
                    i.lock(i);
                } else {
                    world.removeObject(i);
                }
            }
        }
    }
}
