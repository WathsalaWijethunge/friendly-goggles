package GPA;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Gui {

	private JFrame frame;
	private JTextField subject1;
	private JTextField grade1;
	private JTextField credit1;
	private JTextField totalPoint;
	private JTextField totalCredit;
	private JTextField gradePoint1;
	private JTextField gradePointAverage;
	private JTextField subject2;
	private JTextField grade2;
	private JTextField credit2;
	private JTextField gradePoint2;
	private JTextField subject3;
	private JTextField grade3;
	private JTextField credit3;
	private JTextField gradePoint3;
	private JTextField subject4;
	private JTextField grade4;
	private JTextField credit4;
	private JTextField gradePoint4;
	private JTextField subject5;
	private JTextField grade5;
	private JTextField credit5;
	private JTextField gradePoint5;
	private JTextField subject6;
	private JTextField grade6;
	private JTextField credit6;
	private JTextField gradePoint6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 699, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 675, 397);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		subject1 = new JTextField();
		subject1.setBounds(30, 84, 96, 19);
		panel.add(subject1);
		subject1.setColumns(10);
		
		grade1 = new JTextField();
		grade1.setBounds(136, 84, 96, 19);
		grade1.setColumns(10);
		panel.add(grade1);
		
		credit1 = new JTextField();
		credit1.setBounds(242, 84, 96, 19);
		credit1.setColumns(10);
		panel.add(credit1);
		
		totalPoint = new JTextField();
		totalPoint.setBounds(361, 297, 96, 19);
		totalPoint.setBackground(Color.LIGHT_GRAY);
		totalPoint.setColumns(10);
		panel.add(totalPoint);
		
		totalCredit = new JTextField();
		totalCredit.setBounds(242, 297, 96, 19);
		totalCredit.setBackground(Color.LIGHT_GRAY);
		totalCredit.setColumns(10);
		panel.add(totalCredit);
		
		gradePoint1 = new JTextField();
		gradePoint1.setBounds(361, 84, 96, 19);
		gradePoint1.setBackground(Color.LIGHT_GRAY);
		gradePoint1.setColumns(10);
		panel.add(gradePoint1);
		
		gradePointAverage = new JTextField();
		gradePointAverage.setBounds(361, 356, 96, 19);
		gradePointAverage.setBackground(Color.LIGHT_GRAY);
		gradePointAverage.setColumns(10);
		panel.add(gradePointAverage);
		
		JLabel lblNewLabel = new JLabel("SUBJECT");
		lblNewLabel.setBounds(30, 48, 96, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JLabel lblGrade = new JLabel("GRADE");
		lblGrade.setBounds(136, 48, 96, 26);
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblGrade);
		
		JLabel lblNewLabel_1_1 = new JLabel("CREDIT");
		lblNewLabel_1_1.setBounds(242, 48, 96, 26);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("GRADE POINT");
		lblNewLabel_1_1_1.setBounds(361, 48, 109, 26);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("TOTAL CREDIT");
		lblNewLabel_1_1_2.setBounds(231, 261, 121, 26);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("TOTAL POINT");
		lblNewLabel_1_1_3.setBounds(361, 261, 109, 26);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("GPA");
		lblNewLabel_1_1_4.setBounds(371, 326, 96, 26);
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_1_1_4);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.setBounds(523, 83, 132, 74);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String g1 = grade1.getText().toString();
				int c1 = Integer.parseInt(credit1.getText());
				float gp1=0.0f;
				
				String g2 = grade2.getText().toString();
				int c2 = Integer.parseInt(credit2.getText());
				float gp2=0.0f;
				
				String g3 = grade3.getText().toString();
				int c3 = Integer.parseInt(credit3.getText());
				float gp3=0.0f;
				
				String g4 = grade4.getText().toString();
				int c4 = Integer.parseInt(credit4.getText());
				float gp4=0.0f;
				
				String g5 = grade5.getText().toString();
				int c5 = Integer.parseInt(credit5.getText());
				float gp5=0.0f;
				
				String g6 = grade6.getText().toString();
				int c6 = Integer.parseInt(credit6.getText());
				float gp6=0.0f;
				
				
				String[] gradeList=new String[] {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","E"};
				float gradeValue[]={4.00f,4.00f,3.70f,3.30f,3.00f,2.70f,2.30f,2.00f,1.70f,1.30f,1.00f,0.00f};

				for(int x=0;x<=gradeList.length;x++){
					if(g1.equals(gradeList[x])){
				 		gp1=gradeValue[x]*c1;
						gradePoint1.setText(String.valueOf(gp1));
						break;
					}
				}
				for(int x=0;x<=gradeList.length;x++){
					if(g2.equals(gradeList[x])){
				 		gp2=gradeValue[x]*c2;
						gradePoint2.setText(String.valueOf(gp2));
						break;
					}
				}
				for(int x=0;x<=gradeList.length;x++){
					if(g3.equals(gradeList[x])){
				 		gp3=gradeValue[x]*c3;
						gradePoint3.setText(String.valueOf(gp3));
						break;
					}
				}
				for(int x=0;x<=gradeList.length;x++){
					if(g4.equals(gradeList[x])){
				 		gp4=gradeValue[x]*c4;
						gradePoint4.setText(String.valueOf(gp4));
						break;
					}
				}
				for(int x=0;x<=gradeList.length;x++){
					if(g5.equals(gradeList[x])){
				 		gp5=gradeValue[x]*c5;
						gradePoint5.setText(String.valueOf(gp5));
						break;
					}
				}
				for(int x=0;x<=gradeList.length;x++){
					if(g6.equals(gradeList[x])){
				 		gp6=gradeValue[x]*c6;
						gradePoint6.setText(String.valueOf(gp6));
						break;
					}
				}
				
				int tcredit = c1+c2+c3+c4+c5+c6;
				totalCredit.setText(String.valueOf(tcredit));
				float tpoint = gp1+gp2+gp3+gp4+gp5+gp6;
				totalPoint.setText(String.valueOf(tpoint));
				float gpa = tpoint/tcredit;
				gradePointAverage.setText(String.valueOf(gpa));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(523, 167, 132, 67);
		btnClear.setForeground(Color.MAGENTA);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject1.setText("");
				grade1.setText("");
				credit1.setText("");
				gradePoint1.setText("");
				
				subject2.setText("");
				grade2.setText("");
				credit2.setText("");
				gradePoint2.setText("");
				
				subject3.setText("");
				grade3.setText("");
				credit3.setText("");
				gradePoint3.setText("");
				
				subject4.setText("");
				grade4.setText("");
				credit4.setText("");
				gradePoint4.setText("");
				
				subject5.setText("");
				grade5.setText("");
				credit5.setText("");
				gradePoint5.setText("");
				
				subject6.setText("");
				grade6.setText("");
				credit6.setText("");
				gradePoint6.setText("");
				
				totalCredit.setText("");
				totalPoint.setText("");
				gradePointAverage.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(523, 244, 132, 61);
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(btnExit);
		
		JLabel lblNewLabel_1_2 = new JLabel("GPA CALCULATOR");
		lblNewLabel_1_2.setBounds(249, 10, 192, 38);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_1_2);
		
		subject2 = new JTextField();
		subject2.setBounds(30, 113, 96, 19);
		subject2.setColumns(10);
		panel.add(subject2);
		
		grade2 = new JTextField();
		grade2.setBounds(136, 113, 96, 19);
		grade2.setColumns(10);
		panel.add(grade2);
		
		credit2 = new JTextField();
		credit2.setBounds(242, 113, 96, 19);
		credit2.setColumns(10);
		panel.add(credit2);
		
		gradePoint2 = new JTextField();
		gradePoint2.setBounds(361, 113, 96, 19);
		gradePoint2.setBackground(Color.LIGHT_GRAY);
		gradePoint2.setColumns(10);
		panel.add(gradePoint2);
		
		subject3 = new JTextField();
		subject3.setBounds(30, 142, 96, 19);
		subject3.setColumns(10);
		panel.add(subject3);
		
		grade3 = new JTextField();
		grade3.setBounds(136, 142, 96, 19);
		grade3.setColumns(10);
		panel.add(grade3);
		
		credit3 = new JTextField();
		credit3.setBounds(242, 142, 96, 19);
		credit3.setColumns(10);
		panel.add(credit3);
		
		gradePoint3 = new JTextField();
		gradePoint3.setBounds(361, 142, 96, 19);
		gradePoint3.setBackground(Color.LIGHT_GRAY);
		gradePoint3.setColumns(10);
		panel.add(gradePoint3);
		
		subject4 = new JTextField();
		subject4.setBounds(30, 171, 96, 19);
		subject4.setColumns(10);
		panel.add(subject4);
		
		grade4 = new JTextField();
		grade4.setBounds(136, 171, 96, 19);
		grade4.setColumns(10);
		panel.add(grade4);
		
		credit4 = new JTextField();
		credit4.setBounds(242, 171, 96, 19);
		credit4.setColumns(10);
		panel.add(credit4);
		
		gradePoint4 = new JTextField();
		gradePoint4.setBounds(361, 171, 96, 19);
		gradePoint4.setBackground(Color.LIGHT_GRAY);
		gradePoint4.setColumns(10);
		panel.add(gradePoint4);
		
		subject5 = new JTextField();
		subject5.setBounds(30, 200, 96, 19);
		subject5.setColumns(10);
		panel.add(subject5);
		
		grade5 = new JTextField();
		grade5.setBounds(136, 200, 96, 19);
		grade5.setColumns(10);
		panel.add(grade5);
		
		credit5 = new JTextField();
		credit5.setBounds(242, 200, 96, 19);
		credit5.setColumns(10);
		panel.add(credit5);
		
		gradePoint5 = new JTextField();
		gradePoint5.setBounds(361, 200, 96, 19);
		gradePoint5.setBackground(Color.LIGHT_GRAY);
		gradePoint5.setColumns(10);
		panel.add(gradePoint5);
		
		subject6 = new JTextField();
		subject6.setBounds(30, 229, 96, 19);
		subject6.setColumns(10);
		panel.add(subject6);
		
		grade6 = new JTextField();
		grade6.setBounds(136, 229, 96, 19);
		grade6.setColumns(10);
		panel.add(grade6);
		
		credit6 = new JTextField();
		credit6.setBounds(242, 229, 96, 19);
		credit6.setColumns(10);
		panel.add(credit6);
		
		gradePoint6 = new JTextField();
		gradePoint6.setBounds(361, 229, 96, 19);
		gradePoint6.setBackground(Color.LIGHT_GRAY);
		gradePoint6.setColumns(10);
		panel.add(gradePoint6);
	}
}
