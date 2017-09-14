package GUI;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Enter your first number: ");
		String sn = JOptionPane.showInputDialog("Enter your second number: ");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null,  "The answer is: "+ sum, "SumGenerator", JOptionPane.PLAIN_MESSAGE);
		//first arg: position of output, 2nd arg: what you want to output, 
		//3rd arg: title, 4th arg: for icons
	}

}
