import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class to group all common methods of the ingredients.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Ingredient extends Actor
{
    public boolean locked;
    public boolean isSpeechBubble;
    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }
    
    /**
     * Check if an ingredient is touching an object of a class.
     * @param i The ingredient to check with.
     * @param cls The class to check against.
     * @return True if the ingredient is touching the class.
     */
    public boolean isTouching(Ingredient i, Class cls) {
        if (i.isTouching(cls)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Check if an ingredient is locked.
     * @param i The ingredient to check.
     * @return True if the ingredient is locked.
     */
    public boolean isLocked(Ingredient i) {
        if(i.locked) {
            return true;
        } else {
            return false; 
        }
    }
    
    /**
     * Lock an ingredient
     * @param i The ingredient to lock.
     */
    public void lock(Ingredient i) {
        i.locked = true;
    }
    
    /**
     * Connect an ingredient to the mover to track drag&drop.
     * @param i The Ingredient that should be tracked.
     * @see Movement#trackMouse
     */
    public void trackMovement(Ingredient i) {
        Restaurant world = (Restaurant)getWorld();
        Movement mover = world.getMover();
        
        mover.trackMouse(i);
    }
    
    /**
     * "Refill" an ingredient when one is dragged away.
     * @param i Ingredient to refill.
     */
    public void refill(Ingredient i) {
        switch(i.getClass().getName()) {
            case "Bun":
                Bun bun = new Bun(false, true, false);
                i.getWorld().addObject(bun, 85, 800);
                break;
            case "Beef":
                Beef beef = new Beef(false, true, false);
                i.getWorld().addObject(beef, 325, 805);
                break;
            case "Cheese":
                Cheese cheese = new Cheese(false, true, false);
                i.getWorld().addObject(cheese, 550, 800);
                break;
            case "Salad":
                Salad salad = new Salad(false, true, false);
                i.getWorld().addObject(salad, 740, 800);
                break;
            default:
                System.out.println("ERROR: refillIngredient() - Incorrect class received");
                break;
        }
    }
    
    /**
     * Get the price for ingredients.
     * @param ingredient The name of the ingredient you want the price of.
     * @return The price of the specified ingredient.
     */
    public int getPrice(Ingredient i) {
        switch(i.getClass().getName()) {
            case "Bun":
                return 0;
            case "Beef":
                return 2;
            case "Cheese":
                return 1;
            case "Salad":
                return 1;
            default:
                return 0;
        }
    }
}

