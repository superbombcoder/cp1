Import java.awt.*;

Import java.awt.geom.Ellipse2D;

public class Shapes extends JComponent;

Public class Shapes extends JCpomponent[

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; // Creates a 2D Graphics object

		Rectangle box = new Rectangle(5, 10, 50, 30); //creating a rectangle object with (x equals 5) (y equals 10) (width 20) height 30
		
		g2.draw(box);// draws black box

		g2.setColor(Color.blue); //sets color blue pen

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);//first two perimeters where its located and second 2 parameters 

		g2.fill(circle); // fills circle blue 
	}
}
