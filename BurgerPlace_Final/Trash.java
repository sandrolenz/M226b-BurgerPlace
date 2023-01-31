import greenfoot.*;  
/**
 * If a Burger was made wrong, you can trash it by clicking on the Trash.
 * 
 * @author Daniel Fankhauser
 * @version 1.2
 */
public class Trash extends Actor
{
    /**
     * The method checks if object has been clicked on.
     */
    public void act() {
        checkClick();
    }

    /**
     * Detects mouse click on Trash and clears the plate if the Trash is clicked.
     */
    private void checkClick() {
        Restaurant world = (Restaurant)getWorld();
        if(Greenfoot.mouseClicked(this)) {
        clearPlate();
        world.addMoney(-3);
        }
    }
    
    /**
     * Removes all ingredients from Plate by calling its clearPlate method.
     */
    private void clearPlate() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        plate.clearPlate();
    }
}
