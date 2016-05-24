import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SetShips extends JFrame implements ActionListener, MouseListener{
	//component declarations
	boolean isEntered = false;
	JButton btnCarrier = new JButton("SET CARRIER");
	JFrame setShips = new JFrame("");
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
	//CONSTRUCTOR
	//CONSTRUCTOR
	//CONSTRUCTOR
	public SetShips(){
		super("Set Your Ship Positions");
		setVisible(true);
		setResizable(false);
		setSize(619,520);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		//TODO constructor area 
		
		//LABELS AND ADJUSTMENTS
		JLabel lblA = new JLabel("A   B   C   D   E   F    G   H ");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Courier New", Font.PLAIN, 18));
		lblA.setBounds(25, 43, 426, 31);
		getContentPane().add(lblA);
		//lbl1
		JLabel label = new JLabel("1");
		label.setFont(new Font("Courier New", Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 66, 46, 44);
		getContentPane().add(label);
		//lbl2
		JLabel label_1 = new JLabel("2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_1.setBounds(10, 111, 46, 44);
		getContentPane().add(label_1);
		//lbl3
		JLabel label_2 = new JLabel("3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_2.setBounds(10, 156, 46, 46);
		getContentPane().add(label_2);
		//lbl4
		JLabel label_3 = new JLabel("4");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_3.setBounds(10, 201, 46, 44);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_4.setBounds(10, 246, 46, 44);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_5.setBounds(10, 291, 46, 44);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_6.setBounds(10, 336, 46, 44);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Courier New", Font.PLAIN, 18));
		label_7.setBounds(10, 381, 46, 44);
		getContentPane().add(label_7);
		getContentPane().setLayout(null);
		panel_1.setBounds(50, 66, 44, 44);
		panel_1.setForeground(new Color(51, 204, 204));
		panel_1.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_1);
		panel_2.setBounds(95, 66, 44, 44);
		
		
		panel_2.setForeground(new Color(51, 204, 204));
		panel_2.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_2);
		panel_3.setBounds(140, 66, 44, 44);
		
		
		panel_3.setForeground(new Color(51, 204, 204));
		panel_3.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_3);
		panel_4.setBounds(185, 66, 44, 44);
		
		panel_4.setForeground(new Color(51, 204, 204));
		panel_4.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_4);
		panel_5.setBounds(230, 66, 44, 44);
		
		
		panel_5.setForeground(new Color(51, 204, 204));
		panel_5.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_5);
		panel_6.setBounds(275, 66, 44, 44);
		
		
		panel_6.setForeground(new Color(51, 204, 204));
		panel_6.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_6);
		panel_7.setBounds(320, 66, 44, 44);
		
		
		panel_7.setForeground(new Color(51, 204, 204));
		panel_7.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_7);
		panel_8.setBounds(365, 66, 44, 44);
		
		
		panel_8.setForeground(new Color(51, 204, 204));
		panel_8.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_8);
		panel_9.setBounds(50, 111, 44, 44);
		
		
		panel_9.setForeground(new Color(51, 204, 204));
		panel_9.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_9);
		panel_10.setBounds(95, 111, 44, 44);
		
		
		panel_10.setForeground(new Color(51, 204, 204));
		panel_10.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_10);
		panel_11.setBounds(140, 111, 44, 44);
		
		
		panel_11.setForeground(new Color(51, 204, 204));
		panel_11.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_11);
		panel_12.setBounds(185, 111, 44, 44);
		
		
		panel_12.setForeground(new Color(51, 204, 204));
		panel_12.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_12);
		panel_13.setBounds(230, 111, 44, 44);
		
		
		panel_13.setForeground(new Color(51, 204, 204));
		panel_13.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_13);
		panel_14.setBounds(275, 111, 44, 44);
		
		
		panel_14.setForeground(new Color(51, 204, 204));
		panel_14.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_14);
		panel_15.setBounds(320, 111, 44, 44);
		
		
		panel_15.setForeground(new Color(51, 204, 204));
		panel_15.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_15);
		panel_16.setBounds(365, 111, 44, 44);
		
		
		panel_16.setForeground(new Color(51, 204, 204));
		panel_16.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_16);
		panel_17.setBounds(50, 156, 44, 44);
		
		
		panel_17.setForeground(new Color(51, 204, 204));
		panel_17.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_17);
		panel_18.setBounds(95, 156, 44, 44);
		
		
		panel_18.setForeground(new Color(51, 204, 204));
		panel_18.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_18);
		panel_19.setBounds(140, 156, 44, 44);
		
		
		panel_19.setForeground(new Color(51, 204, 204));
		panel_19.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_19);
		panel_20.setBounds(185, 156, 44, 44);
		
		
		panel_20.setForeground(new Color(51, 204, 204));
		panel_20.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_20);
		panel_21.setBounds(230, 156, 44, 44);
		
	
		panel_21.setForeground(new Color(51, 204, 204));
		panel_21.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_21);
		panel_22.setBounds(275, 156, 44, 44);
		
		
		panel_22.setForeground(new Color(51, 204, 204));
		panel_22.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_22);
		panel_23.setBounds(320, 156, 44, 44);
		
		
		panel_23.setForeground(new Color(51, 204, 204));
		panel_23.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_23);
		panel_24.setBounds(365, 156, 44, 44);
		
		
		panel_24.setForeground(new Color(51, 204, 204));
		panel_24.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_24);
		panel_25.setBounds(50, 201, 44, 44);
		
		
		panel_25.setForeground(new Color(51, 204, 204));
		panel_25.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_25);
		panel_26.setBounds(95, 201, 44, 44);
		
		
		panel_26.setForeground(new Color(51, 204, 204));
		panel_26.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_26);
		panel_27.setBounds(140, 201, 44, 44);
		
		
		panel_27.setForeground(new Color(51, 204, 204));
		panel_27.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_27);
		panel_28.setBounds(185, 201, 44, 44);
		
		
		panel_28.setForeground(new Color(51, 204, 204));
		panel_28.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_28);
		panel_29.setBounds(230, 201, 44, 44);
		
		
		panel_29.setForeground(new Color(51, 204, 204));
		panel_29.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_29);
		panel_30.setBounds(275, 201, 44, 44);
		
		
		panel_30.setForeground(new Color(51, 204, 204));
		panel_30.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_30);
		panel_31.setBounds(320, 201, 44, 44);
		
		
		panel_31.setForeground(new Color(51, 204, 204));
		panel_31.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_31);
		panel_32.setBounds(365, 201, 44, 44);
		
		
		panel_32.setForeground(new Color(51, 204, 204));
		panel_32.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_32);
		panel_33.setBounds(50, 246, 44, 44);
		
		
		panel_33.setForeground(new Color(51, 204, 204));
		panel_33.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_33);
		panel_34.setBounds(95, 246, 44, 44);
		
		
		panel_34.setForeground(new Color(51, 204, 204));
		panel_34.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_34);
		panel_35.setBounds(140, 246, 44, 44);
		
		
		panel_35.setForeground(new Color(51, 204, 204));
		panel_35.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_35);
		panel_36.setBounds(185, 246, 44, 44);
		
		
		panel_36.setForeground(new Color(51, 204, 204));
		panel_36.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_36);
		panel_37.setBounds(230, 246, 44, 44);
		
		
		panel_37.setForeground(new Color(51, 204, 204));
		panel_37.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_37);
		panel_38.setBounds(275, 246, 44, 44);
		
		
		panel_38.setForeground(new Color(51, 204, 204));
		panel_38.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_38);
		panel_39.setBounds(320, 246, 44, 44);
		
		
		panel_39.setForeground(new Color(51, 204, 204));
		panel_39.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_39);
		panel_40.setBounds(365, 246, 44, 44);
		
		
		panel_40.setForeground(new Color(51, 204, 204));
		panel_40.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_40);
		panel_41.setBounds(50, 291, 44, 44);
		
		
		panel_41.setForeground(new Color(51, 204, 204));
		panel_41.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_41);
		panel_42.setBounds(95, 291, 44, 44);
		
		
		panel_42.setForeground(new Color(51, 204, 204));
		panel_42.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_42);
		panel_43.setBounds(140, 291, 44, 44);
		
		
		panel_43.setForeground(new Color(51, 204, 204));
		panel_43.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_43);
		panel_44.setBounds(185, 291, 44, 44);
		
		
		panel_44.setForeground(new Color(51, 204, 204));
		panel_44.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_44);
		panel_45.setBounds(230, 291, 44, 44);
		
		
		panel_45.setForeground(new Color(51, 204, 204));
		panel_45.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_45);
		panel_46.setBounds(275, 291, 44, 44);
		
		
		panel_46.setForeground(new Color(51, 204, 204));
		panel_46.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_46);
		panel_47.setBounds(320, 291, 44, 44);
		
		
		panel_47.setForeground(new Color(51, 204, 204));
		panel_47.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_47);
		panel_48.setBounds(365, 291, 44, 44);
		
		
		panel_48.setForeground(new Color(51, 204, 204));
		panel_48.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_48);
		panel_49.setBounds(50, 336, 44, 44);
		
		
		panel_49.setForeground(new Color(51, 204, 204));
		panel_49.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_49);
		panel_50.setBounds(95, 336, 44, 44);
		
		
		panel_50.setForeground(new Color(51, 204, 204));
		panel_50.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_50);
		panel_51.setBounds(140, 336, 44, 44);
		
		
		panel_51.setForeground(new Color(51, 204, 204));
		panel_51.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_51);
		panel_52.setBounds(185, 336, 44, 44);
		
		
		panel_52.setForeground(new Color(51, 204, 204));
		panel_52.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_52);
		panel_53.setBounds(230, 336, 44, 44);
		
		
		panel_53.setForeground(new Color(51, 204, 204));
		panel_53.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_53);
		panel_54.setBounds(275, 336, 44, 44);
		
		
		panel_54.setForeground(new Color(51, 204, 204));
		panel_54.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_54);
		panel_55.setBounds(320, 336, 44, 44);
		
		
		panel_55.setForeground(new Color(51, 204, 204));
		panel_55.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_55);
		panel_56.setBounds(365, 336, 44, 44);
		
		
		panel_56.setForeground(new Color(51, 204, 204));
		panel_56.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_56);
		panel_57.setBounds(50, 381, 44, 44);
		
		
		panel_57.setForeground(new Color(51, 204, 204));
		panel_57.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_57);
		panel_58.setBounds(95, 381, 44, 44);
		
		
		panel_58.setForeground(new Color(51, 204, 204));
		panel_58.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_58);
		panel_59.setBounds(140, 381, 44, 44);
		
		
		panel_59.setForeground(new Color(51, 204, 204));
		panel_59.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_59);
		panel_60.setBounds(185, 381, 44, 44);
		
		
		panel_60.setForeground(new Color(51, 204, 204));
		panel_60.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_60);
		panel_61.setBounds(230, 381, 44, 44);
		
		
		panel_61.setForeground(new Color(51, 204, 204));
		panel_61.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_61);
		panel_62.setBounds(275, 381, 44, 44);
		
		
		panel_62.setForeground(new Color(51, 204, 204));
		panel_62.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_62);
		panel_63.setBounds(320, 381, 44, 44);
		
		
		panel_63.setForeground(new Color(51, 204, 204));
		panel_63.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_63);
		panel_64.setBounds(365, 381, 44, 44);
		
		
		panel_64.setForeground(new Color(51, 204, 204));
		panel_64.setBackground(new Color(0, 204, 255));
		getContentPane().add(panel_64);
		
		//TODO RESET fxn
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnCarrier.setText("SET CARRIER");
				panel_1.setBackground(new Color(0, 204, 255));
				 panel_2.setBackground(new Color(0, 204, 255));
				 panel_3.setBackground(new Color(0, 204, 255));
				 panel_4.setBackground(new Color(0, 204, 255));
				 panel_5.setBackground(new Color(0, 204, 255));
				 panel_6.setBackground(new Color(0, 204, 255));
				 panel_7.setBackground(new Color(0, 204, 255));
				 panel_8.setBackground(new Color(0, 204, 255));
				 panel_9.setBackground(new Color(0, 204, 255));
				 panel_10.setBackground(new Color(0, 204, 255));
				 panel_11.setBackground(new Color(0, 204, 255));
				 panel_12.setBackground(new Color(0, 204, 255));
				 panel_13.setBackground(new Color(0, 204, 255));
				 panel_14.setBackground(new Color(0, 204, 255));
				 panel_15.setBackground(new Color(0, 204, 255));
				 panel_16.setBackground(new Color(0, 204, 255));
				 panel_17.setBackground(new Color(0, 204, 255));
				 panel_18.setBackground(new Color(0, 204, 255));
				 panel_19.setBackground(new Color(0, 204, 255));
				 panel_20.setBackground(new Color(0, 204, 255));
				 panel_21.setBackground(new Color(0, 204, 255));
				 panel_22.setBackground(new Color(0, 204, 255));
				 panel_23.setBackground(new Color(0, 204, 255));
				 panel_24.setBackground(new Color(0, 204, 255));
				 panel_25.setBackground(new Color(0, 204, 255));
				 panel_26.setBackground(new Color(0, 204, 255));
				 panel_27.setBackground(new Color(0, 204, 255));
				 panel_28.setBackground(new Color(0, 204, 255));
				 panel_29.setBackground(new Color(0, 204, 255));
				 panel_30.setBackground(new Color(0, 204, 255));
				 panel_31.setBackground(new Color(0, 204, 255));
				 panel_32.setBackground(new Color(0, 204, 255));
				 panel_33.setBackground(new Color(0, 204, 255));
				 panel_34.setBackground(new Color(0, 204, 255));
				 panel_35.setBackground(new Color(0, 204, 255));
				 panel_36.setBackground(new Color(0, 204, 255));
				 panel_37.setBackground(new Color(0, 204, 255));
				 panel_38.setBackground(new Color(0, 204, 255));
				 panel_39.setBackground(new Color(0, 204, 255));
				 panel_40.setBackground(new Color(0, 204, 255));
				 panel_41.setBackground(new Color(0, 204, 255));
				 panel_42.setBackground(new Color(0, 204, 255));
				 panel_43.setBackground(new Color(0, 204, 255));
				 panel_44.setBackground(new Color(0, 204, 255));
				 panel_45.setBackground(new Color(0, 204, 255));
				 panel_46.setBackground(new Color(0, 204, 255));
				 panel_47.setBackground(new Color(0, 204, 255));
				 panel_48.setBackground(new Color(0, 204, 255));
				 panel_49.setBackground(new Color(0, 204, 255));
				 panel_50.setBackground(new Color(0, 204, 255));
				 panel_51.setBackground(new Color(0, 204, 255));
				 panel_52.setBackground(new Color(0, 204, 255));
				 panel_53.setBackground(new Color(0, 204, 255));
				 panel_54.setBackground(new Color(0, 204, 255));
				 panel_55.setBackground(new Color(0, 204, 255));
				 panel_56.setBackground(new Color(0, 204, 255));
				 panel_57.setBackground(new Color(0, 204, 255));
				 panel_58.setBackground(new Color(0, 204, 255));
				 panel_59.setBackground(new Color(0, 204, 255));
				 panel_60.setBackground(new Color(0, 204, 255));
				 panel_61.setBackground(new Color(0, 204, 255));
				 panel_62.setBackground(new Color(0, 204, 255));
				 panel_63.setBackground(new Color(0, 204, 255));
				 panel_64.setBackground(new Color(0, 204, 255));
				JOptionPane.showMessageDialog(null, "Reset!");
			}
		});
		btnReset.setFont(new Font("Impact", Font.PLAIN, 14));
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.RED);
		btnReset.setBounds(419, 381, 104, 43);
		getContentPane().add(btnReset);
		
		JLabel lblNewLabel = new JLabel("SET SHIP POSITIONS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel.setBounds(95, 11, 268, 37);
		getContentPane().add(lblNewLabel);
		
		//TODO selector
		btnCarrier.setBounds(419, 70, 184, 60);
		getContentPane().add(btnCarrier);
		btnCarrier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setBoat();
		}});
		panel_1.addMouseListener(this);
		panel_2.addMouseListener(this);
		panel_3.addMouseListener(this);
		panel_4.addMouseListener(this);
		panel_5.addMouseListener(this);
		panel_6.addMouseListener(this);
		panel_7.addMouseListener(this);
		panel_8.addMouseListener(this);
		panel_9.addMouseListener(this);
		panel_10.addMouseListener(this);
		panel_11.addMouseListener(this);
		panel_12.addMouseListener(this);
		panel_13.addMouseListener(this);
		panel_14.addMouseListener(this);
		panel_15.addMouseListener(this);
		panel_16.addMouseListener(this);
		panel_17.addMouseListener(this);
		panel_18.addMouseListener(this);
		panel_19.addMouseListener(this);
		panel_20.addMouseListener(this);
		panel_21.addMouseListener(this);
		panel_22.addMouseListener(this);
		panel_23.addMouseListener(this);
		panel_24.addMouseListener(this);
		panel_25.addMouseListener(this);
		panel_26.addMouseListener(this);
		panel_27.addMouseListener(this);
		panel_28.addMouseListener(this);
		panel_29.addMouseListener(this);
		panel_30.addMouseListener(this);
		panel_31.addMouseListener(this);
		panel_32.addMouseListener(this);
		panel_33.addMouseListener(this);
		panel_34.addMouseListener(this);
		panel_35.addMouseListener(this);
		panel_36.addMouseListener(this);
		panel_37.addMouseListener(this);
		panel_38.addMouseListener(this);
		panel_39.addMouseListener(this);
		panel_40.addMouseListener(this);
		panel_41.addMouseListener(this);
		panel_42.addMouseListener(this);
		panel_43.addMouseListener(this);
		panel_44.addMouseListener(this);
		panel_45.addMouseListener(this);
		panel_46.addMouseListener(this);
		panel_47.addMouseListener(this);
		panel_48.addMouseListener(this);
		panel_49.addMouseListener(this);
		panel_50.addMouseListener(this);
		panel_51.addMouseListener(this);
		panel_52.addMouseListener(this);
		panel_53.addMouseListener(this);
		panel_54.addMouseListener(this);
		panel_55.addMouseListener(this);
		panel_56.addMouseListener(this);
		panel_57.addMouseListener(this);
		panel_58.addMouseListener(this);
		panel_59.addMouseListener(this);
		panel_60.addMouseListener(this);
		panel_61.addMouseListener(this);
		panel_62.addMouseListener(this);
		panel_63.addMouseListener(this);
		panel_64.addMouseListener(this);
		
	}
	//TODO mouseClicked
	
	public void mouseClicked(MouseEvent arg0) {
		Object e = arg0.getSource();
		if (e == panel_1){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
		}
		else if (e == panel_2  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_3  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_4  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_5  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_6  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_7  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_8  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_9  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_10  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_11  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_12  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_13  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_14  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_15  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_16  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_17  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_18  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_19  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_20  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_21  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_22  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_23  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_24  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_25  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_26  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_27  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_28  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_29  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_30  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_31  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_32  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_33  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_34  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_35  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_36  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_37  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_38  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_39  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_40  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_41  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_42  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_43  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_44  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_45  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_46  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_47  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_48  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_49  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_50  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_51  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_52  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_53  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_54  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_55  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_56  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_57  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_58  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_59  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_60  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_61  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_62  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_63  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		else if (e == panel_64  ){
			((JComponent) e).setBackground(new Color(0,0,0));
			isEntered = true;
			}
		
	}
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	//ACTION PERFORMES
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	//TODO set ship fxn
	public void setBoat(){
	String content = btnCarrier.getText().toLowerCase();
	if (content.equals("set carrier")){
		if(isEntered){
	JOptionPane.showMessageDialog(null, "AircraftCarrier SET");
	JOptionPane.showMessageDialog(null, "Next, set the Battleship by selecting FOUR straight squares.");
	btnCarrier.setText("SET BATTLESHIP");
	isEntered = false;
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the CARRIER position");
			JOptionPane.showMessageDialog(null, "Set the CARRIER by selecting FIVE straight squares");
		}
		}
	
	else if(content.equals("set battleship")){
		if(isEntered){
		JOptionPane.showMessageDialog(null, "Battleship SET");
		JOptionPane.showMessageDialog(null, "Next, set the DESTROYER by selecting THREE straight squares.");
		btnCarrier.setText("SET DESTROYER");
		isEntered = false;
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the BATTLESHIP position");
			JOptionPane.showMessageDialog(null, "Set the BATTLESHIP by selecting FOUR straight squares");
		}
		}

	else if(content.equals("set destroyer")){
		if(isEntered){
		JOptionPane.showMessageDialog(null, "Destroyer SET");
		JOptionPane.showMessageDialog(null, "Next, set the FRIGATE by selecting TWO adjacent squares.");
		btnCarrier.setText("SET FRIGATE");	
		isEntered = false;			
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the DESTROYER position");
			JOptionPane.showMessageDialog(null, "Set the DESTROYER by selecting THREE straight squares");
		}
		}
	else  if(content.equals("set frigate")){
		if(isEntered){
		JOptionPane.showMessageDialog(null, "Frigate SET");
		JOptionPane.showMessageDialog(null, "Next, set the SUBMARINE by selecting ONE square.");
		btnCarrier.setText("SET SUBMARINE");
		isEntered = false;
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the FRIGATE position");
			JOptionPane.showMessageDialog(null, "Set the FRIGATE by selecting TWO squares");
		}
					
					}
	else if(content.equals("set submarine")){
		if(isEntered){
		JOptionPane.showMessageDialog(null, "SUBMARINE SET");
		JOptionPane.showMessageDialog(null, "YOU ARE NOW READY FOR WAR!");
		btnCarrier.setText("PROCEED");
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the SUBMARINE position");
			JOptionPane.showMessageDialog(null, "Set the SUBMARINE by selecting ONE square");
		}
		}
	else if(content.equals("proceed")){
		//TODO PROCEED FXN
		new InitializeGame().setVisible(true);;
		JOptionPane.showMessageDialog(null, "Let the Game Begin! ");
		JOptionPane.showMessageDialog(null, "Select a coordinate to begin your attack");
	}
}
}
