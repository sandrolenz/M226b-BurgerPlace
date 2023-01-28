import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * The customer.
 * 
 * @author Sandro Lenz
 * @version 2023-01-20
 */
public class Customer extends Actor
{
    private List<String> order = new ArrayList<String>();
    private String orderString = "";
    private int waitTime;
    private boolean timeStopped = false;
    /**
     * Creates the customer with an assigned speechbubble and generates an order.
     * 
     * @param speechbubble The speechbuuble object assigned to the customer.
     */
    public Customer(SpeechBubble speechbubble) {
        generateOrder(Greenfoot.getRandomNumber(3)+2);
        // System.out.println("Customer ordered: " + order);
        displayOrder(speechbubble);
    }
    /**
     * Act - do whatever the Customer wants to do.
     */
    public void act()
    {
        if(!timeStopped) {
            waitTime += 1;
            displayTime(); 
        }
    }
    
    /**
     * Generate an order using random numbers.
     * 
     * @param ingredientCount The amount of ingredients
     */
    private void generateOrder(int ingredientCount) {
        int i = 0;
        order.add("Bun");
        while(i < ingredientCount) {
            int ingredient = Greenfoot.getRandomNumber(3);
            switch(ingredient) {
                case 0:
                    order.add("Beef");
                    break;
                case 1:
                    order.add("Cheese");
                    break;
                case 2:
                    order.add("Salad");
                    break;
            }
            i++;
        }
        order.add("Bun");
    }
    
    /**
     * Check if the burger on the plate matches the order.
     * @return Returns true if both are the same.
     */
    public boolean checkOrder() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        if(plate.getBurgerString().equals(getOrderString())) {
            System.out.println("---");
            System.out.println("Plate: " + plate.getBurgerString());
            System.out.println("Order: " + getOrderString());
            System.out.println("match");
            timeStopped = true;
            pay();
            return true;
        } else {
            System.out.println("---");
            System.out.println("Plate: " + plate.getBurgerString());
            System.out.println("Order: " + getOrderString());
            System.out.println("no match");
            return false;
        }
    }
    
    /**
     * Returns the order as a list
     * @return The order as a list.
     */
    public List<String> getOrder() {
        return order;
    }
    
    /**
     * Returns the order as a string.
     * @return The order as a string.
     */
    private String getOrderString() {
        orderString = "";
        for(String i : order) {
            orderString = orderString + i + " ";
        }
        return orderString;
    }
    
    /**
     * Displays the order in the speechbubble.
     * @param sb The speechbubble
     * @see SpeechBubble#display
     */
    private void displayOrder(SpeechBubble sb) {
        sb.display(order);
    }
    
    /**
     * Pay for the burger.
     */
    private void pay() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        
        double totalPrice = 1; // base price for labour
        
        double tip;
        if(waitTime/10 < 120) {
            tip = 250 / (waitTime/10);
        } else {
            tip = 0;
        }
        
        totalPrice += plate.getIngredientPrice();
        totalPrice += tip;
        world.addMoney(totalPrice);
        plate.clearPlate();
        world.newCustomer(this);
    }
    
    /**
     * Display the time left to prepare the current burger.
     */
    public void displayTime() {
        Restaurant world = (Restaurant)getWorld();
        world.showText(waitTime/10 + ":00", 150, 50);
    }
}
