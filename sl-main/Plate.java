import greenfoot.*; 
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Plate here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Plate extends Actor
{
    private List<Ingredient> burger = new ArrayList<Ingredient>();
    private List<String> burgerString = new ArrayList<String>();
    /**
     * Act - do whatever the Plate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void addToArray(Ingredient i) {
        burger.add(i);
        System.out.println("Currently on the plate: " + burger);
    }
    
    public Ingredient getLastObject() {
        if (burger.isEmpty()) {
            return null;
        } else {
            return burger.get(burger.size()-1);
        }
    }
    
    public List<String> getBurgerString() {
        burgerString.clear();
        
        for(Ingredient i : burger) {
            burgerString.add(i.getClass().getName());
        }
        // System.out.println(burgerString);
        return burgerString;
    }
    
    public void clearPlate() {
        for(Ingredient i : burger) {
            i.getWorld().removeObject(i);
        }
        burger.clear();
    }
}
