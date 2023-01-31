import greenfoot.*;  

/**
 * The bell declares that a burger is finnished and it will be taken away by the customer.
 * 
 * @author Daniel Fankhauser
 * @version 1,3
 */
public class Bell extends Actor
{
    private GreenfootImage imgDefault = new GreenfootImage("bell.png");
    /**
     * Act - In this case, check if someone clicks it.
     */
    public void act()
    {
        // Add your action code here.
        checkClick();
    }
    
    /**
     * The "checkClick" method checks if the mouse has clicked on the "bell" object.
     * If the "bell" has been clicked, the "press" method is called.
     */
    private void checkClick() {
        if(Greenfoot.mouseClicked(this)) {
          press();
        }
    }

    /**
     * The "press" method retrieves the Customer object and calls its "checkOrder" method.
     */
    private void press() {
        Restaurant world = (Restaurant)getWorld();
        Customer customer = world.getObjects(Customer.class).get(0);
        customer.checkOrder();
    }
}
