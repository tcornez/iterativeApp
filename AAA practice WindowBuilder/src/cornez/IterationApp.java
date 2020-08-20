package cornez;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IterationApp {

	private JFrame frame;
	private JTextField txtFieldCount;
	private JTextField textFieldText;
	private JButton btnBuild;
	private JTextArea textAreaOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IterationApp window = new IterationApp();
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
	public IterationApp() {
		initialize();
		createEvents();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iteration App");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(169, 6, 104, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Count:");
		lblNewLabel_1.setBounds(38, 68, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtFieldCount = new JTextField();
		txtFieldCount.setBounds(173, 63, 130, 26);
		frame.getContentPane().add(txtFieldCount);
		txtFieldCount.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Text to be iterated:");
		lblNewLabel_2.setBounds(6, 115, 135, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldText = new JTextField();
		textFieldText.setBounds(183, 101, 130, 26);
		frame.getContentPane().add(textFieldText);
		textFieldText.setColumns(10);
		
		btnBuild = new JButton("Build Output");
		btnBuild.setBounds(156, 150, 117, 29);
		frame.getContentPane().add(btnBuild);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 189, 407, 60);
		frame.getContentPane().add(scrollPane);
		
		textAreaOutput = new JTextArea();
		scrollPane.setViewportView(textAreaOutput);
	}
	
	private void createEvents() {
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buildOutput();
			}
		});
		
	}
	private void buildOutput() {
		//TASK 1: GET COUNT
		Integer cnt = Integer.parseInt(txtFieldCount.getText());
		
		//TASK 2: BUILD THE OUTPUT STRING
		String outString = "";
		for (int i = 1; i <= cnt; i++) {
			outString += textFieldText.getText();
		}
		
		//TASK 3: DISPLAY THE OUTPUT STRING
		textAreaOutput.setText(outString);
	}
}
