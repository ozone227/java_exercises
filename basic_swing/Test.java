/**
 * @author Ryan Bond
 * https://github.com/ozone227 - drbond@gmail.com
 *
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Test implements ActionListener {
	private Account customer1=new Account("Chet", "McPheeters", 25000);
	private JFrame frame;
	private JButton depositButton;
	private JButton withdrawButton;
	private JPanel accountPanel;
	private JLabel accountSummary;
	private JTextField transactionText;
	private final int FRAME_WIDTH = 300;
	private final int FRAME_HEIGHT = 200;
	private final int FIELD_WIDTH = 10;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public Test() {
		// Build the frame
		frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Bank Account");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		accountSummary = new JLabel(customer1.getFirstName()+ " " +customer1.getLastName()+ " " +"Account Balance:   " + formatter.format(customer1.getBalance()));

		// Build the buttons
		transactionText = new JTextField(FIELD_WIDTH);
		depositButton = new JButton ("Deposit");
		withdrawButton = new JButton ("Withdraw");
		withdrawButton.addActionListener(this);
		depositButton.addActionListener(this);
		depositButton.setActionCommand("deposit");
	    withdrawButton.setActionCommand("withdraw");

		// Build the panel
		accountPanel = new JPanel();
		accountPanel.add(depositButton);
		accountPanel.add(withdrawButton);
		accountPanel.add(transactionText);
		accountPanel.add(accountSummary);
		frame.add(accountPanel);
		frame.setVisible(true);
	}

	// Build Action Listener
	public void actionPerformed(ActionEvent e){
        if("deposit".equals(e.getActionCommand())){
        	customer1.deposit(new Double(transactionText.getText()).doubleValue());
        }else{
        	customer1.withdraw(new Double(transactionText.getText()).doubleValue());
        }
        accountSummary.setText(customer1.getFirstName()+ " " +customer1.getLastName()+ " " +"Account Balance: " + formatter.format(customer1.getBalance()));
    }

	public static void main(String[] args) {
		new Test();
	}
}
