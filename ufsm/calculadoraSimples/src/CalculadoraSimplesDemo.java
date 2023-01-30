//Nome: Vithória Eliza Priebe 

import java.awt.Color;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraSimplesDemo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldAnswer;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	String firstString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSimplesDemo window = new CalculadoraSimplesDemo();
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
	public CalculadoraSimplesDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(null);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(500, 100, 358, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.BOLD, 18));
		editorPane.setBounds(10, 11, 322, 62);
		frame.getContentPane().add(editorPane);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					textFieldAnswer.setText(null);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnBackSpace.setBounds(11, 84, 79, 55);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(11, 139, 79, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(11, 194, 79, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(11, 249, 79, 55);
		frame.getContentPane().add(btn1);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textFieldAnswer.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(91, 84, 159, 55);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(91, 139, 79, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(91, 194, 79, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(91, 249, 79, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn00.setBounds(11, 304, 79, 55);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(171, 139, 79, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(171, 194, 79, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(171, 249, 79, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstString = textField.getText();
				first = Double.parseDouble(firstString);
				textField.setText(firstString + "+");
				operation = "+";	
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.setBounds(251, 84, 79, 55);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstString = textField.getText();
				first = Double.parseDouble(firstString);
				textField.setText(firstString + "-");
				operation = "-";
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubtract.setBounds(251, 139, 79, 55);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstString = textField.getText();
				first = Double.parseDouble(firstString);
				textField.setText(firstString + "x");
				operation = "x";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMultiply.setBounds(251, 194, 79, 55);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstString = textField.getText();
				first = Double.parseDouble(firstString);
				textField.setText(firstString + "/");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDivide.setBounds(251, 249, 79, 55);
		frame.getContentPane().add(btnDivide);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(91, 304, 79, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDot.setBounds(171, 304, 79, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//First textField para aparecer os números
				int indexOperation = textField.getText().indexOf(operation);
				int indexFinal =  textField.getText().length();
				String secondString = textField.getText().substring(indexOperation + 1, indexFinal);
				second = Double.parseDouble(secondString);
				textField.setText(firstString + operation + secondString);
				
				//Resposta final
				if(operation=="+") {
					result = first+second;
					answer = String.format("%.2f", result);
					textFieldAnswer.setText(answer);
				} else if (operation=="-") {
					result = first-second;
					answer = String.format("%.2f", result);
					textFieldAnswer.setText(answer);
				} else if (operation=="x") {
					result = first*second;
					answer = String.format("%.2f", result);
					textFieldAnswer.setText(answer);
				} else if (operation=="/") {
					if (second == 0) {
						textFieldAnswer.setText("Dividir por zero não é possível");
					} else {
						result = first/second;
						answer = String.format("%.2f", result);
						textFieldAnswer.setText(answer);
					}
				}				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEqual.setBounds(251, 304, 79, 55);
		frame.getContentPane().add(btnEqual);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField.setBounds(12, 13, 322, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldAnswer.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldAnswer.setBounds(10, 45, 322, 25);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
	}
}
