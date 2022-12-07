import greenfoot.*;

/**
 * Write a description of class Movement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movement  
{
    // instance variables - replace the example below with your own
    private int x;

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
    public static void trackMouse(Actor actor) {
        if (Greenfoot.mouseDragged(actor)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            actor.setLocation(mouse.getX(), mouse.getY());
        }
    }
}
