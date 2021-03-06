import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
   public void act()
    {
        move();
        lookForCrab ();
        randomTurn();
        turnAtEdge();
    }
    
    public void move()
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upn a Crab.
     * If we have,eat it. If not, do nothing.
     */
    public void lookForCrab()
    {        
        if ( isTouching(Crab.class) )
        {                
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    /*
     * make the Lobster make random turns left or right
     * between 0 and 45 degrees
     */
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100)<10)
        {
            turn( Greenfoot.getRandomNumber(91)-45);
        }
    }
    
    public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(17);
        }
    }
}
