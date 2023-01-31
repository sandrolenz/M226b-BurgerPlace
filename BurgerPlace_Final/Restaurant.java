import greenfoot.*;  
import java.util.List;
import java.util.ArrayList;

/**
 * BurgerPlace - Restaurant
 * 
 * @author Daniel Fankhauser
 * @version 1.4
 */
public class Restaurant extends World
{   
    //member variables to store movement, money and time
    private Movement movement = new Movement();
    private float money = 0;
    private int time = 1000;
    /**
     * Constructor for preparing world.
     */
    public Restaurant()
    {    
        // Create a new world with 1400x640 cells with a cell size of 1x1 pixels.
        super(1400, 640, 1); 
        prepare();
        displayMoney();
    }
    
    /**
     * This method prepares following objects for the simulation by 
     * instantiating them and adding them to the world.
     * (plate, bell, trash, moneyjar, speechbubble, customer, and ingredients) 
     */
    private void prepare()
    {        
        Plate plate = new Plate();
        addObject(plate, 650,550);
        Bell bell = new Bell();
        addObject(bell, 800, 450);
        Trash trash = new Trash();
        addObject(trash, 1000,590);

        MoneyJar moneyjar = new MoneyJar();
        addObject(moneyjar,880, 450);
        SpeechBubble speechBubble = new SpeechBubble();
        addObject(speechBubble,970, 150);
        Customer customer = new Customer(speechBubble);
        addObject(customer,1200, 400);
        customer.displayTime();

        Bun bun = new Bun(false, true);
        addObject(bun, 280, 530);
        Cheese cheese = new Cheese(false, true);
        addObject(cheese, 280, 570);
        Tomato tomato = new Tomato(false, true);
        addObject(tomato, 380, 570);
        Salad salad = new Salad(false, true);
        addObject(salad, 380, 530);
        Bacon bacon = new Bacon(false, true);
        addObject(bacon, 480, 530);
        Beef beef = new Beef(false, true);
        addObject(beef, 480, 570);
    }
    
    /**
     * The "getMover" method returns the Movement object associated with this class.
     * 
     * @return The Movement object
     */
    
    public Movement getMover() {
        return movement;
    }
    
    /**
     *  The "getPlate" method returns the first Plate object in the scene.
     *  
     *  @return The first Plate object in the scene
     */
    
    public Plate getPlate() {
       Plate plate = getObjects(Plate.class).get(0);
        return plate;
    }
    
    /**
     * The "getPlate" method returns the specified attribute of a Plate object.
     * @param attribute The attribute to be returned (either "x", "y", "width", or "height")
     * @return The requested attribute value, or 0 if the attribute is not recognized
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
    
    /**
     * The "addMoney" method adds a specified amount to the current balance 
     * and displays the updated balance.
     * @param amount The amount to be added to the current balance
     */
    public void addMoney(double amount) {
       money += amount;
        displayMoney();
    }
    
    /**
     * Shows the money you currently have.
     */
    private void displayMoney() {
        showText(money + "0", 880,440);
    }
    
     public void newCustomer(Customer c) {
        removeObject(c);
        
     SpeechBubble speechBubble = new SpeechBubble();
        addObject(speechBubble,970, 150);
        Customer customer = new Customer(speechBubble);
        addObject(customer,1200, 400);
        customer.displayTime();
    }
}
