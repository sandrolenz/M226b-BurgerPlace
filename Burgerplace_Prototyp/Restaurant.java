import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Daniel Fankhauser) 
 * @version (1.3)
 */
public class Restaurant extends World
{   
    private Movement movement = new Movement();
    /**
     * Constructor for objects of class Restaurant.
     * 
     */
    public Restaurant()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 640, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {        
        Plate plate = new Plate();
        addObject(plate,650,550);
        
        Customer customer = new Customer();
        addObject (customer, 1200, 400);
        
        SpeechBubble speechbubble = new SpeechBubble();
        addObject (speechbubble, 970, 150);
        
        Bell bell = new Bell();
        addObject (bell, 800, 450);
        
        Trash trash = new Trash();
        addObject(trash,1000,590);
        
        MoneyJar moneyjar = new MoneyJar();
        addObject (moneyjar,880, 450);

        Bun bun = new Bun();
        addObject(bun, 180, 550);
        Beef beef = new Beef();
        addObject(beef, 480, 550);
        Cheese cheese = new Cheese();
        addObject(cheese, 280, 550);
        Salad salad = new Salad();
        addObject(salad, 380, 550);
    }
    
    public Movement getMover() {
        return movement;
    }
}
