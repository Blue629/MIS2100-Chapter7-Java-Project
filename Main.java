package Tennant.Joshua.Chapter7.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;
	private JTextField numerator;
	private JTextField denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numerator = new JTextField();
		numerator.setBounds(32, 27, 86, 20);
		frame.getContentPane().add(numerator);
		numerator.setColumns(10);
		
		denominator = new JTextField();
		denominator.setBounds(128, 27, 86, 20);
		frame.getContentPane().add(denominator);
		denominator.setColumns(10);
		
		JButton Calculate = new JButton("Calculate");
		
		JLabel out = new JLabel("Results");
		out.setBounds(128, 58, 86, 23);
		frame.getContentPane().add(out);
		
		Calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double num = Double.parseDouble(numerator.getText());
				Double den = Double.parseDouble(denominator.getText());
				try {
					SimpleMath foo = new SimpleMath();
					out.setText(Double.toString(foo.divide(num, den)));
				} catch (Exception y){
					out.setText("Cannot divide by 0");
				}
			}
		});
		Calculate.setBounds(29, 58, 89, 23);
		frame.getContentPane().add(Calculate);
		
		
	}
}
