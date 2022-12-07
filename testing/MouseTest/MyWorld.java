import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

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
        addObject(bun,250,250);
        Salad salad = new Salad();
        addObject(salad,250,271);
        Cheese cheese = new Cheese();
        addObject(cheese,250,292);
        Bun bun2 = new Bun();
        addObject(bun2,250,334);
        
        Beef beef = new Beef();
        addObject(beef,250,120);
    }
}
