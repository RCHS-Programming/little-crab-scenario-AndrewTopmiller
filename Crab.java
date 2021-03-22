import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    public Crab()
    {
        image1=new GreenfootImage("crab.png");
        image2=new GreenfootImage("crab.png");
        setImage(image1);
    }
    public void act()
    {
        move();
        lookForWorm ();
        turnCrab();
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
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    public void turnCrab()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn (4); 
        }
    }
}
