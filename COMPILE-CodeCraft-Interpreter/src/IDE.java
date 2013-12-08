

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class IDE {

	private JFrame frame;
	JTextArea textArea_1;
	JTextArea textArea;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDE window = new IDE();
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
	public IDE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnWalk = new JButton("WALK");
		btnWalk.setBounds(391, 11, 224, 23);
		frame.getContentPane().add(btnWalk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 33, 371, 495);
		frame.getContentPane().add(scrollPane);
		
		textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(391, 77, 224, 451);
		frame.getContentPane().add(scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JLabel lblCode = new JLabel("CODE:");
		lblCode.setBounds(10, 15, 46, 14);
		frame.getContentPane().add(lblCode);
		
		JLabel lblConsole = new JLabel("CONSOLE:");
		lblConsole.setBounds(391, 52, 96, 14);
		frame.getContentPane().add(lblConsole);
		
		
		btnWalk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					textArea.setText("");
						try {
							Main m = new Main(textArea_1.getText(),null,textArea);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			}
		});
	}
}
