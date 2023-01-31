import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Tracks the movement of ingredients.
 * 
 * @author Daniel Fankhauser
 * @version 1.4
 */
public class Movement  
{
    /**
     * The Constructor.
     */
    public Movement() {
    }

    /**
     * This code tracks the movement of an "Ingredient" object when it is being 
     * dragged by the mouse. 
     * If the mouse is dragged over the object, the image of the object 
     * changes and its location is updated to match the mouse position. 
     * If the mouse drag ends, the object's position is locked.
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
     * This method locks the position of an "Ingredient" object in a "Plate" or 
     * removes it from the world if not in contact with Plate. 
     * 
     * It uses mouse drag and drop events to determine the position of the 
     * "Ingredient" and sets its location accordingly. 
     * 
     * If it is in contact with the "Plate", it is added to the "Plate"'s 
     * ingredient list and locked.
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
