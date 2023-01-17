import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bell extends Actor
{
    private GreenfootImage imgDefault = new GreenfootImage("bell.png");
    private GreenfootImage imgPressed = new GreenfootImage("bell_pressed.png");
    /**
     * Act - do whatever the Bell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkClick();
    }
    
    private void checkClick() {
        if(Greenfoot.mouseClicked(this)) {
            press();
        }
    }

    private void press() {
        setImage(imgPressed);
        // Greenfoot.playSound("bellRing.mp3");
    }
}
