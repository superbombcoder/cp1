import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //creating a new JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops program from running when you exit out
		frame.setSize(400, 400); // setting size of frame
		Shapes r = new Shapes(); //a new shape object
		frame.add(r); // add r to frame putting r on the frame
		frame.setVisible(true); // make so you can see frame make it look visible
	}
}

