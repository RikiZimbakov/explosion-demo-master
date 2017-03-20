import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * explode plays a metal explosion sound once the act botton is pressed and adds 50 new
     * debris objects to the world and then after the objects are added the rock is removed 
     * from the world
     * @param there are no parameters
     * @return nothing is returned
     */
    private void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");

        for( int i = 0; i < 50; i++ )
        {
            getWorld().addObject(new Debris(), getX(), getY());

        }
        getWorld().removeObject(this);
    }

    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        explode();
    }    
}
