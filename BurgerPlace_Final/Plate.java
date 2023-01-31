import greenfoot.*; 
import java.util.List;
import java.util.ArrayList;

/**
 * Burgers are created on the Plate.
 * 
 * @author Daniel Fankhauser
 * @version 1.3
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
     * Adds an ingredient to the burger array and prints its current contents.
     */
    public void addToArray(Ingredient i) {
        burger.add(i);
        System.out.println("Currently on the plate: " + burger);
    }
    
    /**
     * Returns the last element in "burger" array, or null if array is empty.
     */
    public Ingredient getLastObject() {
        if (burger.isEmpty()) {
            return null;
        } else {
            return burger.get(burger.size()-1);
        }
    }
    
    /**
     * This function returns a string representation of the ingredients in the 
     * burger array.
     * For each element in the "burger" array, it adds the name of the class of 
     * the ingredient to "burgerString".
     */
    public String getBurgerString() {
        burgerString = "";
        for(Ingredient i : burger) {
            burgerString = burgerString + i.getClass().getName() + " ";
        }
        return burgerString;
    }
    
    /**
     * This method removes all the objects of class Ingredient 
     * (which are stored in the "burger" ArrayList) from the world and also 
     * clears the "burger" ArrayList. 
     * This method is used to clear the plate in the restaurant simulation.
     */
    public void clearPlate() {
        for(Ingredient i : burger) {
            i.getWorld().removeObject(i);
        }
        burger.clear();
    }
}
