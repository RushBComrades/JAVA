package guiJFrame;

import javax.swing.JFrame;
/*
import javax.swing.JOptionPane;

public static void main(String[] args) {
	String fn = JOptionPane.showInputDialog("Enter first number");
	String sn = JOptionPane.showInputDialog("Enter second number");
	int num1 = Integer.parseInt(fn);
	int num2 = Integer.parseInt(sn);
	int sum = num1 + num2;
	JOptionPane.showMessageDialog(null, "The sum is "+sum, "I AM BECOME DEATH, DESTROYER OF WORLDS",JOptionPane.PLAIN_MESSAGE);
}
*/
public class main {
	public static void main(String[] args) {
		guiSetup mainWindow = new guiSetup();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(1000,1000);
		mainWindow.setVisible(true);
	}
}
