import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Font;
import java.awt.Window;

public class Main implements ActionListener {
	private JFrame timeFrame;
	private JButton timeButton;
	private JPanel timePanel;
	private final int FRAME_WIDTH = 300;
	private final int FRAME_HEIGHT = 200;

	public `Main`(){
		// Build the frame
		timeFrame = new JFrame();
		timeFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		timeFrame.setTitle("Display Time");
		timeFrame.setLocationRelativeTo(null);
		timeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the buttons
		timeButton =new JButton("Display Time");
		timeButton.addActionListener(this);

		// Build the panel
		timePanel = new JPanel();
		timePanel.add(timeButton);
		timeFrame.add(timePanel);
		timeFrame.setVisible(true);
	}

	// Build Action Listener to Display time in HH:MM:SS
		public void actionPerformed(ActionEvent event){
			timeFrame.dispose();
			popUp newPop = new popUp();
			newPop.setVisible(true);
	    }

	public static void main(String[] args) {
		new Main();
	}
}
class popUp extends JFrame  {
	private static final long serialVersionUID = 1L;
	public popUp() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 150);
		this.setTitle("The Time Is");
		JLabel showTime = new JLabel();
		SimpleDateFormat ftime = new SimpleDateFormat("hh:mm:ss");
		Date currentTime = new Date();
		showTime.setForeground(Color.white);
		showTime.setFont(new Font("Hevletica", Font.BOLD, 100));
		String myTime = ftime.format(currentTime);
		showTime.setText(myTime.toString());
		JPanel timePanel = new JPanel();
		timePanel.add(showTime);
		this.add(timePanel);
		Random r=new Random();
		timePanel.setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256)));
	}
}
