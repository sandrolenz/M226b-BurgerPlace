import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    private Movement movement = new Movement();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {        
        Plate plate = new Plate();
        addObject(plate,250,290);

        Bun bun = new Bun();
        addObject(bun, 60, 20);
        Beef beef = new Beef();
        addObject(beef, 60, 50);
        Cheese cheese = new Cheese();
        addObject(cheese, 60, 80);
        Salad salad = new Salad();
        addObject(salad, 60, 110);
    }
    
    public Movement getMover() {
        return movement;
    }
}
