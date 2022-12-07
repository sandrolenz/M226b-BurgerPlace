import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Beef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beef extends Actor
{
    /**
     * Act - do whatever the Beef wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Movement.trackMouse(this);
        lockPosition();
    }
    
    private void lockPosition() {
        // locking onto selection (or not)
        if (Greenfoot.mouseDragEnded(this)) {
            if (isTouching(Plate.class)) {
                List<Plate> plates = getWorld().getObjects(Plate.class);
                for (Plate p : plates) {
                    setLocation(p.getX(), p.getY());
                }
            } else {
                setLocation(250,120);
            }
        }
    }
    
}
