import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null )
        {
           Vector2D cannonToMouse = new Vector2D(mouse.getX()-getX(), mouse.getY()- getY());
           
           double adjacent = cannonToMouse.getX();
           double opposite = cannonToMouse.getY();
           
           double angleRadians = Math.atan2(opposite,adjacent);
           double angleDegrees = Math.toDegrees(angleRadians);
           
           setRotation((int) angleDegrees);
        }
        
    }
}
