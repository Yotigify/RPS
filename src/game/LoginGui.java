package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGui implements ActionListener {

	private static JLabel userLabel;
	private static JLabel pwLabel;
	private static JTextField userText;
	private static JPasswordField pwText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String args[]) {
		
		//create panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		//Creating labels
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		pwLabel = new JLabel("Password");
		pwLabel.setBounds(10, 50, 80, 25);
		success = new JLabel();
		success.setBounds(10,110,300,25);

		//Creating Text Fields
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		pwText = new JPasswordField();
		pwText.setBounds(100, 50, 165, 25);

		//Creating Buttons
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new LoginGui());
		
		panel.add(button);
		panel.add(userLabel);
		panel.add(pwLabel);
		panel.add(userText);
		panel.add(pwText);
		panel.add(success);
		
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		char[] password = pwText.getPassword();
		success.setText("Login successful");
		
		//TODO: compare user and pw to a database of users from mySQL
		//TODO: Open RPSGUI and close login screen
		
	}
}