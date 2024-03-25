package ntu_631133298;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Display extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfAge;
	private JTextField tfHeight;
	private JTextField tfWeight;
	private JTextField tfRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Display() {
		setTitle("Cau1_BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(34, 24, 68, 30);
		contentPane.add(lblNewLabel);
		
		tfAge = new JTextField();
		tfAge.setBounds(109, 31, 162, 23);
		contentPane.add(tfAge);
		tfAge.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblGender.setBounds(34, 65, 68, 30);
		contentPane.add(lblGender);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblHeight.setBounds(34, 106, 68, 30);
		contentPane.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblWeight.setBounds(34, 147, 68, 30);
		contentPane.add(lblWeight);
		
		JLabel lblNewLabel_1 = new JLabel("(2 - 120)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(281, 24, 68, 30);
		contentPane.add(lblNewLabel_1);
		
		tfHeight = new JTextField();
		tfHeight.setColumns(10);
		tfHeight.setBounds(109, 113, 162, 23);
		contentPane.add(tfHeight);
		
		tfWeight = new JTextField();
		tfWeight.setColumns(10);
		tfWeight.setBounds(109, 153, 162, 23);
		contentPane.add(tfWeight);
		
		JLabel lblNewLabel_1_1 = new JLabel("(kg)");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(281, 147, 68, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("(cm)");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(281, 106, 68, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblBmi.setBounds(34, 203, 68, 30);
		contentPane.add(lblBmi);
		
		tfRes = new JTextField();
		tfRes.setEditable(false);
		tfRes.setColumns(10);
		tfRes.setBounds(109, 203, 162, 30);
		contentPane.add(tfRes);
		
		JRadioButton radioMale = new JRadioButton("Male");
		radioMale.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radioMale.setSelected(true);
		radioMale.setBounds(108, 71, 68, 23);
		contentPane.add(radioMale);
		
		JRadioButton radioFemale = new JRadioButton("Female");
		radioFemale.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		radioFemale.setBounds(179, 72, 78, 23);
		contentPane.add(radioFemale);
		
		JButton btnCal = new JButton("Calculate");
		btnCal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCal.setBounds(310, 188, 105, 49);
		contentPane.add(btnCal);
	}
}
