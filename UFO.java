// UFO.java
// The UFO class contains methods to draw a single UFO with a designated size at designated location.
// The Scene class contains methods to build the scene
// Some of the methods may require methods in the <Utility.java> file

import java.awt.*;
import java.applet.*;

public class UFO 
{ 

    /** @param g the Graphics Object   @param x  @param y  @param width  @param height  
     * Postcondition- draws a single flying saucer with (x,y) as the top left corner. The bounding    
     * rectangle the UFO is contained within is width x height dimensions
     */

    public static void drawUFO (Graphics g, int x, int y, int width, int height)
    {
        // draws a single UFO at (x,y) with dimensions width by height
        g.setColor(Color.magenta);
        g.fillOval(x, y, width, height * 1/2);
        g.setColor(Color.yellow);
        g.fillArc(x +(width / 4), y * 90/100, width * 1/2, height * 2/3, 0, 180);
    }


    /** @param g the Graphics Object   @param numberOfUFO  
     * Postcondition- draws a fleet of numberOfUFO flying saucer by using a for loop     
     * to repeatedly call the drawUFO method. 
     */

    public static void fleetOfUFO (Graphics g, int numberOfUFO)
    {
       for (int k = 1; k <= numberOfUFO; k++)
           {
             int x = Utility.getRandomInteger(0,800);
             int y = Utility.getRandomInteger(0,400);
             int width = Utility.getRandomInteger(100,200);
             int height = Utility.getRandomInteger(100,200);
             drawUFO(g,x,y,width,height);
           }    
    }

}  