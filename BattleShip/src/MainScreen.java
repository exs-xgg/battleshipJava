
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
@SuppressWarnings("serial")
public class MainScreen extends JFrame implements ActionListener{
	/**
	 * 
	 */
	public static String name1;
	JTextField txtName;
	
	public MainScreen() {
		super("BattleShip");
		getContentPane().setForeground(new Color(0, 204, 204));
		getContentPane().setBackground(SystemColor.textHighlight);
		setSize(453,305);
		getContentPane().setLayout(null);
		
		JLabel text1 = new JLabel("BATTLESHIP");
		text1.setBounds(38, 0, 375, 119);
		text1.setForeground(new Color(204, 0, 51));
		text1.setFont(new Font("Impact", Font.PLAIN, 50));
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(text1);
		
		JLabel lblEnterYourName = new JLabel("Enter player name and press START");
		lblEnterYourName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterYourName.setForeground(Color.WHITE);
		lblEnterYourName.setBounds(101, 102, 271, 23);
		getContentPane().add(lblEnterYourName);
		
		txtName = new JTextField("");
		txtName.setBounds(122, 131, 216, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(178, 179, 89, 23);
		getContentPane().add(btnStart);
		btnStart.addActionListener(this);		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	//
	public void actionPerformed(ActionEvent e){

		name1 = txtName.getText().toUpperCase();
		InitializeGame.name = name1;
		if (name1.equals("")){
			JOptionPane.showMessageDialog(null,"        Enter your name :P");
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Welcome, General "+ name1.toUpperCase() + ", let's prepare for WAR!");
			swapWindows();
			
			
		}
			
	}
	public void swapWindows(){
	super.setVisible(false);
	new InitializeGame().setVisible(true);
	JOptionPane.showMessageDialog(null, "Set the AircraftCarrier's Position. Select 5 straight squares.");
	}

	
}
