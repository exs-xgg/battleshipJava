
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//TODO top
@SuppressWarnings("serial")
public class InitializeGame extends JFrame implements ActionListener{
	Color red = new Color(255,0,0);
	Color black = new Color(0,0,0);
	int score1 = 0;
	static String name;
	public static JPanel[] homeBase = new JPanel[30];
	JFrame initGame = new JFrame();
	MainScreen tempObj = new MainScreen();
	JButton btnHelp = new JButton("HELP");
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
	 JLabel lblEnemyScore = new JLabel("ENEMY SCORE: ");
	 JLabel lblYourScore = new JLabel("YOUR SCORE:");
	 JLabel myScore = new JLabel("0");
	 JLabel enemyScore = new JLabel("0");
	 JPanel panel_1 = new JPanel();
	  JPanel panel_2 = new JPanel();
	  JPanel panel_3 = new JPanel();
	  JPanel panel_4 = new JPanel();
	  JPanel panel_5 = new JPanel();
	  JPanel panel_6 = new JPanel();
	  JPanel panel_7 = new JPanel();
	  JPanel panel_8 = new JPanel();
	  JPanel panel_9 = new JPanel();
	  JPanel panel_10 = new JPanel();
	  JPanel panel_11 = new JPanel();
	  JPanel panel_12 = new JPanel();
	  JPanel panel_13 = new JPanel();
	  JPanel panel_14 = new JPanel();
	  JPanel panel_15 = new JPanel();
	  JPanel panel_16 = new JPanel();
	  JPanel panel_17 = new JPanel();
	  JPanel panel_18 = new JPanel();
	  JPanel panel_19 = new JPanel();
	  JPanel panel_20 = new JPanel();
	  JPanel panel_21 = new JPanel();
	  JPanel panel_22 = new JPanel();
	  JPanel panel_23 = new JPanel();
	  JPanel panel_24 = new JPanel();
	  JPanel panel_25 = new JPanel();
	  JPanel panel_26 = new JPanel();
	  JPanel panel_27 = new JPanel();
	  JPanel panel_28 = new JPanel();
	  JPanel panel_29 = new JPanel();
	  JPanel panel_30 = new JPanel();
	  JPanel panel_31 = new JPanel();
	  JPanel panel_32 = new JPanel();
	  JPanel panel_33 = new JPanel();
	  JPanel panel_34 = new JPanel();
	  JPanel panel_35 = new JPanel();
	  JPanel panel_36 = new JPanel();
	  JPanel panel_37 = new JPanel();
	  JPanel panel_38 = new JPanel();
	  JPanel panel_39 = new JPanel();
	  JPanel panel_40 = new JPanel();
	  JPanel panel_41 = new JPanel();
	  JPanel panel_42 = new JPanel();
	  JPanel panel_43 = new JPanel();
	  JPanel panel_44 = new JPanel();
	  JPanel panel_45 = new JPanel();
	  JPanel panel_46 = new JPanel();
	  JPanel panel_47 = new JPanel();
	  JPanel panel_48 = new JPanel();
	  JPanel panel_49 = new JPanel();
	  JPanel panel_50 = new JPanel();
	  JPanel panel_51 = new JPanel();
	  JPanel panel_52 = new JPanel();
	  JPanel panel_53 = new JPanel();
	  JPanel panel_54 = new JPanel();
	  JPanel panel_55 = new JPanel();
	  JPanel panel_56 = new JPanel();
	  JPanel panel_57 = new JPanel();
	  JPanel panel_58 = new JPanel();
	  JPanel panel_59 = new JPanel();
	  JPanel panel_60 = new JPanel();
	  JPanel panel_61 = new JPanel();
	  JPanel panel_62 = new JPanel();
	  JPanel panel_63 = new JPanel();
	  JPanel panel_64 = new JPanel();
	  JPanel panel = new JPanel();
	 
