import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Movement here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Movement  
{
    
    /**
     * Constructor for objects of class Movement
     */
    public Movement()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
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
