import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    public EndScreen(double m, int cc, double tts) {    
        super(1700, 900, 1);
        money = m;
        customerCount = cc;
        
        showText("Today, you served " + cc + " customers.", 1200, 550);
        showText("On average, it took you " + tts + " to serve one customer.", 1200, 570);
        showText("You currently have $" + m + "0 in the bank.", 1200, 620);
    }
    
    /**
     * Check if Enter or R key is pressed and update the world on pressing.
     */
    public void act() {
        // Enter - Back to the main screen
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MainMenu());
        }
        // R - Play another day
        if(Greenfoot.isKeyDown("r")) {
            Greenfoot.setWorld(new Restaurant(money, customerCount, 5000));
        }
    }
}
