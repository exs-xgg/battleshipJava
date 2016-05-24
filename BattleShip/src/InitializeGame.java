
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class InitializeGame extends JFrame implements ActionListener{
	
	int bomb = 0;
	static String name;
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
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JPanel panel_6 = new JPanel();
	private final JPanel panel_7 = new JPanel();
	private final JPanel panel_8 = new JPanel();
	private final JPanel panel_9 = new JPanel();
	private final JPanel panel_10 = new JPanel();
	private final JPanel panel_11 = new JPanel();
	private final JPanel panel_12 = new JPanel();
	private final JPanel panel_13 = new JPanel();
	private final JPanel panel_14 = new JPanel();
	private final JPanel panel_15 = new JPanel();
	private final JPanel panel_16 = new JPanel();
	private final JPanel panel_17 = new JPanel();
	private final JPanel panel_18 = new JPanel();
	private final JPanel panel_19 = new JPanel();
	private final JPanel panel_20 = new JPanel();
	private final JPanel panel_21 = new JPanel();
	private final JPanel panel_22 = new JPanel();
	private final JPanel panel_23 = new JPanel();
	private final JPanel panel_24 = new JPanel();
	private final JPanel panel_25 = new JPanel();
	private final JPanel panel_26 = new JPanel();
	private final JPanel panel_27 = new JPanel();
	private final JPanel panel_28 = new JPanel();
	private final JPanel panel_29 = new JPanel();
	private final JPanel panel_30 = new JPanel();
	private final JPanel panel_31 = new JPanel();
	private final JPanel panel_32 = new JPanel();
	private final JPanel panel_33 = new JPanel();
	private final JPanel panel_34 = new JPanel();
	private final JPanel panel_35 = new JPanel();
	private final JPanel panel_36 = new JPanel();
	private final JPanel panel_37 = new JPanel();
	private final JPanel panel_38 = new JPanel();
	private final JPanel panel_39 = new JPanel();
	private final JPanel panel_40 = new JPanel();
	private final JPanel panel_41 = new JPanel();
	private final JPanel panel_42 = new JPanel();
	private final JPanel panel_43 = new JPanel();
	private final JPanel panel_44 = new JPanel();
	private final JPanel panel_45 = new JPanel();
	private final JPanel panel_46 = new JPanel();
	private final JPanel panel_47 = new JPanel();
	private final JPanel panel_48 = new JPanel();
	private final JPanel panel_49 = new JPanel();
	private final JPanel panel_50 = new JPanel();
	private final JPanel panel_51 = new JPanel();
	private final JPanel panel_52 = new JPanel();
	private final JPanel panel_53 = new JPanel();
	private final JPanel panel_54 = new JPanel();
	private final JPanel panel_55 = new JPanel();
	private final JPanel panel_56 = new JPanel();
	private final JPanel panel_57 = new JPanel();
	private final JPanel panel_58 = new JPanel();
	private final JPanel panel_59 = new JPanel();
	private final JPanel panel_60 = new JPanel();
	private final JPanel panel_61 = new JPanel();
	private final JPanel panel_62 = new JPanel();
	private final JPanel panel_63 = new JPanel();
	//TODO beginning of constructor
	//asd
	public InitializeGame(){
		super("Set Up Game");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InitializeGame.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		getContentPane().setLayout(null);
		setVisible(false);
		
		
		btnHelp.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Click on the coordinates to guide rockets to their destination.\n"
						+ "\n"
						+ "The Attacking grid is where you place your attacks.\n"
						+ "\n"
						+ "The Home grid displays your current fleet formation and enemy attacks.");
			}
		});
		btnHelp.setBounds(465, 419, 90, 23);
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
		panel.setBackground(new Color(0, 153, 0));
		panel.setBounds(561, 114, 34, 34);
		
		getContentPane().add(panel);
		panel_1.setBackground(new Color(0, 153, 0));
		panel_1.setBounds(597, 114, 34, 34);
		
		getContentPane().add(panel_1);
		panel_2.setBackground(new Color(0, 153, 0));
		panel_2.setBounds(634, 114, 34, 34);
		
		getContentPane().add(panel_2);
		panel_3.setBackground(new Color(0, 153, 0));
		panel_3.setBounds(670, 114, 34, 34);
		
		getContentPane().add(panel_3);
		panel_4.setBackground(new Color(0, 153, 0));
		panel_4.setBounds(706, 114, 34, 34);
		
		getContentPane().add(panel_4);
		panel_5.setBackground(new Color(0, 153, 0));
		panel_5.setBounds(742, 114, 34, 34);
		
		getContentPane().add(panel_5);
		panel_6.setBackground(new Color(0, 153, 0));
		panel_6.setBounds(779, 114, 34, 34);
		
		getContentPane().add(panel_6);
		panel_7.setBackground(new Color(0, 153, 0));
		panel_7.setBounds(815, 114, 34, 34);
		
		getContentPane().add(panel_7);
		panel_8.setBackground(new Color(0, 153, 0));
		panel_8.setBounds(561, 149, 34, 34);
		
		getContentPane().add(panel_8);
		panel_9.setBackground(new Color(0, 153, 0));
		panel_9.setBounds(597, 149, 34, 34);
		
		getContentPane().add(panel_9);
		panel_10.setBackground(new Color(0, 153, 0));
		panel_10.setBounds(634, 149, 34, 34);
		
		getContentPane().add(panel_10);
		panel_11.setBackground(new Color(0, 153, 0));
		panel_11.setBounds(670, 149, 34, 34);
		
		getContentPane().add(panel_11);
		panel_12.setBackground(new Color(0, 153, 0));
		panel_12.setBounds(706, 149, 34, 34);
		
		getContentPane().add(panel_12);
		panel_13.setBackground(new Color(0, 153, 0));
		panel_13.setBounds(742, 149, 34, 34);
		
		getContentPane().add(panel_13);
		panel_14.setBackground(new Color(0, 153, 0));
		panel_14.setBounds(779, 149, 34, 34);
		
		getContentPane().add(panel_14);
		panel_15.setBackground(new Color(0, 153, 0));
		panel_15.setBounds(815, 149, 34, 34);
		
		getContentPane().add(panel_15);
		panel_16.setBackground(new Color(0, 153, 0));
		panel_16.setBounds(561, 185, 34, 34);
		
		getContentPane().add(panel_16);
		panel_17.setBackground(new Color(0, 153, 0));
		panel_17.setBounds(597, 185, 34, 34);
		
		getContentPane().add(panel_17);
		panel_18.setBackground(new Color(0, 153, 0));
		panel_18.setBounds(634, 185, 34, 34);
		
		getContentPane().add(panel_18);
		panel_19.setBackground(new Color(0, 153, 0));
		panel_19.setBounds(670, 185, 34, 34);
		
		getContentPane().add(panel_19);
		panel_20.setBackground(new Color(0, 153, 0));
		panel_20.setBounds(706, 185, 34, 34);
		
		getContentPane().add(panel_20);
		panel_21.setBackground(new Color(0, 153, 0));
		panel_21.setBounds(742, 185, 34, 34);
		
		getContentPane().add(panel_21);
		panel_22.setBackground(new Color(0, 153, 0));
		panel_22.setBounds(779, 185, 34, 34);
		
		getContentPane().add(panel_22);
		panel_23.setBackground(new Color(0, 153, 0));
		panel_23.setBounds(815, 185, 34, 34);
		
		getContentPane().add(panel_23);
		panel_24.setBackground(new Color(0, 153, 0));
		panel_24.setBounds(561, 221, 34, 34);
		
		getContentPane().add(panel_24);
		panel_25.setBackground(new Color(0, 153, 0));
		panel_25.setBounds(597, 221, 34, 34);
		
		getContentPane().add(panel_25);
		panel_26.setBackground(new Color(0, 153, 0));
		panel_26.setBounds(634, 221, 34, 34);
		
		getContentPane().add(panel_26);
		panel_27.setBackground(new Color(0, 153, 0));
		panel_27.setBounds(670, 221, 34, 34);
		
		getContentPane().add(panel_27);
		panel_28.setBackground(new Color(0, 153, 0));
		panel_28.setBounds(706, 221, 34, 34);
		
		getContentPane().add(panel_28);
		panel_29.setBackground(new Color(0, 153, 0));
		panel_29.setBounds(742, 221, 34, 34);
		
		getContentPane().add(panel_29);
		panel_30.setBackground(new Color(0, 153, 0));
		panel_30.setBounds(779, 221, 34, 34);
		
		getContentPane().add(panel_30);
		panel_31.setBackground(new Color(0, 153, 0));
		panel_31.setBounds(815, 221, 34, 34);
		
		getContentPane().add(panel_31);
		panel_32.setBackground(new Color(0, 153, 0));
		panel_32.setBounds(561, 256, 34, 34);
		
		getContentPane().add(panel_32);
		panel_33.setBackground(new Color(0, 153, 0));
		panel_33.setBounds(597, 256, 34, 34);
		
		getContentPane().add(panel_33);
		panel_34.setBackground(new Color(0, 153, 0));
		panel_34.setBounds(634, 256, 34, 34);
		
		getContentPane().add(panel_34);
		panel_35.setBackground(new Color(0, 153, 0));
		panel_35.setBounds(670, 256, 34, 34);
		
		getContentPane().add(panel_35);
		panel_36.setBackground(new Color(0, 153, 0));
		panel_36.setBounds(706, 256, 34, 34);
		
		getContentPane().add(panel_36);
		panel_37.setBackground(new Color(0, 153, 0));
		panel_37.setBounds(742, 256, 34, 34);
		
		getContentPane().add(panel_37);
		panel_38.setBackground(new Color(0, 153, 0));
		panel_38.setBounds(779, 256, 34, 34);
		
		getContentPane().add(panel_38);
		panel_39.setBackground(new Color(0, 153, 0));
		panel_39.setBounds(815, 256, 34, 34);
		
		getContentPane().add(panel_39);
		panel_40.setBackground(new Color(0, 153, 0));
		panel_40.setBounds(561, 291, 34, 34);
		
		getContentPane().add(panel_40);
		panel_41.setBackground(new Color(0, 153, 0));
		panel_41.setBounds(597, 291, 34, 34);
		
		getContentPane().add(panel_41);
		panel_42.setBackground(new Color(0, 153, 0));
		panel_42.setBounds(634, 291, 34, 34);
		
		getContentPane().add(panel_42);
		panel_43.setBackground(new Color(0, 153, 0));
		panel_43.setBounds(670, 291, 34, 34);
		
		getContentPane().add(panel_43);
		panel_44.setBackground(new Color(0, 153, 0));
		panel_44.setBounds(706, 291, 34, 34);
		
		getContentPane().add(panel_44);
		panel_45.setBackground(new Color(0, 153, 0));
		panel_45.setBounds(742, 291, 34, 34);
		
		getContentPane().add(panel_45);
		panel_46.setBackground(new Color(0, 153, 0));
		panel_46.setBounds(779, 291, 34, 34);
		
		getContentPane().add(panel_46);
		panel_47.setBackground(new Color(0, 153, 0));
		panel_47.setBounds(815, 291, 34, 34);
		
		getContentPane().add(panel_47);
		panel_48.setBackground(new Color(0, 153, 0));
		panel_48.setBounds(561, 43, 34, 34);
		
		getContentPane().add(panel_48);
		panel_49.setBackground(new Color(0, 153, 0));
		panel_49.setBounds(597, 43, 34, 34);
		
		getContentPane().add(panel_49);
		panel_50.setBackground(new Color(0, 153, 0));
		panel_50.setBounds(634, 43, 34, 34);
		
		getContentPane().add(panel_50);
		panel_51.setBackground(new Color(0, 153, 0));
		panel_51.setBounds(670, 43, 34, 34);
		
		getContentPane().add(panel_51);
		panel_52.setBackground(new Color(0, 153, 0));
		panel_52.setBounds(706, 43, 34, 34);
		
		getContentPane().add(panel_52);
		panel_53.setBackground(new Color(0, 153, 0));
		panel_53.setBounds(742, 43, 34, 34);
		
		getContentPane().add(panel_53);
		panel_54.setBackground(new Color(0, 153, 0));
		panel_54.setBounds(779, 43, 34, 34);
		
		getContentPane().add(panel_54);
		panel_55.setBackground(new Color(0, 153, 0));
		panel_55.setBounds(815, 43, 34, 34);
		
		getContentPane().add(panel_55);
		panel_56.setBackground(new Color(0, 153, 0));
		panel_56.setBounds(561, 79, 34, 34);
		
		getContentPane().add(panel_56);
		panel_57.setBackground(new Color(0, 153, 0));
		panel_57.setBounds(597, 79, 34, 34);
		
		getContentPane().add(panel_57);
		panel_58.setBackground(new Color(0, 153, 0));
		panel_58.setBounds(634, 79, 34, 34);
		
		getContentPane().add(panel_58);
		panel_59.setBackground(new Color(0, 153, 0));
		panel_59.setBounds(670, 79, 34, 34);
		
		getContentPane().add(panel_59);
		panel_60.setBackground(new Color(0, 153, 0));
		panel_60.setBounds(706, 79, 34, 34);
		
		getContentPane().add(panel_60);
		panel_61.setBackground(new Color(0, 153, 0));
		panel_61.setBounds(742, 79, 34, 34);
		
		getContentPane().add(panel_61);
		panel_62.setBackground(new Color(0, 153, 0));
		panel_62.setBounds(779, 79, 34, 34);
		
		getContentPane().add(panel_62);
		panel_63.setBackground(new Color(0, 153, 0));
		panel_63.setBounds(815, 79, 34, 34);
		
		getContentPane().add(panel_63);
		
		JLabel lblHomeGrid = new JLabel("HOME GRID");
		lblHomeGrid.setFont(new Font("Impact", Font.PLAIN, 20));
		lblHomeGrid.setBounds(661, 11, 130, 34);
		getContentPane().add(lblHomeGrid);
		
		JLabel lblAttackingGrid = new JLabel("ATTACKING GRID");
		lblAttackingGrid.setFont(new Font("Impact", Font.PLAIN, 20));
		lblAttackingGrid.setBounds(151, 12, 172, 32);
		getContentPane().add(lblAttackingGrid);
		
		
		
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
		
		

}//TODO WTF IS THIS
	public Object asd(int detect){
		switch(detect){
		case 1: return button_1;
		case 2: return button_2;
		case 3: return button_3;
		default: return button_64;
		}
		
		}
	//TODO ACTION PERFORMED
	
	public void actionPerformed(ActionEvent e){
		Object trigger = e.getSource();
		
		if(trigger == button_1){
			button_1.setBackground(new Color(0, 255, 51));
		}
		else if(trigger == button_2){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_3){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_4){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_5){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_6){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_7){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_8){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_9){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_10){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_11){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_12){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_13){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_14){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_15){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_16){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_17){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_18){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_19){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_20){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_21){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_22){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_23){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_24){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_25){
			JOptionPane.showMessageDialog(null, "Beng");			
		}
		else if(trigger == button_26){
			JOptionPane.showMessageDialog(null, "Beng");			
		}
		else if(trigger == button_27){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_28){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_29){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_30){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_31){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_32){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_33){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_34){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_35){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_36){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_37){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_38){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_39){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_40){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_41){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_42){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_43){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_44){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_45){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_46){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_47){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_48){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_49){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_50){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_51){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_52){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_53){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_54){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_55){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_56){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_57){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_58){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_59){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_60){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_61){
			JOptionPane.showMessageDialog(null, "Beng");
		}
		else if(trigger == button_63){
			JOptionPane.showMessageDialog(null, "Beng");		
		}
		else if(trigger == button_62){
			JOptionPane.showMessageDialog(null, "Beng");		
		}
		else if(trigger == button_64){
			JOptionPane.showMessageDialog(null, "Beng");		
		}
		else JOptionPane.showMessageDialog(null, "wtf");
		
		
	}	
}
/**
 * PROJECT: BATTLESHIP IN JAVA
 * CONCEPTUALIZED AND CODED BY:
 * >ROMEO MANUEL E. DAVID
 * >SHEENA GUBATON
 * 
 * WITH SPECIAL PARTICIPATION OF:
 * HAYDE E. CASTRO
 */

