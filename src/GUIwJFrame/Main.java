package GUIwJFrame;
import javax.swing.JFrame;



public class Main {

	public static void main(String[] args) {
		
		tuna tunaObject = new tuna();
		tunaObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates program when x program is pressed
		tunaObject.setSize(275,180);
		tunaObject.setVisible(true);
		
	}

}
