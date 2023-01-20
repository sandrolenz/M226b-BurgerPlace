import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class SpeechBubble here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-20
 */
public class SpeechBubble extends Actor
{
    /**
     * Act - do whatever the SpeechBubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void display(List<String> order) {
        Restaurant world = (Restaurant)getWorld();
        Ingredient obj = new Bun(false, true);
        int i = 0;
        for(String ingredient : order) {
            switch(ingredient) {
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
                    // This should never happen
                    break;
            }
            world.addObject(obj, 1250, 250-(i*21));
            i++;
        }
    }
}
