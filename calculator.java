import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldAns;
	private JButton buttonMultiply;
	private JButton buttonDivide;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(15, 11, 142, 56);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(257, 11, 152, 56);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(152, 116, 163, 66);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JButton buttonAdd = new JButton("Sum");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					float num1,num2,sum;
					num1 = Float.parseFloat(textField1.getText());
					num2 = Float.parseFloat(textField2.getText());
					sum = num1+num2;
					textFieldAns.setText(Float.toString(sum));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		buttonAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonAdd.setBounds(10, 77, 89, 23);
		frame.getContentPane().add(buttonAdd);
		
		JButton buttonSubtract = new JButton("Difference");
		buttonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Float num1,num2,sum;
					num1 = Float.parseFloat(textField1.getText());
					num2 = Float.parseFloat(textField2.getText());
					sum = num1 - num2;
					textFieldAns.setText(Float.toString(sum));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		buttonSubtract.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonSubtract.setBounds(114, 78, 89, 23);
		frame.getContentPane().add(buttonSubtract);
		
		buttonMultiply = new JButton("Product");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					float num1,num2,sum;
					num1 = Float.parseFloat(textField1.getText());
					num2 = Float.parseFloat(textField2.getText());
					sum = num1*num2;
					textFieldAns.setText(Float.toString(sum));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		buttonMultiply.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonMultiply.setBounds(227, 78, 89, 23);
		frame.getContentPane().add(buttonMultiply);
		
		buttonDivide = new JButton("Quotient");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Float num1,num2,sum;
					num1 = Float.parseFloat(textField1.getText());
					num2 = Float.parseFloat(textField2.getText());
					sum = num1/num2;
					textFieldAns.setText(Float.toString(sum));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					
				}
				
			}
		});
		buttonDivide.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonDivide.setBounds(335, 78, 89, 23);
		frame.getContentPane().add(buttonDivide);
		
		btnClear = new JButton("Clear");
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Float num1,num2,sum;
					num1 = (float) 0;
					num2 = (float)  0;
					sum = num1+num2;
					textFieldAns.setText(Float.toString(sum));
					textField1.setText(Float.toString(num1));
					textField2.setText(Float.toString(num2));
			}
		});
		btnClear.setBounds(25, 132, 106, 34);
		frame.getContentPane().add(btnClear);
	}
}