	//TODO beginning of constructor
	public InitializeGame(){
		super("Set Up Game");
		grabArray();
		setIconImage(Toolkit.getDefaultToolkit().getImage(InitializeGame.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		getContentPane().setLayout(null);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnHelp.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Click on the coordinates to guide rockets to their destination.\n"
						+ "\n"
						+ "The Attacking grid is where you place your attacks.\n"
						+ "\n"
						+ "The Home grid displays your current fleet formation and enemy attacks.");
			}
		});
		btnHelp.setBounds(465, 408, 90, 34);
		getContentPane().add(btnHelp);
		
		//TODO COMPONENT ATTRIBUTION
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
		
		JLabel lblHomeGrid = new JLabel("HOME GRID");
		lblHomeGrid.setFont(new Font("Impact", Font.PLAIN, 20));
		lblHomeGrid.setBounds(661, 11, 130, 34);
		getContentPane().add(lblHomeGrid);
		
		JLabel lblAttackingGrid = new JLabel("ATTACKING GRID");
		lblAttackingGrid.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttackingGrid.setFont(new Font("Impact", Font.PLAIN, 20));
		lblAttackingGrid.setBounds(151, 12, 172, 32);
		getContentPane().add(lblAttackingGrid);
		lblEnemyScore.setBounds(579, 358, 97, 34);
		
		getContentPane().add(lblEnemyScore);
		lblYourScore.setBounds(579, 313, 90, 34);
		
		getContentPane().add(lblYourScore);
		myScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		myScore.setBounds(681, 306, 124, 41);
		
		getContentPane().add(myScore);
		enemyScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		enemyScore.setBounds(681, 351, 124, 41);
		
		getContentPane().add(enemyScore);
		panel_1.setBackground(new Color(102, 153, 102));
		panel_1.setBounds(577, 49, 28, 28);
		
		getContentPane().add(panel_1);
		panel_2.setBackground(new Color(102, 153, 102));
		panel_2.setBounds(608, 49, 28, 28);
		
		getContentPane().add(panel_2);
		panel_3.setBackground(new Color(102, 153, 102));
		panel_3.setBounds(638, 49, 28, 28);
		
		getContentPane().add(panel_3);
		panel_4.setBackground(new Color(102, 153, 102));
		panel_4.setBounds(669, 49, 28, 28);
		
		getContentPane().add(panel_4);
		panel_5.setBackground(new Color(102, 153, 102));
		panel_5.setBounds(701, 49, 28, 28);
		
		getContentPane().add(panel_5);
		panel_6.setBackground(new Color(102, 153, 102));
		panel_6.setBounds(733, 49, 28, 28);
		
		getContentPane().add(panel_6);
		panel_7.setBackground(new Color(102, 153, 102));
		panel_7.setBounds(765, 49, 28, 28);
		
		getContentPane().add(panel_7);
		panel_8.setBackground(new Color(102, 153, 102));
		panel_8.setBounds(796, 49, 28, 28);
		
		getContentPane().add(panel_8);
		panel_9.setBackground(new Color(102, 153, 102));
		panel_9.setBounds(577, 80, 28, 28);
		
		getContentPane().add(panel_9);
		panel_10.setBackground(new Color(102, 153, 102));
		panel_10.setBounds(608, 80, 28, 28);
		
		getContentPane().add(panel_10);
		panel_11.setBackground(new Color(102, 153, 102));
		panel_11.setBounds(638, 80, 28, 28);
		
		getContentPane().add(panel_11);
		panel_12.setBackground(new Color(102, 153, 102));
		panel_12.setBounds(669, 80, 28, 28);
		
		getContentPane().add(panel_12);
		panel_13.setBackground(new Color(102, 153, 102));
		panel_13.setBounds(701, 80, 28, 28);
		
		getContentPane().add(panel_13);
		panel_14.setBackground(new Color(102, 153, 102));
		panel_14.setBounds(733, 80, 28, 28);
		
		getContentPane().add(panel_14);
		panel_15.setBackground(new Color(102, 153, 102));
		panel_15.setBounds(765, 80, 28, 28);
		
		getContentPane().add(panel_15);
		panel_16.setBackground(new Color(102, 153, 102));
		panel_16.setBounds(796, 80, 28, 28);
		
		getContentPane().add(panel_16);
		panel_17.setBackground(new Color(102, 153, 102));
		panel_17.setBounds(577, 110, 28, 28);
		
		getContentPane().add(panel_17);
		panel_18.setBackground(new Color(102, 153, 102));
		panel_18.setBounds(608, 110, 28, 28);
		
		getContentPane().add(panel_18);
		panel_19.setBackground(new Color(102, 153, 102));
		panel_19.setBounds(638, 110, 28, 28);
		
		getContentPane().add(panel_19);
		panel_20.setBackground(new Color(102, 153, 102));
		panel_20.setBounds(669, 110, 28, 28);
		
		getContentPane().add(panel_20);
		panel_21.setBackground(new Color(102, 153, 102));
		panel_21.setBounds(701, 110, 28, 28);
		
		getContentPane().add(panel_21);
		panel_22.setBackground(new Color(102, 153, 102));
		panel_22.setBounds(733, 110, 28, 28);
		
		getContentPane().add(panel_22);
		panel_23.setBackground(new Color(102, 153, 102));
		panel_23.setBounds(765, 110, 28, 28);
		
		getContentPane().add(panel_23);
		panel_24.setBackground(new Color(102, 153, 102));
		panel_24.setBounds(796, 110, 28, 28);
		
		getContentPane().add(panel_24);
		panel_25.setBackground(new Color(102, 153, 102));
		panel_25.setBounds(577, 141, 28, 28);
		
		getContentPane().add(panel_25);
		panel_26.setBackground(new Color(102, 153, 102));
		panel_26.setBounds(608, 141, 28, 28);
		
		getContentPane().add(panel_26);
		panel_27.setBackground(new Color(102, 153, 102));
		panel_27.setBounds(638, 141, 28, 28);
		
		getContentPane().add(panel_27);
		panel_28.setBackground(new Color(102, 153, 102));
		panel_28.setBounds(669, 141, 28, 28);
		
		getContentPane().add(panel_28);
		panel_29.setBackground(new Color(102, 153, 102));
		panel_29.setBounds(701, 141, 28, 28);
		
		getContentPane().add(panel_29);
		panel_30.setBackground(new Color(102, 153, 102));
		panel_30.setBounds(733, 141, 28, 28);
		
		getContentPane().add(panel_30);
		panel_31.setBackground(new Color(102, 153, 102));
		panel_31.setBounds(765, 141, 28, 28);
		
		getContentPane().add(panel_31);
		panel_32.setBackground(new Color(102, 153, 102));
		panel_32.setBounds(796, 141, 28, 28);
		
		getContentPane().add(panel_32);
		panel_33.setBackground(new Color(102, 153, 102));
		panel_33.setBounds(577, 171, 28, 28);
		
		getContentPane().add(panel_33);
		panel_34.setBackground(new Color(102, 153, 102));
		panel_34.setBounds(608, 171, 28, 28);
		
		getContentPane().add(panel_34);
		panel_35.setBackground(new Color(102, 153, 102));
		panel_35.setBounds(638, 171, 28, 28);
		
		getContentPane().add(panel_35);
		panel_36.setBackground(new Color(102, 153, 102));
		panel_36.setBounds(669, 171, 28, 28);
		
		getContentPane().add(panel_36);
		panel_37.setBackground(new Color(102, 153, 102));
		panel_37.setBounds(701, 171, 28, 28);
		
		getContentPane().add(panel_37);
		panel_38.setBackground(new Color(102, 153, 102));
		panel_38.setBounds(733, 171, 28, 28);
		
		getContentPane().add(panel_38);
		panel_39.setBackground(new Color(102, 153, 102));
		panel_39.setBounds(765, 171, 28, 28);
		
		getContentPane().add(panel_39);
		panel_40.setBackground(new Color(102, 153, 102));
		panel_40.setBounds(796, 171, 28, 28);
		
		getContentPane().add(panel_40);
		panel_41.setBackground(new Color(102, 153, 102));
		panel_41.setBounds(577, 202, 28, 28);
		
		getContentPane().add(panel_41);
		panel_42.setBackground(new Color(102, 153, 102));
		panel_42.setBounds(608, 202, 28, 28);
		
		getContentPane().add(panel_42);
		panel_43.setBackground(new Color(102, 153, 102));
		panel_43.setBounds(638, 202, 28, 28);
		
		getContentPane().add(panel_43);
		panel_44.setBackground(new Color(102, 153, 102));
		panel_44.setBounds(669, 202, 28, 28);
		
		getContentPane().add(panel_44);
		panel_45.setBackground(new Color(102, 153, 102));
		panel_45.setBounds(701, 202, 28, 28);
		
		getContentPane().add(panel_45);
		panel_46.setBackground(new Color(102, 153, 102));
		panel_46.setBounds(733, 202, 28, 28);
		
		getContentPane().add(panel_46);
		panel_47.setBackground(new Color(102, 153, 102));
		panel_47.setBounds(765, 202, 28, 28);
		
		getContentPane().add(panel_47);
		panel_48.setBackground(new Color(102, 153, 102));
		panel_48.setBounds(796, 202, 28, 28);
		
		getContentPane().add(panel_48);
		panel_49.setBackground(new Color(102, 153, 102));
		panel_49.setBounds(577, 233, 28, 28);
		
		getContentPane().add(panel_49);
		panel_50.setBackground(new Color(102, 153, 102));
		panel_50.setBounds(608, 233, 28, 28);
		
		getContentPane().add(panel_50);
		panel_51.setBackground(new Color(102, 153, 102));
		panel_51.setBounds(638, 233, 28, 28);
		
		getContentPane().add(panel_51);
		panel_52.setBackground(new Color(102, 153, 102));
		panel_52.setBounds(669, 233, 28, 28);
		
		getContentPane().add(panel_52);
		panel_53.setBackground(new Color(102, 153, 102));
		panel_53.setBounds(701, 233, 28, 28);
		
		getContentPane().add(panel_53);
		panel_54.setBackground(new Color(102, 153, 102));
		panel_54.setBounds(733, 233, 28, 28);
		
		getContentPane().add(panel_54);
		panel_55.setBackground(new Color(102, 153, 102));
		panel_55.setBounds(765, 233, 28, 28);
		
		getContentPane().add(panel_55);
		panel_56.setBackground(new Color(102, 153, 102));
		panel_56.setBounds(796, 233, 28, 28);
		
		getContentPane().add(panel_56);
		panel_57.setBackground(new Color(102, 153, 102));
		panel_57.setBounds(577, 264, 28, 28);
		
		getContentPane().add(panel_57);
		panel_58.setBackground(new Color(102, 153, 102));
		panel_58.setBounds(608, 264, 28, 28);
		
		getContentPane().add(panel_58);
		panel_59.setBackground(new Color(102, 153, 102));
		panel_59.setBounds(638, 264, 28, 28);
		
		getContentPane().add(panel_59);
		panel_60.setBackground(new Color(102, 153, 102));
		panel_60.setBounds(669, 264, 28, 28);
		
		getContentPane().add(panel_60);
		panel_61.setBackground(new Color(102, 153, 102));
		panel_61.setBounds(701, 264, 28, 28);
		
		getContentPane().add(panel_61);
		panel_62.setBackground(new Color(102, 153, 102));
		panel_62.setBounds(733, 264, 28, 28);
		
		getContentPane().add(panel_62);
		panel_63.setBackground(new Color(102, 153, 102));
		panel_63.setBounds(765, 264, 28, 28);
		
		getContentPane().add(panel_63);
		panel_64.setBackground(new Color(102, 153, 102));
		panel_64.setBounds(796, 264, 28, 28);
		
		getContentPane().add(panel_64);
		panel.setBounds(566, 313, 239, 80);
		
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		//TODO ADD ACTION LISTENERS
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
		setSize(913,486);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		//TODO ARRAY GRAB
	public void grabArray(){
		for (int x = 0; x < homeBase.length ; x ++){
			homeBase[x] = SetShips.ships[x];
		}
	}
		
	//TODO ACTION PERFORMED
	public void actionPerformed(ActionEvent e){
		Object trigger = e.getSource();
		//method cycle of death
		if(isEnemyHit(trigger)){
			hit(trigger);
		}
		else{
			miss(trigger);
		}
		
		enemyAttack(panel_1);
		
	}	
	//TODO ENEMY PLACING GRID
	
	//TODO hit fxn
	
	
	public void miss(Object e){
		((JComponent) e).setBackground(black);
		JOptionPane.showMessageDialog(null, "It's a miss, General " + MainScreen.name1);
		((JComponent) e).setEnabled(false);
	}
	
	
	public void hit(Object e){
		score1 += 1;
		((JComponent) e).setBackground(red);
		String scoree = Integer.toString(score1);
		myScore.setText(scoree);
		JOptionPane.showMessageDialog(null, "It's a hit, General " + MainScreen.name1);
		((JComponent) e).setEnabled(false);
	}
	
	
	public boolean isEnemyHit(Object trigger){
	if ((trigger == button_5) || 
			(trigger == button_6) || 
			(trigger == button_7) || 
			(trigger == button_18) ||
			(trigger == button_20) ||
			(trigger == button_21) ||
			(trigger == button_22) ||
			(trigger == button_23) ||
			(trigger == button_26) ||
			(trigger == button_34) ||
			(trigger == button_39) ||
			(trigger == button_40) ||
			(trigger == button_42) ||
			(trigger == button_44) ||
			(trigger == button_50)){
		return true;
	}
	else return false;
	}
	public void enemyAttack(Object e){
		for (int x = 0;  x < homeBase.length ; x ++){
			if( e == homeBase[x]){
				homeBase[x].setBackground(red);
				JOptionPane.showMessageDialog(null,  "Captan, we've been hit!");
			}
		}
	}
}
