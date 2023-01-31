import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author Sandro Lenz
 * @version 2023-01-30
 */
public class EndScreen extends World
{
    private double money;
    private int customerCount;
    /**
     * Constructor for objects of class EndScreen.
     * @param m The amount of money the player has.
     * @param cc The number of customers the player has served.
     * @param tts The amount of time it took to serve each customer on average.
     */
    public EndScreen(double m, int cc) {    
        super(1700, 900, 1);
        money = m;
        customerCount = cc;
        
        showText("Today, you served " + cc + " customers.", 1200, 550);
        showText("You currently have $" + m + "0 in the bank.", 1200, 575);
    }
    
    /**
     * Check if Escape or Enter key is pressed and update the world on pressing.
     */
    public void act() {
        // Escape - Back to the main screen
        if(Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new MainMenu());
        }
        // Enter - Play another day
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Restaurant(money, customerCount, 3000));
        }
    }
}
