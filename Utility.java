// Utility.java
// This file contains useful methods that can be used by several different programs.

import java.awt.*;
import java.applet.*;

public class Utility
{

    /** @param min an integer   @param max an integer
     *  @return  a random integer in the range of [min,max] inclusive
     */
    public static int getRandomInteger(int min, int max)
    {
        int randInt = 0; 
        int range   = max - min + 1;
        
        randInt     = ((int)(Math.random() * range) + min);
        
        return randInt; 
    }


    /** @param g the Graphics Object   @param c the Color object 
     * Postcondition- a rectangle of 1000 by 650 pixels is drawn on g using   
     * Color c
     */
    public static void setBackground(Graphics g, Color c)
    {
        // implement code here
        g.setColor(Color.black);
        g.fillRect(0, 0, 1000, 650);
    }


    /** This method generates a random color using red, green, and blue integers.   
     *   @return a randomly generated Color object
     */
    public static Color getRandomColor()
    {
        int red   = getRandomInteger(0,255);
        int green = getRandomInteger(0,255);
        int blue  = getRandomInteger(0,255);
        return new Color(red, green, blue);
    }

   
    /** This method can put a pause in your code. Useful for animating things!    
     *   @param int milliseconds is the number of milliseconds to pause.
     *   You don't need to use this unless you want to cause your code to pause.
     */
    public static void pause(int milliseconds)
    {
        try 
        {
            //thread to sleep for the specified number of milliseconds
            Thread.sleep(milliseconds);
        } 
        catch ( java.lang.InterruptedException ie) 
        {
            System.out.println(ie);
        }

    }

}
