// Lab07ufo.java
// @author: 
// @version: 
// This is the driving method for this lab. You should NOT change much within this method except for 
// small amounts of testing.

import java.awt.*;
import java.applet.*;
import java.util.*;  
import javax.swing.JFrame; 																

public class  Lab07ufo extends Canvas
{

    public void paint(Graphics g) 	
    {
        Scene.nightSky(g);  
        Scene.moon(g);
        Scene.fence(g);
        UFO.drawUFO(g,400,100,90,30); //draws a UFO at (200,300) with size 180 wide by 120 ht
        //UFO.fleetOfUFO(g,5);  // draws a fleet of 5 UFO's in the night sky.

    }

    /**
     *  Don't Change the Main Method below this	unless you’re changing the name of the CLASS! 
     *
     */ 
    public static void main(String[] args) 
    {	 
        Lab07ufo m= new	Lab07ufo();  // This name	should match the class name at top.
        JFrame f = new JFrame();  
        f.add(m);	 
        f.setSize(1000,1000);	//	sets frame size to 1600	x 1000
        f.setVisible(true);  // Shows the	paint	window with	the results
    }		
}

