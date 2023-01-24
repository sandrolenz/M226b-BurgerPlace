import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Restaurant is the main world.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
 */
public class Restaurant extends World
{   
    // Create a new Movement Object
    private Movement movement = new Movement();
    /**
     * Constructor, Generates and prepares the world.
     */
    public Restaurant()
    {    
        // Create a new world with 1700x900 cells with a cell size of 1x1 pixels.
        super(1700, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {        
        Plate plate = new Plate();
        addObject(plate, 1200, 805);
        Trash trash = new Trash();
        addObject(trash, 1400, 805);
        Bell bell = new Bell();
        addObject(bell, 1600, 805);

        SpeechBubble speechBubble = new SpeechBubble();
        addObject(speechBubble,1250,200);
        Customer customer = new Customer(speechBubble);
        addObject(customer,950,452);
        MoneyJar moneyjar = new MoneyJar();
        addObject(moneyjar,1600,620);

        Bun bun = new Bun(false, true);
        addObject(bun, 85, 800);
        Beef beef = new Beef(false, true);
        addObject(beef, 325, 805);
        Cheese cheese = new Cheese(false, true);
        addObject(cheese, 550, 800);
        Salad salad = new Salad(false, true);
        addObject(salad, 740, 800);
    }
    
    /**
     * This method returns the movement object, that the actors can then use.
     * @return The movement object
     */
    public Movement getMover() {
        return movement;
    }
    
    /**
     * This method returns the plate object, that the actors can then use.
     * @return The plate object
     */
    
    public Plate getPlate() {
        Plate plate = getObjects(Plate.class).get(0);
        return plate;
    }
    
    /**
     * This method returns attributes of the plate object, that the actors can then use.
     * @param attribute Which attribute should be returned. Accepted are: "x", "y", "width" and "height"
     * @return The selected attribute of the object
     */
    
    public int getPlate(String attribute) {
        Plate plate = getObjects(Plate.class).get(0);
        switch(attribute) {
            case "x":
                return plate.getX();
            case "y": 
                return plate.getY();
            case "width":
                return plate.getImage().getWidth();
            case "height":
                return plate.getImage().getHeight();
            default:
                return 0;
        }
    }
}
