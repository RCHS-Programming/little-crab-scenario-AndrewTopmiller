import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move();
        lookForWorm ();
        randomTurn();
        turnAtEdge();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upn a worm.
     * If we have,eat it. If not, do nothing.
     */
    public void lookForWorm()
    {        
        if ( isTouching(Worm.class) )
        {                
            removeTouching(Worm.class);        
        }
    }
    
    /*
     * make the Crab make random turns left or right
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
        if ( atWorldEdge() )
        {
            turn(17);
        }
    }

}
