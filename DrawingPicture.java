/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        drawGrid(g2);
        g2.setColor(Color.black);
	/******** Put your code here  *********/
        Rectangle box = new Rectangle(125, 100, 125, 100); //creating a rectangle object with (x equals 5) (y equals 10) (width 20) height 30
        g2.draw(box);// draws black box
        g2.setColor(Color.pink);
        g2.fill(box);
        
        
        
        g2.setColor(Color.blue); //sets color blue pen
        
        Rectangle box1 = new Rectangle(150, 125, 10, 10); //creating a rectangle object with (x equals 5) (y equals 10) (width 20) height 30
        g2.draw(box1);// draws black box
        g2.setColor(Color.pink);
        g2.fill(box1);
        
        g2.setColor(Color.blue); //sets color blue pen

        g2.draw(new Rectangle(50, 70, 50, 130));
        g2.draw(box);// draws black box
        g2.setColor(Color.pink);
        g2.fill(box1);
        
        g2.draw(new Rectangle(200, 125, 10, 10));//eyeball number 2
        
int xpoints[] = {175,125,250};
        int ypoints[] = {50,100,100};
        int npoints = 3;
        g.fillPolygon(xpoints, ypoints, npoints);
        
    
        
int xpoints1 [] = {40,75,125};
        int ypoints1 [] = {75,50,75};
        int npoints1  = 3;
        g.fillPolygon(xpoints1, ypoints1, npoints1);
        
        
        Ellipse2D.Double circle = new Ellipse2D.Double(300, 50, 100, 100);//first two perimeters where its located and second 2 parameters
        g2.setColor(Color.yellow); //sets color blue pen
        g2.fill(circle); // fills circle yellow
        g2.draw(new Line2D.Double(350, 80, 250, 50));
        g2.draw(new Line2D.Double(350,125, 250,150));
        g2.draw(new Line2D.Double(340, 50, 300, 15));

        
   	// comment this out once you have finished
        

    }
}
