import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Customer that generates different orders.
 * 
 * @author Daniel Fankhauser
 * @version 1.3
 */
public class Customer extends Actor
{
    private List<String> order = new ArrayList<String>();
    private String orderString = "";
    private int waitTime;
    private boolean timeStopped = false;
    /**
     * The "Customer" constructor creates a new Customer object and generates a random order.
     * The order is displayed in the provided speech bubble.
     */
    public Customer(SpeechBubble speechbubble) {
        generateOrder(Greenfoot.getRandomNumber(2)+2);// generate a random order with 2 to 3 items
        displayOrder(speechbubble);// display the generated order in the speech bubble
    }
    /**
     * The "act" method of this "Actor" object increments the wait time and 
     * displays it if time is not stopped.
     */
    public void act()
    {
            if(!timeStopped) { // if time is not stopped
                waitTime += 1; // increment the wait time
            displayTime(); // display the updated wait time
        }
    }
    
    /**
     * The "generateOrder" method generates a random burger order for the customer 
     * by adding the ingredients to the "order" list.
     * 
     * @param ingredientCount: the number of ingredients in the order (excluding the buns).
     */
    private void generateOrder(int ingredientCount) {
        int i = 0;
            order.add("Bun");
        while(i < ingredientCount) {
            int ingredient = Greenfoot.getRandomNumber(5);
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
                case 3:
                    order.add("Tomato");
                    break;
                case 4:
                    order.add("Bacon");
                    break;
            }
            i++;
        }
        order.add("Bun");
    }
    
    /**
     * This method is responsible for checking the order of the customer and 
     * the plate of the burger.
     * 
     * If the order matches with the burger on the plate, it stops the timer 
     * and the customer pays.
     * 
     * If the order does not match with the burger on the plate, it returns false.
     * 
     * The method prints out the contents of the plate and order for debugging purposes.
     * 
     * @return boolean value indicating if the order matches with the burger on the plate
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
     * Returns the list of ingredients in the customer's order.
     */
    public List<String> getOrder() {
        return order;
    }
    
    /**
     * Concatenates elements of order list to form a string
     */
    private String getOrderString() {
        orderString = "";
        for(String i : order) {
            orderString = orderString + i + " ";
        }
        return orderString;
    }
    
    /**
     * The Method "displayOrder()" displays the order to the speech bubble.
     */
    private void displayOrder(SpeechBubble sb) {
        sb.display(order);
    }
    
    /**
     * This method calculates the total cost of the order 
     * (base price, ingredient price, and tip), 
     * Adds the cost to the world's money, clears the plate and generates a 
     * new customer.
     */
    private void pay() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        
        double totalPrice = 6; //Baseprise per order
        
        double tip;
        if(waitTime/10 < 60) { //you have 60s to finnish a burger
            tip = 250 / (waitTime/10);
        } else {
            tip = 0;
            totalPrice = -6; //Money you loose if you take to long for a Order.
        }
        
        totalPrice += tip;
        world.addMoney(totalPrice);
        plate.clearPlate();
        world.newCustomer(this);
    }
    
    /**
     * Function to display the time for a customer in the simulation.
     * The display time is the wait time of the customer in seconds, divided 
     * by 10 and shown as minutes:seconds.
     */
    public void displayTime() {
        Restaurant world = (Restaurant)getWorld();
        world.showText(waitTime/10 + ":00 Seconds passed", 120, 50);
    }
}
