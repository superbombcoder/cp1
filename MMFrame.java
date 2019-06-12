import javax.swing.JFrame;

public class MMFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("NFL");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		NFL.java r = new NFL();
		frame.add(r);
		frame.setVisible(true);
	}
}
