package guiJFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class guiSetup extends JFrame{
	private JLabel object1;
	/*
	public guiSetup() {
		super("WELCOME");
		setLayout(new FlowLayout());
		object1 = new JLabel("This be a sentence");
		object1.setToolTipText("hover boi");
		add(object1);
	}
	*/
	private JTextField  object2;
	private JTextField  object3;
	private JTextField  object4;
	private JPasswordField passwordField;
	public guiSetup() {
		super("SHALLOM");
		setLayout(new FlowLayout());
		object2 = new JTextField(10);
		add(object2);
		object3 = new JTextField("Enter Text Here");
		add(object3);
		object4 = new JTextField("OOF.JPG", 20);
		object4.setEditable(false);
		add(object4);
		passwordField = new JPasswordField("space");
		add(passwordField);
		handler handler1 = new handler();
		object2.addActionListener(handler1);
		object3.addActionListener(handler1);
		object4.addActionListener(handler1);
		passwordField.addActionListener(handler1);
	}
	private class handler implements ActionListener{
		public void actionPerformed(ActionEvent event1) {
			String string = "";
			if(event1.getSource()== object2) {
				string=String.format("field 1: %s", event1.getActionCommand());
			}
			else if(event1.getSource()== object3) {
				string=String.format("field 2: %s", event1.getActionCommand());
			}
			else if(event1.getSource()== object4) {
				string=String.format("field 3: %s", event1.getActionCommand());
			}
			else if(event1.getSource()==passwordField) {
				string=String.format("password field is : %s", event1.getActionCommand());
			}
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
