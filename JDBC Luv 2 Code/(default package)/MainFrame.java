import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	//private JTextArea textArea;
	private JButton btn;
	private TextPanel textPanel;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JFrame frame;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		super("My Controls");
		initialize();

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		JFrame frame = new JFrame("My Controls");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		/**
		 * * Set the layout
		 */

		frame.setLayout (new BorderLayout());

		//textArea = new JTextArea();
		btn = new JButton("Click Me!");
		textPanel = new TextPanel();

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("action action action - Why don't you do something?!\n");
			}

		});

		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}
}
