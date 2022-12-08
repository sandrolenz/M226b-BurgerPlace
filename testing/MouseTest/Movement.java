import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Movement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movement  
{
    private List<Ingredient> burger = new ArrayList<Ingredient>();
    
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
        if (Greenfoot.mouseDragged(i)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            i.setLocation(mouse.getX(), mouse.getY());
        }
        if (Greenfoot.mouseDragEnded(i)) {
            lockPosition(i);
        }
    }
    
    private void lockPosition(Ingredient i) {
        if(!i.locked) {
            if(Greenfoot.mouseDragEnded(i)) {
                Ingredient lastObject = getLastObject();
                if (i.isTouching(i, Plate.class) && lastObject != null) {
                    i.setLocation(lastObject.getX(), lastObject.getY()-21);
                    addToArray(i);
                    i.locked = true;
                } else if(i.isTouching(i, Plate.class) && lastObject == null) {
                    i.setLocation(250, 340);
                    addToArray(i);
                    i.locked = true;
                } else {
                    i.resetLocation(i);
                }
            }
        }
    }
    
    public void addToArray(Ingredient i) {
        burger.add(i);
        System.out.println(burger);
    }
    
    private Ingredient getLastObject() {
        if (burger.isEmpty()) {
            return null;
        } else {
            return burger.get(burger.size()-1);
        }
    }
}
