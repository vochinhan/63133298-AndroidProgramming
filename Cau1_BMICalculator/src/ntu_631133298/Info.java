package ntu_631133298;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;

public class Info extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
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
	public Info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 48, 384, 493);
		textArea.setText("BMI is a measurement of a person's leanness or corpulence based on their height and weight, and is intended to quantify tissue mass. "
				+ "\nBMI ranges:\n"
				+ "Severe Thinness	< 16\r\n"
				+ "Moderate Thinness	16 - 17\r\n"
				+ "Mild Thinness	17 - 18.5\r\n"
				+ "Normal	\t 18.5 - 25\r\n"
				+ "Overweight \t	25 - 30\r\n"
				+ "Obese Class I	30 - 35\r\n"
				+ "Obese Class II	35 - 40\r\n"
				+ "Obese Class III	> 40");
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		contentPane.add(textArea);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(302, 11, 98, 23);
		contentPane.add(btnBack);
	}
}
