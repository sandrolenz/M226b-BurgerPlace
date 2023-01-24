import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ingredient here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Ingredient extends Actor
{
    private boolean locked;
    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    }
    
    public boolean isTouching(Ingredient i, Class cls) {
        if (i.isTouching(cls)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isLocked(Ingredient i) {
        if(i.locked) {
            return true;
        } else {
            return false; 
        }
    }
    
    public void lock(Ingredient i) {
        i.locked = true;
    }
    
    public void trackMovement(Ingredient i) {
        Restaurant world = (Restaurant)getWorld();
        Movement mover = world.getMover();
        
        mover.trackMouse(i);
    }
    
    public void refill(Ingredient i) {
        switch(i.getClass().getName()) {
            case "Bun":
                Bun bun = new Bun(false, true);
                i.getWorld().addObject(bun, 85, 800);
                break;
            case "Beef":
                Beef beef = new Beef(false, true);
                i.getWorld().addObject(beef, 325, 805);
                break;
            case "Cheese":
                Cheese cheese = new Cheese(false, true);
                i.getWorld().addObject(cheese, 550, 800);
                break;
            case "Salad":
                Salad salad = new Salad(false, true);
                i.getWorld().addObject(salad, 740, 800);
                break;
            default:
                System.out.println("ERROR: refillIngredient() - Incorrect class received");
                break;
        }
    }
}
