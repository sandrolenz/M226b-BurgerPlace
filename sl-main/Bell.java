import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bell is used to notify the customer that their burger is finished.
 * 
 * @author Sandro Lenz
 * @version 2023-01-21
 */
public class Bell extends Actor
{
    private GreenfootImage imgDefault = new GreenfootImage("bell.png");
    private GreenfootImage imgPressed = new GreenfootImage("bell_pressed.png");
    /**
     * Act - In this case, check if someone clicks it.
     */
    public void act()
    {
        // Add your action code here.
        checkClick();
    }
    
    /**
     * Checks if the bell is clicked and executes the press() function.
     * @see Bell#press
     */
    private void checkClick() {
        if(Greenfoot.mouseClicked(this)) {
            press();
        }
    }

    /**
     * Play a sound and give the customer the instruction to check the order
     * @see Customer#checkOrder
     */
    private void press() {
        // Greenfoot.playSound("bellRing.mp3");
        
        Restaurant world = (Restaurant)getWorld();
        Customer customer = world.getObjects(Customer.class).get(0);
        customer.checkOrder();
    }
}
