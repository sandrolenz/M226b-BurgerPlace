import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-04
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
