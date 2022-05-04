package framedemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;

public class BillGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillGui frame = new BillGui();
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
	public BillGui() {
		setTitle("B & M Upholstery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.setBounds(174, 149, 89, 23);
		contentPane.add(btnNewButton);
		
		JSpinner spinnerQty = new JSpinner();
		spinnerQty.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spinnerQty.setBounds(273, 40, 40, 20);
		contentPane.add(spinnerQty);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.setToolTipText("Product");
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Foam", "Cotton", "Thread", "Vinyl"}));
		comboBoxProduct.setBounds(10, 39, 77, 22);
		contentPane.add(comboBoxProduct);
		
		JComboBox comboBoxColor = new JComboBox();
		comboBoxColor.setModel(new DefaultComboBoxModel(new String[] {"Red", "Blue", "Brown", "White"}));
		comboBoxColor.setBounds(97, 39, 77, 22);
		contentPane.add(comboBoxColor);
		
		JComboBox comboBoxSize = new JComboBox();
		comboBoxSize.setModel(new DefaultComboBoxModel(new String[] {"Small", "Med", "Large"}));
		comboBoxSize.setBounds(186, 39, 77, 22);
		contentPane.add(comboBoxSize);
		
		textField = new JTextField();
		textField.setText("3.50");
		textField.setBounds(338, 40, 48, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("7.00");
		textField_1.setBounds(338, 115, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Color");
		lblNewLabel_1.setBounds(97, 14, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Size");
		lblNewLabel_2.setBounds(194, 14, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setBounds(273, 14, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Unit Price");
		lblNewLabel_4.setBounds(340, 14, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total");
		lblNewLabel_5.setBounds(338, 90, 46, 14);
		contentPane.add(lblNewLabel_5);
	}
}
