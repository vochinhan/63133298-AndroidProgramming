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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblHeight.setBounds(34, 39, 68, 30);
		contentPane.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblWeight.setBounds(34, 91, 68, 30);
		contentPane.add(lblWeight);
		
		tfHeight = new JTextField();
		tfHeight.setColumns(10);
		tfHeight.setBounds(112, 34, 162, 35);
		contentPane.add(tfHeight);
		
		tfWeight = new JTextField();
		tfWeight.setColumns(10);
		tfWeight.setBounds(112, 92, 162, 34);
		contentPane.add(tfWeight);
		
		JLabel lblNewLabel_1_1 = new JLabel("(kg)");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(284, 92, 68, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("(cm)");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(284, 34, 68, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblBmi.setBounds(34, 203, 68, 30);
		contentPane.add(lblBmi);
		
		tfRes = new JTextField();
		tfRes.setEditable(false);
		tfRes.setColumns(10);
		tfRes.setBounds(112, 206, 162, 35);
		contentPane.add(tfRes);
		
		JButton btnCal = new JButton("Calculate");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateBMI();
			}
		});
		btnCal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCal.setBounds(112, 146, 120, 49);
		contentPane.add(btnCal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearText();
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnClear.setBounds(251, 146, 120, 49);
		contentPane.add(btnClear);
	}
	
	public void calculateBMI()
	{
		String strWeight = "0";
		String strHeight = "1";
		if (!tfWeight.getText().equals(""))
			strWeight = tfWeight.getText();
		if (!tfHeight.getText().equals(""))
			strHeight = tfHeight.getText();
		
		float fWeight = Float.parseFloat(strWeight);
		float fHeight = Float.parseFloat(strHeight);
		
		float bmi = fWeight / (fHeight/100 * fHeight/100);
		String strBMI = Float.toString(bmi);
		tfRes.setText(strBMI);
	}
	
	public void clearText()
	{
		tfWeight.setText("");
		tfHeight.setText("");
		tfRes.setText("");
	}
}
