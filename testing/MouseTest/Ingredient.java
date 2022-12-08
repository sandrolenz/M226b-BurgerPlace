import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ingredient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ingredient extends Actor
{
    public boolean locked;    
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
    
    public void resetLocation(Ingredient i) {
        switch(i.getClass().getName()) {
            case "Bun":
                i.setLocation(60, 20);
                break;
            case "Beef":
                i.setLocation(60, 50);
                break;
            case "Cheese":
                i.setLocation(60, 80);
                break;
            case "Salad":
                i.setLocation(60, 110);
                break;
            default:
                i.setLocation(60, 140);
                break;
        }
    }
}
