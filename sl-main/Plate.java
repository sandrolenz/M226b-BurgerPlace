import greenfoot.*; 
import java.util.List;
import java.util.ArrayList;

/**
 * The plate that the burger is prepared on.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Plate extends Actor
{
    private List<Ingredient> burger = new ArrayList<Ingredient>();
    private String burgerString = "";
    /**
     * Act - do whatever the Plate wants to do.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * Add an ingredient to the burger array.
     * @param i The ingredient that should be added.
     */
    public void addToArray(Ingredient i) {
        burger.add(i);
        // System.out.println("Currently on the plate: " + burger);
    }
    
    /**
     * Get the last object of the burger array.
     * @return The ingredient object that was last added.
     */
    public Ingredient getLastObject() {
        if (burger.isEmpty()) {
            return null;
        } else {
            return burger.get(burger.size()-1);
        }
    }
    
    /**
     * Get the burger array as a string.
     * @return The array as a string.
     */
    public String getBurgerString() {
        burgerString = "";
        for(Ingredient i : burger) {
            burgerString = burgerString + i.getClass().getName() + " ";
        }
        // System.out.println(burgerString);
        return burgerString;
    }
    
    /**
     * Remove all ingredients from the plate and clear the burger array.
     */
    public void clearPlate() {
        for(Ingredient i : burger) {
            i.getWorld().removeObject(i);
        }
        burger.clear();
    }
    
    /**
     * Returns the price of the burger currently on the plate.
     * @return The price of the burger
     */
    public int getIngredientPrice() {
        int price = 0;
        for(Ingredient i : burger) {
            price = price + i.getPrice(i);
        }
        return price;
    }
}
