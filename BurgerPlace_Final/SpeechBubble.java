import greenfoot.*;  
import java.util.List;
import java.util.ArrayList;

/**
 * The order will be shown on the SpeechBubble.
 * 
 * @author Daniel Fankhauser
 * @version 1.3
 */
public class SpeechBubble extends Actor
{
    /**
     * Act - do whatever the SpeechBubble wants to do.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * This method displays the ingredients of a burger order by adding instances 
     * of each ingredient in the "order" list as objects to the "Restaurant" world. 
     * The position of each ingredient is calculated based on its index in the "order" list.
     */
    public void display(List<String> order) {
        Restaurant world = (Restaurant)getWorld();
        Ingredient obj = new Bun(false, true);
        int i = 0;
        for(String ingredient : order) {
            switch(ingredient) {
                case "Tomato":
                    obj = new Tomato(true, false);
                    break;
                case "Bacon":
                    obj = new Bacon(true, false);
                    break;
                case "Bun":
                    obj = new Bun(true, false);
                    break;
                case "Beef":
                    obj = new Beef(true, false);
                    break;
                case "Cheese":
                    obj = new Cheese(true, false);
                    break;
                case "Salad":
                    obj = new Salad(true, false);
                    break;
                case "default":
                    break;
            }
            world.addObject(obj, 1000, 180-(i*21));
            i++;
        }
    }
}
