import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * The speechbubble used as a frame for the order.
 * 
 * @author Sandro Lenz
 * @version 2023-01-20
 */
public class SpeechBubble extends Actor
{
    private GreenfootImage imgRed = new GreenfootImage("speechbubbleRed.png");
    private GreenfootImage imgWhite = new GreenfootImage("speechbubble.png");
    /**
     * Act - do whatever the SpeechBubble wants to do.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * Display an order.
     * @param order An array of ingredient class names.
     */
    public void display(List<String> order) {
        Restaurant world = (Restaurant)getWorld();
        Ingredient obj = new Bun(true, false, true);
        int i = 0;
        for(String ingredient : order) {
            switch(ingredient) {
                case "Bun":
                    obj = new Bun(true, false, true);
                    break;
                case "Beef":
                    obj = new Beef(true, false, true);
                    break;
                case "Cheese":
                    obj = new Cheese(true, false, true);
                    break;
                case "Salad":
                    obj = new Salad(true, false, true);
                    break;
                case "default":
                    // This should never happen
                    break;
            }
            world.addObject(obj, 1250, 250-(i*21));
            i++;
        }
    }
    
    /**
     * Change image of bubble when order is checked
     * @param orderCorrect false if the order doesnt match the plate.
     */
    public void setImage(boolean orderCorrect) {
        if(!orderCorrect) {
            setImage(imgRed);
        } else {
            setImage(imgWhite);
        }
    }
}
