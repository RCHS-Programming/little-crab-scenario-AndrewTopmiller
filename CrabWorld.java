import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        
        showText("Score:0", 50, 500);
        addObject(new Crab(), 150,100);
        addObject(new Lobster(), 400, 300);
        addObject(new Lobster(), 400, 300);
        addObject(new Lobster(), 400, 300);
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
        addObject(new Worm(),Greenfoot.getRandomNumber (561), Greenfoot.getRandomNumber(561));
    }
}