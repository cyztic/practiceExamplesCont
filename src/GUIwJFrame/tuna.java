package GUIwJFrame;
import java.awt.FlowLayout; //import how things are placed. default layout managing
import javax.swing.JFrame; //gives you basic window
import javax.swing.JLabel; // output texts and images on screen

public class tuna extends JFrame {

	private JLabel item1;
	
	public tuna(){
		super("The title bar"); //adds title to window
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is going to show up on hover");
		add(item1);
	}
	
}
