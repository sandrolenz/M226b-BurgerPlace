import greenfoot.*;  

/**
 * Groups all methods of the Ingredients.
 * 
 * @author Daniel Fankhauser
 * @version 1.5
 */
public class Ingredient extends Actor
{
    private boolean locked;
    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }
    
    /**
     * Check if the ingredient "i" is touching object of class "cls"
     * Return true if touching, otherwise return false.
     */
    public boolean isTouching(Ingredient i, Class cls) {
        if (i.isTouching(cls)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * This function checks if an ingredient i is locked or not.
     */
    public boolean isLocked(Ingredient i) {
        if(i.locked) {
            return true;
        } else {
            return false; 
        }
    }
    
    /**
     * Locks an ingredient object.
     */
    public void lock(Ingredient i) {
        i.locked = true;
    }
    
    /**
     * This method allows the ingredient i to be moved by the mouse movement 
     * tracker "mover". The mover is retrieved from the world and then used to 
     * track the mouse and move the ingredient i.
     */
    public void trackMovement(Ingredient i) {
     Restaurant world = (Restaurant)getWorld();
        Movement mover = world.getMover();
        
        mover.trackMouse(i);
    }
    
    /**
     * Refills the respective ingredient in Restaurant by creating a new 
     * instance and adding it to the world.
     */
    public void refill(Ingredient i) {
        switch(i.getClass().getName()) {
            case "Tomato":
            Tomato tomato = new Tomato(false, true);
                i.getWorld().addObject(tomato, 380, 570);
                break;
            case "Bacon":
                Bacon bacon = new Bacon(false, true);
                i.getWorld().addObject(bacon, 480, 530);
                break;
            case "Bun":
                Bun bun = new Bun(false, true);
                i.getWorld().addObject(bun, 280, 530);
                break;
            case "Beef":
                Beef beef = new Beef(false, true);
                i.getWorld().addObject(beef, 480, 570);
                break;
            case "Cheese":
                Cheese cheese = new Cheese(false, true);
                i.getWorld().addObject(cheese, 280, 570);
                break;
            case "Salad":
                Salad salad = new Salad(false, true);
                i.getWorld().addObject(salad, 380, 530);
                break;
            default:
                System.out.println("ERROR: refillIngredient() - Incorrect class received");
                break;
        }
    }
}

