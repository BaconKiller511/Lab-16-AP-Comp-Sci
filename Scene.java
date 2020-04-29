// Scene.java
// The Scene Class contains methods to build 
// Some of the methods calls are for methods in the <Utility.java> file

import java.awt.*;
import java.applet.*;

public class Scene 
{

    /** @param g the Graphics Object    
     * Postcondition- Fills in a 1000 x 650 pixel sky, then uses a for loop to draw    
     *   numStars number of 'stars' in random locations in random color
     */

    public static void nightSky (Graphics g)
    {
        Utility.setBackground(g,Color.black);
        int numStars = 275;

        for (int counter = 1; counter <= numStars; counter++)
            {
                g.setColor(Utility.getRandomColor());
                int x = Utility.getRandomInteger(0, 997);
                int y = Utility.getRandomInteger(0, 647);
                g.fillRect(x, y, 3, 3);           
            }
    }

    /** @param g the Graphics Object    
     * Postcondition- draws a moon shape using two overlapping circles    
     */

    public static void moon (Graphics g)
    {
        // write commands to make a crescent moon somewhere in the sky. You choose size and color
        g.setColor(Color.white);
        g.fillOval(850, 100, 100, 100);
        g.setColor(Color.black);
        g.fillOval(820, 90, 90, 90);
    }

    /** @param g the Graphics Object    
     * Postcondition- draws a fence with two rails, and enough custom pickets to fill the background.    
     */

    public static void fence (Graphics g)
    {
        // 2 Cross Beams
        g.setColor(Color.darkGray);     // dark gray for cross beams
        g.fillRect(0,555,1000,10);              // draw one cross beam        
        g.fillRect(0,590,1000,10);              // draw other cross beam

        //  Create a row of pickets
        for (int x = 15; x <= 1000; x+=40)
            {
                Scene.picket(g, x, 650, 0, 0);
            }
            

        
    }

    /** @param g the Graphics Object   @param x  @param y  @param width  @param height  
     * Postcondition- draws a single polygon picket with (x,y) as the top left corner. The bounding    
     * rectangle the picket is contained within is width by height dimensions
     */

    private static void picket(Graphics g, int x, int y, int width, int height)
    {
                Polygon picket = new Polygon();
                picket.addPoint(x, y);
                picket.addPoint(x, y - 135);
                picket.addPoint(x - 5, y - 140);
                picket.addPoint(x + 5, y - 145);
                picket.addPoint(x + 15, y - 140);
                picket.addPoint(x + 10, y - 135);
                picket.addPoint(x + 10, y);
                g.fillPolygon(picket);
            
    } 

}  