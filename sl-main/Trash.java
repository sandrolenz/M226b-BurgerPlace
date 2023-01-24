import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The trash bucket is used to dispose of wrong burgers.
 * 
 * @author Sandro Lenz
 * @version 2023-01-24
 */
public class Trash extends Actor
{
    /**
     * Act - do whatever the Trash wants to do. In this case, check if someone clicks it.
     */
    public void act() {
        checkClick();
    }

    /**
     * Checks if the trash is clicked and executes the clearPlate() function.
     * @see Trash#clearPlate
     */
    private void checkClick() {
        if(Greenfoot.mouseClicked(this)) {
            clearPlate();
        }
    }
    
    /**
     * Clears the plate.
     * @see Plate#clearPlate
     */
    private void clearPlate() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        
        plate.clearPlate();
    }
}
