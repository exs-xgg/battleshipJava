import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
@SuppressWarnings("serial")
public class LoadingGame extends JFrame{
JFrame loading = new JFrame();

public LoadingGame(){	
	super("Loading Game, please wait!");
	getContentPane().setBackground(new Color(0, 153, 204));
	getContentPane().setForeground(new Color(0, 153, 204));
	setResizable(false);
	setLocationRelativeTo(null);
	getContentPane().setLayout(null);
	
	JLabel lblGameLoadingpleaseWait = new JLabel("Game Loading...Please Wait!");
	lblGameLoadingpleaseWait.setForeground(new Color(255, 255, 255));
	lblGameLoadingpleaseWait.setFont(new Font("Impact", Font.PLAIN, 25));
	lblGameLoadingpleaseWait.setBounds(78, 11, 397, 84);
	getContentPane().add(lblGameLoadingpleaseWait);
	setVisible(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
}
