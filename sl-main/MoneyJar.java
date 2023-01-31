import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The MoneyJar is used to indicate how much money you currently have.
 * 
 * @author Sandro Lenz 
 * @version 2023-01-24
 */
public class MoneyJar extends Actor
{
    private GreenfootImage img0 = new GreenfootImage("MoneyJar_0.png");
    private GreenfootImage img1 = new GreenfootImage("MoneyJar_1.png");
    private GreenfootImage img2 = new GreenfootImage("MoneyJar_2.png");
    private GreenfootImage img3 = new GreenfootImage("MoneyJar_3.png");
    private GreenfootImage img4 = new GreenfootImage("MoneyJar_4.png");
    /**
     * Act
     */
    public void act()
    {
        updateImage();
    }
    
    /**
     * Update the image to reflect how much money the player has.
     */
    private void updateImage() {
        Restaurant world = (Restaurant)getWorld();
        double money = world.getMoney();
        if(money <= 10) {
            setImage(img0);
            return;
        } else if(money <= 25) {
            setImage(img1);
            return;
        } else if(money <= 50) {
            setImage(img2);
            return;
        } else if(money <= 75) {
            setImage(img3);
            return;
        } else {
            setImage(img4);
            return;
        }
    }
}
