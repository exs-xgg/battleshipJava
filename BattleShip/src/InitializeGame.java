
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class InitializeGame extends JFrame implements ActionListener{
	
	int bomb = 0;
	static String name;
	JFrame initGame = new JFrame();
	MainScreen tempObj = new MainScreen();
	JButton btnDone = new JButton("Fire!");
	JButton btnHelp = new JButton("HELP");
	JButton btnResetGame = new JButton("RESET GAME");
	JButton button_1 = new JButton("");
	JButton button_2 = new JButton("");
	JButton button_3 = new JButton("");
	JButton button_4 = new JButton("");
	JButton button_5 = new JButton("");
	JButton button_6 = new JButton("");
	JButton button_7 = new JButton("");
	JButton button_8 = new JButton("");
	JButton button_9 = new JButton("");
	JButton button_10 = new JButton("");
	JButton button_11 = new JButton("");
	JButton button_12 = new JButton("");
	JButton button_13 = new JButton("");
	JButton button_14 = new JButton("");
	JButton button_15 = new JButton("");
	JButton button_16 = new JButton("");
	JButton button_17 = new JButton("");
	JButton button_18 = new JButton("");
	JButton button_19 = new JButton("");
	JButton button_20 = new JButton("");
	JButton button_21 = new JButton("");
	JButton button_22 = new JButton("");
	JButton button_23 = new JButton("");
	JButton button_24 = new JButton("");
	JButton button_25 = new JButton("");
	JButton button_26 = new JButton("");
	JButton button_27 = new JButton("");
	JButton button_28 = new JButton("");
	JButton button_29 = new JButton("");
	JButton button_30 = new JButton("");
	JButton button_31 = new JButton("");
	JButton button_32 = new JButton("");
	JButton button_33 = new JButton("");
	JButton button_34 = new JButton("");
	JButton button_35 = new JButton("");
	JButton button_36 = new JButton("");
	JButton button_37 = new JButton("");
	JButton button_38 = new JButton("");
	JButton button_39 = new JButton("");
	JButton button_40 = new JButton("");
	JButton button_41 = new JButton("");
	JButton button_42 = new JButton("");
	JButton button_43 = new JButton("");
	JButton button_44 = new JButton("");
	JButton button_45 = new JButton("");
	JButton button_46 = new JButton("");
	JButton button_47 = new JButton("");
	JButton button_48 = new JButton("");
	JButton button_49 = new JButton("");
	JButton button_50 = new JButton("");
	JButton button_51 = new JButton("");
	JButton button_52 = new JButton("");
	JButton button_53 = new JButton("");
	JButton button_54 = new JButton("");
	JButton button_55 = new JButton("");
	JButton button_56 = new JButton("");
	JButton button_57 = new JButton("");
	JButton button_58 = new JButton("");
	JButton button_59 = new JButton("");
	JButton button_60 = new JButton("");
	JButton button_61 = new JButton("");
	JButton button_62 = new JButton("");
	JButton button_63 = new JButton("");
	JButton button_64 = new JButton("");
	public InitializeGame(){
		super("Set Up Game");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InitializeGame.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		getContentPane().setLayout(null);
		
		
		btnDone.setBackground(new Color(255, 51, 0));
		btnDone.setForeground(new Color(255, 255, 255));
		btnDone.addActionListener(new ActionListener() {
			//SET ON-CLICK LISTENER FOR FIRING BUTTON
			@Override public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "General " +name.toUpperCase() + ", engaging missile firing protocols now.");
			}
		});
		btnDone.setBounds(465, 358, 89, 51);
		getContentPane().add(btnDone);
		
		
		btnHelp.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Click on the coordinates to guide rockets to their destination.");
			}
		});
		btnHelp.setBounds(465, 419, 90, 23);
		getContentPane().add(btnHelp);
		
		
		btnResetGame.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "RESET");
			}
		});
		btnResetGame.setBounds(565, 419, 112, 23);
		getContentPane().add(btnResetGame);
		
		
		button_1.setBackground(new Color(153, 204, 255));
		button_1.setBounds(36, 43, 53, 51);
		getContentPane().add(button_1);
		
		
		button_2.setBackground(new Color(153, 204, 255));
		button_2.setBounds(88, 43, 53, 51);
		getContentPane().add(button_2);
		
		
		button_3.setBackground(new Color(153, 204, 255));
		button_3.setBounds(140, 43, 53, 51);
		getContentPane().add(button_3);
		
		
		button_4.setBackground(new Color(153, 204, 255));
		button_4.setBounds(192, 43, 53, 51);
		getContentPane().add(button_4);
		
		
		button_5.setBackground(new Color(153, 204, 255));
		button_5.setBounds(244, 43, 53, 51);
		getContentPane().add(button_5);
		
		
		button_6.setBackground(new Color(153, 204, 255));
		button_6.setBounds(295, 43, 53, 51);
		getContentPane().add(button_6);
		
		
		button_7.setBackground(new Color(153, 204, 255));
		button_7.setBounds(347, 43, 53, 51);
		getContentPane().add(button_7);
		
		
		button_8.setBackground(new Color(153, 204, 255));
		button_8.setBounds(398, 43, 53, 51);
		getContentPane().add(button_8);
		
		
		button_9.setBackground(new Color(153, 204, 255));
		button_9.setBounds(36, 93, 53, 51);
		getContentPane().add(button_9);
		
		
		button_10.setBackground(new Color(153, 204, 255));
		button_10.setBounds(88, 93, 53, 51);
		getContentPane().add(button_10);
		
		
		button_11.setBackground(new Color(153, 204, 255));
		button_11.setBounds(140, 93, 53, 51);
		getContentPane().add(button_11);
		
		
		button_12.setBackground(new Color(153, 204, 255));
		button_12.setBounds(192, 93, 53, 51);
		getContentPane().add(button_12);
		
		
		button_13.setBackground(new Color(153, 204, 255));
		button_13.setBounds(244, 93, 53, 51);
		getContentPane().add(button_13);
		
		
		button_14.setBackground(new Color(153, 204, 255));
		button_14.setBounds(295, 93, 53, 51);
		getContentPane().add(button_14);
		
	
		button_15.setBackground(new Color(153, 204, 255));
		button_15.setBounds(347, 93, 53, 51);
		getContentPane().add(button_15);
		
		
		button_16.setBackground(new Color(153, 204, 255));
		button_16.setBounds(398, 93, 53, 51);
		getContentPane().add(button_16);
		
		
		button_17.setBackground(new Color(153, 204, 255));
		button_17.setBounds(36, 142, 53, 51);
		getContentPane().add(button_17);
		
		
		button_18.setBackground(new Color(153, 204, 255));
		button_18.setBounds(88, 142, 53, 51);
		getContentPane().add(button_18);
		
		
		button_19.setBackground(new Color(153, 204, 255));
		button_19.setBounds(140, 142, 53, 51);
		getContentPane().add(button_19);
		
		
		button_20.setBackground(new Color(153, 204, 255));
		button_20.setBounds(192, 142, 53, 51);
		getContentPane().add(button_20);
		
		
		button_21.setBackground(new Color(153, 204, 255));
		button_21.setBounds(244, 142, 53, 51);
		getContentPane().add(button_21);
		
		
		button_22.setBackground(new Color(153, 204, 255));
		button_22.setBounds(295, 142, 53, 51);
		getContentPane().add(button_22);
		
		
		button_23.setBackground(new Color(153, 204, 255));
		button_23.setBounds(347, 142, 53, 51);
		getContentPane().add(button_23);
		
		
		button_24.setBackground(new Color(153, 204, 255));
		button_24.setBounds(398, 142, 53, 51);
		getContentPane().add(button_24);
		
		
		button_25.setBackground(new Color(153, 204, 255));
		button_25.setBounds(36, 192, 53, 51);
		getContentPane().add(button_25);
		
		
		button_26.setBackground(new Color(153, 204, 255));
		button_26.setBounds(88, 192, 53, 51);
		getContentPane().add(button_26);
		
		
		button_27.setBackground(new Color(153, 204, 255));
		button_27.setBounds(140, 192, 53, 51);
		getContentPane().add(button_27);
		
		
		button_28.setBackground(new Color(153, 204, 255));
		button_28.setBounds(192, 192, 53, 51);
		getContentPane().add(button_28);
		
		
		button_29.setBackground(new Color(153, 204, 255));
		button_29.setBounds(244, 192, 53, 51);
		getContentPane().add(button_29);
		
		
		button_30.setBackground(new Color(153, 204, 255));
		button_30.setBounds(295, 192, 53, 51);
		getContentPane().add(button_30);
		
		
		button_31.setBackground(new Color(153, 204, 255));
		button_31.setBounds(347, 192, 53, 51);
		getContentPane().add(button_31);
		
		
		button_32.setBackground(new Color(153, 204, 255));
		button_32.setBounds(398, 192, 53, 51);
		getContentPane().add(button_32);
		
		
		button_33.setBackground(new Color(153, 204, 255));
		button_33.setBounds(36, 241, 53, 51);
		getContentPane().add(button_33);
		
		
		button_34.setBackground(new Color(153, 204, 255));
		button_34.setBounds(88, 241, 53, 51);
		getContentPane().add(button_34);
		
		
		button_35.setBackground(new Color(153, 204, 255));
		button_35.setBounds(140, 241, 53, 51);
		getContentPane().add(button_35);
		
		
		button_36.setBackground(new Color(153, 204, 255));
		button_36.setBounds(192, 241, 53, 51);
		getContentPane().add(button_36);
		
		
		button_37.setBackground(new Color(153, 204, 255));
		button_37.setBounds(244, 241, 53, 51);
		getContentPane().add(button_37);
		
		
		button_38.setBackground(new Color(153, 204, 255));
		button_38.setBounds(295, 241, 53, 51);
		getContentPane().add(button_38);
		
		
		button_39.setBackground(new Color(153, 204, 255));
		button_39.setBounds(347, 241, 53, 51);
		getContentPane().add(button_39);
		
		
		button_40.setBackground(new Color(153, 204, 255));
		button_40.setBounds(398, 241, 53, 51);
		getContentPane().add(button_40);
		
		
		button_41.setBackground(new Color(153, 204, 255));
		button_41.setBounds(36, 291, 53, 51);
		getContentPane().add(button_41);
		
		
		button_42.setBackground(new Color(153, 204, 255));
		button_42.setBounds(88, 291, 53, 51);
		getContentPane().add(button_42);
		
		
		button_43.setBackground(new Color(153, 204, 255));
		button_43.setBounds(140, 291, 53, 51);
		getContentPane().add(button_43);
		
		
		button_44.setBackground(new Color(153, 204, 255));
		button_44.setBounds(192, 291, 53, 51);
		getContentPane().add(button_44);
		
		
		button_45.setBackground(new Color(153, 204, 255));
		button_45.setBounds(244, 291, 53, 51);
		getContentPane().add(button_45);
		
		
		button_46.setBackground(new Color(153, 204, 255));
		button_46.setBounds(295, 291, 53, 51);
		getContentPane().add(button_46);
		
		
		button_47.setBackground(new Color(153, 204, 255));
		button_47.setBounds(347, 291, 53, 51);
		getContentPane().add(button_47);
		
		
		button_48.setBackground(new Color(153, 204, 255));
		button_48.setBounds(398, 291, 53, 51);
		getContentPane().add(button_48);
		
		JButton btnHireTeam = new JButton("Hire Team </Scorpion>");
		btnHireTeam.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Walter went to visit Megan.\n"
						+ "Toby and Happy went on a date.\n"
						+ "Sylvester went to the comic store to buy SuperFunGuy Comics.\n"
						+ "Paige went to grab Ralph from school.\n"
						+ "You're fucked up, " + name.toUpperCase());
			}
		});
		btnHireTeam.setBounds(465, 44, 169, 23);
		getContentPane().add(btnHireTeam);
		
		JButton btnNewButton = new JButton("Use Atomic Bomb");
		btnNewButton.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Select where to drop the bomb");
			}
		});
		btnNewButton.setBounds(465, 78, 169, 23);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBackground(new Color(153, 204, 255));
		button.setBounds(564, 358, 53, 51);
		getContentPane().add(button);
		
		
		button_49.setBackground(new Color(153, 204, 255));
		button_49.setBounds(36, 341, 53, 51);
		getContentPane().add(button_49);
		
		
		button_50.setBackground(new Color(153, 204, 255));
		button_50.setBounds(88, 341, 53, 51);
		getContentPane().add(button_50);
		
		
		button_51.setBackground(new Color(153, 204, 255));
		button_51.setBounds(140, 341, 53, 51);
		getContentPane().add(button_51);
		
		
		button_52.setBackground(new Color(153, 204, 255));
		button_52.setBounds(192, 341, 53, 51);
		getContentPane().add(button_52);
		
		
		button_53.setBackground(new Color(153, 204, 255));
		button_53.setBounds(244, 341, 53, 51);
		getContentPane().add(button_53);
		
		
		button_54.setBackground(new Color(153, 204, 255));
		button_54.setBounds(295, 341, 53, 51);
		getContentPane().add(button_54);
		
		
		button_55.setBackground(new Color(153, 204, 255));
		button_55.setBounds(347, 341, 53, 51);
		getContentPane().add(button_55);
		
		
		button_56.setBackground(new Color(153, 204, 255));
		button_56.setBounds(398, 341, 53, 51);
		getContentPane().add(button_56);
		
		
		button_57.setBackground(new Color(153, 204, 255));
		button_57.setBounds(36, 391, 53, 51);
		getContentPane().add(button_57);
		
		
		button_58.setBackground(new Color(153, 204, 255));
		button_58.setBounds(88, 391, 53, 51);
		getContentPane().add(button_58);
		
		
		button_59.setBackground(new Color(153, 204, 255));
		button_59.setBounds(140, 391, 53, 51);
		getContentPane().add(button_59);
		
		
		button_60.setBackground(new Color(153, 204, 255));
		button_60.setBounds(192, 391, 53, 51);
		getContentPane().add(button_60);
		
		
		button_61.setBackground(new Color(153, 204, 255));
		button_61.setBounds(244, 391, 53, 51);
		getContentPane().add(button_61);
		
		
		button_62.setBackground(new Color(153, 204, 255));
		button_62.setBounds(295, 391, 53, 51);
		getContentPane().add(button_62);
		
		
		button_63.setBackground(new Color(153, 204, 255));
		button_63.setBounds(347, 391, 53, 51);
		getContentPane().add(button_63);
		
		
		button_64.setBackground(new Color(153, 204, 255));
		button_64.setBounds(398, 391, 53, 51);
		getContentPane().add(button_64);
		
		
		
		//ADD ACTION LISTENERS
		button_1.addActionListener(this);
		button_2.addActionListener(this);
		button_3.addActionListener(this);
		button_4.addActionListener(this);
		button_5.addActionListener(this);
		button_6.addActionListener(this);
		button_7.addActionListener(this);
		button_8.addActionListener(this);
		button_9.addActionListener(this);
		button_10.addActionListener(this);
		button_11.addActionListener(this);
		button_12.addActionListener(this);
		button_13.addActionListener(this);
		button_14.addActionListener(this);
		button_15.addActionListener(this);
		button_16.addActionListener(this);
		button_17.addActionListener(this);
		button_18.addActionListener(this);
		button_19.addActionListener(this);
		button_20.addActionListener(this);
		button_21.addActionListener(this);
		button_22.addActionListener(this);
		button_23.addActionListener(this);
		button_24.addActionListener(this);
		button_25.addActionListener(this);
		button_26.addActionListener(this);
		button_27.addActionListener(this);
		button_28.addActionListener(this);
		button_29.addActionListener(this);
		button_30.addActionListener(this);
		button_31.addActionListener(this);
		button_32.addActionListener(this);
		button_33.addActionListener(this);
		button_34.addActionListener(this);
		button_35.addActionListener(this);
		button_36.addActionListener(this);
		button_37.addActionListener(this);
		button_38.addActionListener(this);
		button_39.addActionListener(this);
		button_40.addActionListener(this);
		button_41.addActionListener(this);
		button_42.addActionListener(this);
		button_43.addActionListener(this);
		button_44.addActionListener(this);
		button_45.addActionListener(this);
		button_46.addActionListener(this);
		button_47.addActionListener(this);
		button_48.addActionListener(this);
		button_49.addActionListener(this);
		button_50.addActionListener(this);
		button_51.addActionListener(this);
		button_52.addActionListener(this);
		button_53.addActionListener(this);
		button_54.addActionListener(this);
		button_55.addActionListener(this);
		button_56.addActionListener(this);
		button_57.addActionListener(this);
		button_58.addActionListener(this);
		button_59.addActionListener(this);
		button_60.addActionListener(this);
		button_61.addActionListener(this);
		button_62.addActionListener(this);
		button_63.addActionListener(this);		
		button_64.addActionListener(this);
		
		//FRAME PROPERTIES
		
		setResizable(false);
		setSize(691,486);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		

}
	public Object asd(int detect){
		switch(detect){
		case 1: return button_1;
		case 2: return button_2;
		case 3: return button_3;
		default: return button_64;
		}
		
		}
	//ACTION PERFORMED
	
	public void actionPerformed(ActionEvent e){
		Object trigger = e.getSource();
		
		if(trigger == button_1){
			button_1.setBackground(new Color(0, 255, 51));
		}
		else if(trigger == button_2){
			
		}
		else if(trigger == button_3){
			
		}
		else if(trigger == button_4){
			
		}
		else if(trigger == button_5){
			
		}
		else if(trigger == button_6){
			
		}
		else if(trigger == button_7){
			
		}
		else if(trigger == button_8){
			
		}
		else if(trigger == button_9){
			
		}
		else if(trigger == button_10){
			
		}
		else if(trigger == button_11){
			
		}
		else if(trigger == button_12){
			
		}
		else if(trigger == button_13){
			
		}
		else if(trigger == button_14){
			
		}
		else if(trigger == button_15){
			
		}
		else if(trigger == button_16){
			
		}
		else if(trigger == button_17){
			
		}
		else if(trigger == button_18){
			
		}
		else if(trigger == button_19){
			
		}
		else if(trigger == button_20){
			
		}
		else if(trigger == button_21){
			
		}
		else if(trigger == button_22){
			
		}
		else if(trigger == button_23){
			
		}
		else if(trigger == button_24){
			
		}
		else if(trigger == button_25){
			
		}
		else if(trigger == button_26){
			
		}
		else if(trigger == button_27){
			
		}
		else if(trigger == button_28){
			
		}
		else if(trigger == button_29){
			
		}
		else if(trigger == button_30){
			
		}
		else if(trigger == button_31){
			
		}
		else if(trigger == button_32){
			
		}
		else if(trigger == button_33){
			
		}
		else if(trigger == button_34){
			
		}
		else if(trigger == button_35){
			
		}
		else if(trigger == button_36){
			
		}
		else if(trigger == button_37){
			
		}
		else if(trigger == button_38){
			
		}
		else if(trigger == button_39){
			
		}
		else if(trigger == button_40){
			
		}
		else if(trigger == button_41){
			
		}
		else if(trigger == button_42){
			
		}
		else if(trigger == button_43){
			
		}
		else if(trigger == button_44){
			
		}
		else if(trigger == button_45){
			
		}
		else if(trigger == button_46){
			
		}
		else if(trigger == button_47){
			
		}
		else if(trigger == button_48){
			
		}
		else if(trigger == button_49){
			
		}
		else if(trigger == button_50){
			
		}
		else if(trigger == button_51){
			
		}
		else if(trigger == button_52){
			
		}
		else if(trigger == button_53){
			
		}
		else if(trigger == button_54){
			
		}
		else if(trigger == button_55){
			
		}
		else if(trigger == button_56){
			
		}
		else if(trigger == button_57){
			
		}
		else if(trigger == button_58){
			
		}
		else if(trigger == button_59){
			
		}
		else if(trigger == button_60){
			
		}
		else if(trigger == button_61){
			
		}
		else if(trigger == button_63){
			JOptionPane.showMessageDialog(null, "63");			
		}
		else if(trigger == button_62){
			JOptionPane.showMessageDialog(null, "62");			
		}
		else if(trigger == button_64){
			JOptionPane.showMessageDialog(null, "64");			
		}
		else JOptionPane.showMessageDialog(null, "5555");
		
		
	}	
	

}
/**
 * PROJECT: BATTLESHIP IN JAVA
 * CONCEPTUALIZED AND CODED BY:
 * >ROMEO MANUEL E. DAVID
 * >SHEENA GUBATON
 * 
 * WITH SPECIAL PARTICIPATION OF:
 * HAYDE CASTRO
 */

