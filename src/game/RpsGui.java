package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RpsGui implements ActionListener {

	private JButton rock;
	private JButton paper;
	private JButton scissors;
	
	
	private JPanel contentFrame;

	public RpsGui()  {

		// Creating panel
		JPanel panel = new JPanel();

		// Creating buttons
		JButton rockButton = new JButton("Rock");
		rockButton.setBounds(20, 80, 80, 25);
		JButton paperButton = new JButton("Paper");
		paperButton.setBounds(50, 80, 80, 25);
		JButton scissorsButton = new JButton("Scizzors");
		scissorsButton.setBounds(80, 80, 80, 25);

		
		
		

		// Add buttons to panel
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);

		// add panel to frame
		// Creating frame
		JFrame frame = new JFrame("Rock, Paper, Scissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setTitle("Rock, Paper, Scissors");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}