import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Actor
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        checkClick();
    }
    
    private void checkClick() {
        if(Greenfoot.mouseClicked(this)) {
            clearPlate();
        }
    }
    
    private void clearPlate() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        
        plate.clearPlate();
    }
}
