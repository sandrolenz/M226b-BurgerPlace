import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Customer here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-20
 */
public class Customer extends Actor
{
    private List<String> order = new ArrayList<String>();
    private String orderString = "";
    public Customer(SpeechBubble speechbubble) {
        generateOrder(Greenfoot.getRandomNumber(3)+2);
        // System.out.println("Customer ordered: " + order);
        displayOrder(speechbubble);
    }
    /**
     * Act - do whatever the Customer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public boolean checkOrder() {
        Restaurant world = (Restaurant)getWorld();
        Plate plate = world.getPlate();
        if(plate.getBurgerString().equals(getOrderString())) {
            System.out.println("---");
            System.out.println("Plate: " + plate.getBurgerString());
            System.out.println("Order: " + getOrderString());
            System.out.println("match");
            return true;
        } else {
            System.out.println("---");
            System.out.println("Plate: " + plate.getBurgerString());
            System.out.println("Order: " + getOrderString());
            System.out.println("no match");
            return false;
        }
    }
    
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
    
    public List<String> getOrder() {
        return order;
    }
    
    private String getOrderString() {
        orderString = "";
        for(String i : order) {
            orderString = orderString + i + " ";
        }
        return orderString;
    }
    
    private void displayOrder(SpeechBubble sb) {
        sb.display(order);
    }
}
