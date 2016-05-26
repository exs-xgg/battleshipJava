import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class SetShips extends JFrame implements ActionListener, MouseListener{
	//component declarations
	//TODO
	boolean isEntered = false;
	int count = 0;
	public static String[] ships = new String[30];
	public static int arrayAssist = 0;
	Color blue= new Color(0,0,0);

	JLabel lblNewLabel = new JLabel("SETTING CARRIER");
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//TODO constructor area 
		//reset array
		resetArray();
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
		getContentPane().add(panel_1);
		panel_2.setBounds(95, 66, 44, 44);
		getContentPane().add(panel_2);
		panel_3.setBounds(140, 66, 44, 44);
		getContentPane().add(panel_3);
		panel_4.setBounds(185, 66, 44, 44);
		getContentPane().add(panel_4);
		panel_5.setBounds(230, 66, 44, 44);
		getContentPane().add(panel_5);
		panel_6.setBounds(275, 66, 44, 44);
		getContentPane().add(panel_6);
		panel_7.setBounds(320, 66, 44, 44);
		getContentPane().add(panel_7);
		panel_8.setBounds(365, 66, 44, 44);
		getContentPane().add(panel_8);
		panel_9.setBounds(50, 111, 44, 44);
		getContentPane().add(panel_9);
		panel_10.setBounds(95, 111, 44, 44);
		getContentPane().add(panel_10);
		panel_11.setBounds(140, 111, 44, 44);
		getContentPane().add(panel_11);
		panel_12.setBounds(185, 111, 44, 44);
		getContentPane().add(panel_12);
		panel_13.setBounds(230, 111, 44, 44);
		getContentPane().add(panel_13);
		panel_14.setBounds(275, 111, 44, 44);
		getContentPane().add(panel_14);
		panel_15.setBounds(320, 111, 44, 44);
		getContentPane().add(panel_15);
		panel_16.setBounds(365, 111, 44, 44);
		getContentPane().add(panel_16);
		panel_17.setBounds(50, 156, 44, 44);
		getContentPane().add(panel_17);
		panel_18.setBounds(95, 156, 44, 44);
		getContentPane().add(panel_18);
		panel_19.setBounds(140, 156, 44, 44);
		getContentPane().add(panel_19);
		panel_20.setBounds(185, 156, 44, 44);
		getContentPane().add(panel_20);
		panel_21.setBounds(230, 156, 44, 44);
		getContentPane().add(panel_21);
		panel_22.setBounds(275, 156, 44, 44);
		getContentPane().add(panel_22);
		panel_23.setBounds(320, 156, 44, 44);
		getContentPane().add(panel_23);
		panel_24.setBounds(365, 156, 44, 44);
		getContentPane().add(panel_24);
		panel_25.setBounds(50, 201, 44, 44);
		getContentPane().add(panel_25);
		panel_26.setBounds(95, 201, 44, 44);
		getContentPane().add(panel_26);
		panel_27.setBounds(140, 201, 44, 44);
		getContentPane().add(panel_27);
		panel_28.setBounds(185, 201, 44, 44);
		getContentPane().add(panel_28);
		panel_29.setBounds(230, 201, 44, 44);
		getContentPane().add(panel_29);
		panel_30.setBounds(275, 201, 44, 44);
		getContentPane().add(panel_30);
		panel_31.setBounds(320, 201, 44, 44);
		getContentPane().add(panel_31);
		panel_32.setBounds(365, 201, 44, 44);
		getContentPane().add(panel_32);
		panel_33.setBounds(50, 246, 44, 44);
		getContentPane().add(panel_33);
		panel_34.setBounds(95, 246, 44, 44);
		getContentPane().add(panel_34);
		panel_35.setBounds(140, 246, 44, 44);
		getContentPane().add(panel_35);
		panel_36.setBounds(185, 246, 44, 44);
		getContentPane().add(panel_36);
		panel_37.setBounds(230, 246, 44, 44);
		getContentPane().add(panel_37);
		panel_38.setBounds(275, 246, 44, 44);
		getContentPane().add(panel_38);
		panel_39.setBounds(320, 246, 44, 44);
		getContentPane().add(panel_39);
		panel_40.setBounds(365, 246, 44, 44);
		getContentPane().add(panel_40);
		panel_41.setBounds(50, 291, 44, 44);
		getContentPane().add(panel_41);
		panel_42.setBounds(95, 291, 44, 44);
		getContentPane().add(panel_42);
		panel_43.setBounds(140, 291, 44, 44);
		getContentPane().add(panel_43);
		panel_44.setBounds(185, 291, 44, 44);
		getContentPane().add(panel_44);
		panel_45.setBounds(230, 291, 44, 44);
		getContentPane().add(panel_45);
		panel_46.setBounds(275, 291, 44, 44);
		getContentPane().add(panel_46);
		panel_47.setBounds(320, 291, 44, 44);
		getContentPane().add(panel_47);
		panel_48.setBounds(365, 291, 44, 44);
		getContentPane().add(panel_48);
		panel_49.setBounds(50, 336, 44, 44);
		getContentPane().add(panel_49);
		panel_50.setBounds(95, 336, 44, 44);
		getContentPane().add(panel_50);
		panel_51.setBounds(140, 336, 44, 44);
		getContentPane().add(panel_51);
		panel_52.setBounds(185, 336, 44, 44);
		getContentPane().add(panel_52);
		panel_53.setBounds(230, 336, 44, 44);
		getContentPane().add(panel_53);
		panel_54.setBounds(275, 336, 44, 44);
		getContentPane().add(panel_54);
		panel_55.setBounds(320, 336, 44, 44);
		getContentPane().add(panel_55);
		panel_56.setBounds(365, 336, 44, 44);
		getContentPane().add(panel_56);
		panel_57.setBounds(50, 381, 44, 44);
		getContentPane().add(panel_57);
		panel_58.setBounds(95, 381, 44, 44);
		getContentPane().add(panel_58);
		panel_59.setBounds(140, 381, 44, 44);
		getContentPane().add(panel_59);
		panel_60.setBounds(185, 381, 44, 44);
		getContentPane().add(panel_60);
		panel_61.setBounds(230, 381, 44, 44);
		getContentPane().add(panel_61);
		panel_62.setBounds(275, 381, 44, 44);
		getContentPane().add(panel_62);
		panel_63.setBounds(320, 381, 44, 44);
		getContentPane().add(panel_63);
		panel_64.setBounds(365, 381, 44, 44);
		getContentPane().add(panel_64);
		setAttributes(panel_1);
		setAttributes(panel_2);
		setAttributes(panel_3);
		setAttributes(panel_4);
		setAttributes(panel_5);
		setAttributes(panel_6);
		setAttributes(panel_7);
		setAttributes(panel_8);
		setAttributes(panel_9);
		setAttributes(panel_10);
		setAttributes(panel_11);
		setAttributes(panel_12);
		setAttributes(panel_13);
		setAttributes(panel_14);
		setAttributes(panel_15);
		setAttributes(panel_16);
		setAttributes(panel_17);
		setAttributes(panel_18);
		setAttributes(panel_19);
		setAttributes(panel_20);
		setAttributes(panel_21);
		setAttributes(panel_22);
		setAttributes(panel_23);
		setAttributes(panel_24);
		setAttributes(panel_25);
		setAttributes(panel_26);
		setAttributes(panel_27);
		setAttributes(panel_28);
		setAttributes(panel_29);
		setAttributes(panel_30);
		setAttributes(panel_31);
		setAttributes(panel_32);
		setAttributes(panel_33);
		setAttributes(panel_34);
		setAttributes(panel_35);
		setAttributes(panel_36);
		setAttributes(panel_37);
		setAttributes(panel_38);
		setAttributes(panel_39);
		setAttributes(panel_40);
		setAttributes(panel_41);
		setAttributes(panel_42);
		setAttributes(panel_43);
		setAttributes(panel_44);
		setAttributes(panel_45);
		setAttributes(panel_46);
		setAttributes(panel_47);
		setAttributes(panel_48);
		setAttributes(panel_49);
		setAttributes(panel_50);
		setAttributes(panel_51);
		setAttributes(panel_52);
		setAttributes(panel_53);
		setAttributes(panel_54);
		setAttributes(panel_55);
		setAttributes(panel_56);
		setAttributes(panel_57);
		setAttributes(panel_58);
		setAttributes(panel_59);
		setAttributes(panel_60);
		setAttributes(panel_61);
		setAttributes(panel_62);
		setAttributes(panel_63);
		setAttributes(panel_64);
		//TODO RESET fxn
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnCarrier.setText("SET CARRIER");
				lblNewLabel.setText("SETTING CARRIER");;
				arrayAssist = 0;
				count =0;
				//RESET FXN
				resetArray();
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
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel.setBounds(95, 11, 268, 37);
		getContentPane().add(lblNewLabel);
		
		//TODO selector
		btnCarrier.setBounds(419, 70, 184, 60);
		getContentPane().add(btnCarrier);
		
		JPanel panel_x42 = new JPanel();
		panel_x42.setBounds(95, 291, 44, 44);
		getContentPane().add(panel_x42);
		
		JPanel panel_x43 = new JPanel();
		panel_x43.setBounds(140, 291, 44, 44);
		getContentPane().add(panel_x43);
		
		JPanel panel_x53 = new JPanel();
		panel_x53.setBounds(230, 336, 44, 44);
		getContentPane().add(panel_x53);
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
		if ((e == panel_1)||
				(e == panel_2)||
				(e == panel_3)||
				(e == panel_4)||
				(e == panel_5)||
				(e == panel_6)||
				(e == panel_7)||
				(e == panel_8)||
				(e == panel_9)||
				(e == panel_10)||
				(e == panel_11)||
				(e == panel_12)||
				(e == panel_13)||
				(e == panel_14)||
				(e == panel_15)||
				(e == panel_16)||
				(e == panel_17)||
				(e == panel_18)||
				(e == panel_19)||
				(e == panel_20)||
				(e == panel_21)||
				(e == panel_22)||
				(e == panel_23)||
				(e == panel_24)||
				(e == panel_25)||
				(e == panel_26)||
				(e == panel_27)||
				(e == panel_28)||
				(e == panel_29)||
				(e == panel_30)||
				(e == panel_31)||
				(e == panel_32)||
				(e == panel_33)||
				(e == panel_34)||
				(e == panel_35)||
				(e == panel_36)||
				(e == panel_37)||
				(e == panel_38)||
				(e == panel_39)||
				(e == panel_40)||
				(e == panel_41)||
				(e == panel_42)||
				(e == panel_43)||
				(e == panel_44)||
				(e == panel_45)||
				(e == panel_46)||
				(e == panel_47)||
				(e == panel_48)||
				(e == panel_49)||
				(e == panel_50)||
				(e == panel_51)||
				(e == panel_52)||
				(e == panel_53)||
				(e == panel_54)||
				(e == panel_55)||
				(e == panel_56)||
				(e == panel_57)||
				(e == panel_58)||
				(e == panel_59)||
				(e == panel_60)||
				(e == panel_61)||
				(e == panel_62)||
				(e == panel_63)||
				(e == panel_64)){
			panelSet(e, arg0);
			}
			
	}
	public void panelSet(Object e, Object d){
		if(SwingUtilities.isLeftMouseButton((MouseEvent) d)){
			blue = ((Component) e).getBackground();
			((JComponent) e).setBackground(new Color(0,0,0));					
			isEntered = true;
			ships[arrayAssist] = selectObj(e);
			arrayAssist += 1;
			count += 1;
			((JComponent) e).setEnabled(false);
			}
	}
	public void setAttributes(Object e){
		((JComponent) e).setBackground(new Color(0, 204, 255));
		((JComponent) e).setForeground(new Color(51, 204, 204));
		
		
		
		
	}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
	public void actionPerformed(ActionEvent arg0) {}
	
	//TODO set ship fxn
	public void setBoat(){
	String content = btnCarrier.getText().toLowerCase();
	if (content.equals("set carrier")){
		if(isEntered && (count == 5)){
	JOptionPane.showMessageDialog(null, "AircraftCarrier SET");
	JOptionPane.showMessageDialog(null, "Next, set the Battleship by selecting FOUR straight squares.");
	btnCarrier.setText("SET BATTLESHIP");
	isEntered = false;
	count = 0;
	lblNewLabel.setText("SETTING BATTLESHIP");
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the CARRIER position");
			JOptionPane.showMessageDialog(null, "Set the CARRIER by selecting FIVE straight squares");
		}
		}
	
	else if(content.equals("set battleship")){
		if(isEntered && (count == 4)){
		JOptionPane.showMessageDialog(null, "Battleship SET");
		JOptionPane.showMessageDialog(null, "Next, set the DESTROYER by selecting THREE straight squares.");
		btnCarrier.setText("SET DESTROYER");
		isEntered = false;
		count = 0;
		lblNewLabel.setText("SETTING DESTROYER");
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the BATTLESHIP position");
			JOptionPane.showMessageDialog(null, "Set the BATTLESHIP by selecting FOUR straight squares");
		}
		}

	else if(content.equals("set destroyer")){
		if(isEntered && (count == 3)){
		JOptionPane.showMessageDialog(null, "Destroyer SET");
		JOptionPane.showMessageDialog(null, "Next, set the FRIGATE by selecting TWO adjacent squares.");
		btnCarrier.setText("SET FRIGATE");	
		isEntered = false;	
		count = 0;
		lblNewLabel.setText("SETTING FRIGATE");
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the DESTROYER position");
			JOptionPane.showMessageDialog(null, "Set the DESTROYER by selecting THREE straight squares");
		}
		}
	else  if(content.equals("set frigate")){
		if(isEntered && (count == 2)){
		JOptionPane.showMessageDialog(null, "Frigate SET");
		JOptionPane.showMessageDialog(null, "Next, set the SUBMARINE by selecting ONE square.");
		btnCarrier.setText("SET SUBMARINE");
		isEntered = false;
		count = 0;
		lblNewLabel.setText("SETTING SUBMARINE");
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the FRIGATE position");
			JOptionPane.showMessageDialog(null, "Set the FRIGATE by selecting TWO squares");
		}
					
					}//
	else if(content.equals("set submarine")){
		if(isEntered  && (count == 1)){
		JOptionPane.showMessageDialog(null, "SUBMARINE SET");
		JOptionPane.showMessageDialog(null, "YOU ARE NOW READY FOR WAR!");
		btnCarrier.setText("PROCEED");
		count = 0;
		lblNewLabel.setText("CLICK \"PROCEED\"");
						}
		else{
			JOptionPane.showMessageDialog(null, "Please select the SUBMARINE position");
			JOptionPane.showMessageDialog(null, "Set the SUBMARINE by selecting ONE square");
		}
		}
	else if(content.equals("proceed")){
		//TODO PROCEED FXN
		setVisible(false);
		
		//setShipArray();
		dispArray();
		JOptionPane.showMessageDialog(null, "Let the Game Begin! ");
		new InitializeGame().setVisible(true);
		JOptionPane.showMessageDialog(null, "Select a coordinate to begin your attack");
	}
}
	//TODO STRING ARRAY CLEAR
	public void resetArray(){
		for (int x = 0; x < ships.length; x++){
			ships[x] = null;
		}
	}
	
	public void dispArray(){
		for(int x = 0; x < ships.length; x ++){
			System.out.println(ships[x]);
		}
	}
	//TODO slector
	public String selectObj(Object e){
	if(panel_1 == e){ return "panel_1"; }
	else if(panel_2 == e){ return "panel_2"; }
	else if(panel_3 == e){ return "panel_3"; }
	else if(panel_4 == e){ return "panel_4"; }
	else if(panel_5 == e){ return "panel_5"; }
	else if(panel_6 == e){ return "panel_6"; }
	else if(panel_7 == e){ return "panel_7"; }
	else if(panel_8 == e){ return "panel_8"; }
	else if(panel_9 == e){ return "panel_9"; }
	else if(panel_10 == e){ return "panel_10"; }
	else if(panel_11 == e){ return "panel_11"; }
	else if(panel_12 == e){ return "panel_12"; }
	else if(panel_13 == e){ return "panel_13"; }
	else if(panel_14 == e){ return "panel_14"; }
	else if(panel_15 == e){ return "panel_15"; }
	else if(panel_16 == e){ return "panel_16"; }
	else if(panel_17 == e){ return "panel_17"; }
	else if(panel_18 == e){ return "panel_18"; }
	else if(panel_19 == e){ return "panel_19"; }
	else if(panel_20 == e){ return "panel_20"; }
	else if(panel_21 == e){ return "panel_21"; }
	else if(panel_22 == e){ return "panel_22"; }
	else if(panel_23 == e){ return "panel_23"; }
	else if(panel_24 == e){ return "panel_24"; }
	else if(panel_25 == e){ return "panel_25"; }
	else if(panel_26 == e){ return "panel_26"; }
	else if(panel_27 == e){ return "panel_27"; }
	else if(panel_28 == e){ return "panel_28"; }
	else if(panel_29 == e){ return "panel_29"; }
	else if(panel_30 == e){ return "panel_30"; }
	else if(panel_31 == e){ return "panel_31"; }
	else if(panel_32 == e){ return "panel_32"; }
	else if(panel_33 == e){ return "panel_33"; }
	else if(panel_34 == e){ return "panel_34"; }
	else if(panel_35 == e){ return "panel_35"; }
	else if(panel_36 == e){ return "panel_36"; }
	else if(panel_37 == e){ return "panel_37"; }
	else if(panel_38 == e){ return "panel_38"; }
	else if(panel_39 == e){ return "panel_39"; }
	else if(panel_40 == e){ return "panel_40"; }
	else if(panel_41 == e){ return "panel_41"; }
	else if(panel_42 == e){ return "panel_42"; }
	else if(panel_43 == e){ return "panel_43"; }
	else if(panel_44 == e){ return "panel_44"; }
	else if(panel_45 == e){ return "panel_45"; }
	else if(panel_46 == e){ return "panel_46"; }
	else if(panel_47 == e){ return "panel_47"; }
	else if(panel_48 == e){ return "panel_48"; }
	else if(panel_49 == e){ return "panel_49"; }
	else if(panel_50 == e){ return "panel_50"; }
	else if(panel_51 == e){ return "panel_51"; }
	else if(panel_52 == e){ return "panel_52"; }
	else if(panel_53 == e){ return "panel_53"; }
	else if(panel_54 == e){ return "panel_54"; }
	else if(panel_55 == e){ return "panel_55"; }
	else if(panel_56 == e){ return "panel_56"; }
	else if(panel_57 == e){ return "panel_57"; }
	else if(panel_58 == e){ return "panel_58"; }
	else if(panel_59 == e){ return "panel_59"; }
	else if(panel_60 == e){ return "panel_60"; }
	else if(panel_61 == e){ return "panel_61"; }
	else if(panel_62 == e){ return "panel_62"; }
	else if(panel_63 == e){ return "panel_63"; }
	else if(panel_64 == e){ return "panel_64"; }
	else return null;
	}
}