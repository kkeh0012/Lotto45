import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Lottery {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lottery window = new Lottery();
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
	public Lottery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
			}
		});
		frame.setBounds(100, 100, 768, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
			}
		});
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("n열");
		lblNewLabel_3.setBounds(142, 10, 57, 15);
		panel.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(42, 42, 37, 30);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(83, 42, 37, 30);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(124, 42, 37, 30);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(165, 42, 37, 30);
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBounds(206, 42, 37, 30);
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.setBounds(247, 42, 37, 30);
		panel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("");
		chckbxNewCheckBox_6.setBounds(288, 42, 37, 30);
		panel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("");
		chckbxNewCheckBox_7.setBounds(42, 74, 37, 30);
		panel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_7_1 = new JCheckBox("");
		chckbxNewCheckBox_7_1.setBounds(42, 106, 37, 30);
		panel.add(chckbxNewCheckBox_7_1);
		
		JCheckBox chckbxNewCheckBox_7_2 = new JCheckBox("");
		chckbxNewCheckBox_7_2.setBounds(42, 138, 37, 30);
		panel.add(chckbxNewCheckBox_7_2);
		
		JCheckBox chckbxNewCheckBox_7_3 = new JCheckBox("");
		chckbxNewCheckBox_7_3.setBounds(42, 170, 37, 30);
		panel.add(chckbxNewCheckBox_7_3);
		
		JCheckBox chckbxNewCheckBox_7_4 = new JCheckBox("");
		chckbxNewCheckBox_7_4.setBounds(42, 202, 37, 30);
		panel.add(chckbxNewCheckBox_7_4);
		
		JCheckBox chckbxNewCheckBox_7_5 = new JCheckBox("");
		chckbxNewCheckBox_7_5.setBounds(42, 234, 37, 30);
		panel.add(chckbxNewCheckBox_7_5);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_1.setBounds(83, 74, 37, 30);
		panel.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("");
		chckbxNewCheckBox_2_1.setBounds(124, 74, 37, 30);
		panel.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("");
		chckbxNewCheckBox_3_1.setBounds(165, 74, 37, 30);
		panel.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("");
		chckbxNewCheckBox_4_1.setBounds(206, 74, 37, 30);
		panel.add(chckbxNewCheckBox_4_1);
		
		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("");
		chckbxNewCheckBox_5_1.setBounds(247, 74, 37, 30);
		panel.add(chckbxNewCheckBox_5_1);
		
		JCheckBox chckbxNewCheckBox_6_1 = new JCheckBox("");
		chckbxNewCheckBox_6_1.setBounds(288, 74, 37, 30);
		panel.add(chckbxNewCheckBox_6_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("");
		chckbxNewCheckBox_1_2.setBounds(83, 106, 37, 30);
		panel.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("");
		chckbxNewCheckBox_2_2.setBounds(124, 106, 37, 30);
		panel.add(chckbxNewCheckBox_2_2);
		
		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("");
		chckbxNewCheckBox_3_2.setBounds(165, 106, 37, 30);
		panel.add(chckbxNewCheckBox_3_2);
		
		JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("");
		chckbxNewCheckBox_4_2.setBounds(206, 106, 37, 30);
		panel.add(chckbxNewCheckBox_4_2);
		
		JCheckBox chckbxNewCheckBox_5_2 = new JCheckBox("");
		chckbxNewCheckBox_5_2.setBounds(247, 106, 37, 30);
		panel.add(chckbxNewCheckBox_5_2);
		
		JCheckBox chckbxNewCheckBox_6_2 = new JCheckBox("");
		chckbxNewCheckBox_6_2.setBounds(288, 106, 37, 30);
		panel.add(chckbxNewCheckBox_6_2);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("");
		chckbxNewCheckBox_1_3.setBounds(83, 138, 37, 30);
		panel.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("");
		chckbxNewCheckBox_2_3.setBounds(124, 138, 37, 30);
		panel.add(chckbxNewCheckBox_2_3);
		
		JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("");
		chckbxNewCheckBox_3_3.setBounds(165, 138, 37, 30);
		panel.add(chckbxNewCheckBox_3_3);
		
		JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("");
		chckbxNewCheckBox_4_3.setBounds(206, 138, 37, 30);
		panel.add(chckbxNewCheckBox_4_3);
		
		JCheckBox chckbxNewCheckBox_5_3 = new JCheckBox("");
		chckbxNewCheckBox_5_3.setBounds(247, 138, 37, 30);
		panel.add(chckbxNewCheckBox_5_3);
		
		JCheckBox chckbxNewCheckBox_6_3 = new JCheckBox("");
		chckbxNewCheckBox_6_3.setBounds(288, 138, 37, 30);
		panel.add(chckbxNewCheckBox_6_3);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("");
		chckbxNewCheckBox_1_4.setBounds(83, 170, 37, 30);
		panel.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_2_4 = new JCheckBox("");
		chckbxNewCheckBox_2_4.setBounds(124, 170, 37, 30);
		panel.add(chckbxNewCheckBox_2_4);
		
		JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("");
		chckbxNewCheckBox_3_4.setBounds(165, 170, 37, 30);
		panel.add(chckbxNewCheckBox_3_4);
		
		JCheckBox chckbxNewCheckBox_4_4 = new JCheckBox("");
		chckbxNewCheckBox_4_4.setBounds(206, 170, 37, 30);
		panel.add(chckbxNewCheckBox_4_4);
		
		JCheckBox chckbxNewCheckBox_5_4 = new JCheckBox("");
		chckbxNewCheckBox_5_4.setBounds(247, 170, 37, 30);
		panel.add(chckbxNewCheckBox_5_4);
		
		JCheckBox chckbxNewCheckBox_6_4 = new JCheckBox("");
		chckbxNewCheckBox_6_4.setBounds(288, 170, 37, 30);
		panel.add(chckbxNewCheckBox_6_4);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("");
		chckbxNewCheckBox_1_5.setBounds(83, 202, 37, 30);
		panel.add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_2_5 = new JCheckBox("");
		chckbxNewCheckBox_2_5.setBounds(124, 202, 37, 30);
		panel.add(chckbxNewCheckBox_2_5);
		
		JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("");
		chckbxNewCheckBox_3_5.setBounds(165, 202, 37, 30);
		panel.add(chckbxNewCheckBox_3_5);
		
		JCheckBox chckbxNewCheckBox_4_5 = new JCheckBox("");
		chckbxNewCheckBox_4_5.setBounds(206, 202, 37, 30);
		panel.add(chckbxNewCheckBox_4_5);
		
		JCheckBox chckbxNewCheckBox_5_5 = new JCheckBox("");
		chckbxNewCheckBox_5_5.setBounds(247, 202, 37, 30);
		panel.add(chckbxNewCheckBox_5_5);
		
		JCheckBox chckbxNewCheckBox_6_5 = new JCheckBox("");
		chckbxNewCheckBox_6_5.setBounds(288, 202, 37, 30);
		panel.add(chckbxNewCheckBox_6_5);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("");
		chckbxNewCheckBox_1_6.setBounds(83, 234, 37, 30);
		panel.add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_2_6 = new JCheckBox("");
		chckbxNewCheckBox_2_6.setBounds(124, 234, 37, 30);
		panel.add(chckbxNewCheckBox_2_6);
		
		JCheckBox chckbxNewCheckBox_3_6 = new JCheckBox("");
		chckbxNewCheckBox_3_6.setBounds(165, 234, 37, 30);
		panel.add(chckbxNewCheckBox_3_6);
		
		JCheckBox chckbxNewCheckBox_4_6 = new JCheckBox("");
		chckbxNewCheckBox_4_6.setBounds(206, 234, 37, 30);
		panel.add(chckbxNewCheckBox_4_6);
		
		JCheckBox chckbxNewCheckBox_5_6 = new JCheckBox("");
		chckbxNewCheckBox_5_6.setBounds(247, 234, 37, 30);
		panel.add(chckbxNewCheckBox_5_6);
		
		JCheckBox chckbxNewCheckBox_6_6 = new JCheckBox("");
		chckbxNewCheckBox_6_6.setBounds(288, 234, 37, 30);
		panel.add(chckbxNewCheckBox_6_6);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
			}
		});
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("선택번호 확인");
		lblNewLabel_4.setBounds(12, 10, 76, 15);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("초기화");
		btnNewButton.setBounds(232, 10, 97, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("구매하기");
		btnNewButton_1.setBounds(232, 273, 97, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("삭제");
		btnNewButton_3.setBounds(257, 60, 30, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("복사");
		btnNewButton_3_1.setBounds(299, 60, 30, 23);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("수정");
		btnNewButton_3_2.setBounds(215, 60, 30, 23);
		panel_1.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_2_1 = new JButton("New button");
		btnNewButton_3_2_1.setBounds(215, 93, 30, 23);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_3 = new JButton("New button");
		btnNewButton_3_3.setBounds(257, 93, 30, 23);
		panel_1.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_1 = new JButton("New button");
		btnNewButton_3_1_1.setBounds(299, 93, 30, 23);
		panel_1.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_2 = new JButton("New button");
		btnNewButton_3_2_2.setBounds(215, 126, 30, 23);
		panel_1.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_4 = new JButton("New button");
		btnNewButton_3_4.setBounds(257, 126, 30, 23);
		panel_1.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_1_2 = new JButton("New button");
		btnNewButton_3_1_2.setBounds(299, 126, 30, 23);
		panel_1.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_2_3 = new JButton("New button");
		btnNewButton_3_2_3.setBounds(215, 159, 30, 23);
		panel_1.add(btnNewButton_3_2_3);
		
		JButton btnNewButton_3_5 = new JButton("New button");
		btnNewButton_3_5.setBounds(257, 159, 30, 23);
		panel_1.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_1_3 = new JButton("New button");
		btnNewButton_3_1_3.setBounds(299, 159, 30, 23);
		panel_1.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_3_2_4 = new JButton("New button");
		btnNewButton_3_2_4.setBounds(215, 192, 30, 23);
		panel_1.add(btnNewButton_3_2_4);
		
		JButton btnNewButton_3_6 = new JButton("New button");
		btnNewButton_3_6.setBounds(257, 192, 30, 23);
		panel_1.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_1_4 = new JButton("New button");
		btnNewButton_3_1_4.setBounds(299, 192, 30, 23);
		panel_1.add(btnNewButton_3_1_4);
		
		JLabel lblNewLabel = new JLabel("남은 시간");
		lblNewLabel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("당첨 예상금액...");
		lblNewLabel_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("제 n회");
		lblNewLabel_2.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("초기화");
		
		JButton btnNewButton_2_1 = new JButton("자동선택");
		
		JButton btnNewButton_2_2 = new JButton("번호등록");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(259)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(176)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnNewButton_2_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(105)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_2_1)
						.addComponent(btnNewButton_2_2)))
		);
		
		JLabel lblNewLabel_5 = new JLabel("얼마");
		lblNewLabel_5.setBounds(163, 277, 57, 15);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("a열");
		lblNewLabel_6.setBounds(12, 64, 30, 15);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("b열");
		lblNewLabel_6_1.setBounds(12, 97, 30, 15);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("c열");
		lblNewLabel_6_1_1.setBounds(12, 130, 30, 15);
		panel_1.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("d열");
		lblNewLabel_6_1_2.setBounds(12, 163, 30, 15);
		panel_1.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("e열");
		lblNewLabel_6_1_3.setBounds(12, 196, 30, 15);
		panel_1.add(lblNewLabel_6_1_3);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("");
		chckbxNewCheckBox_8.setBounds(50, 60, 21, 23);
		panel_1.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_8_1 = new JCheckBox("");
		chckbxNewCheckBox_8_1.setBounds(75, 60, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_1);
		
		JCheckBox chckbxNewCheckBox_8_2 = new JCheckBox("");
		chckbxNewCheckBox_8_2.setBounds(100, 60, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_2);
		
		JCheckBox chckbxNewCheckBox_8_3 = new JCheckBox("");
		chckbxNewCheckBox_8_3.setBounds(125, 60, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_3);
		
		JCheckBox chckbxNewCheckBox_8_4 = new JCheckBox("");
		chckbxNewCheckBox_8_4.setBounds(150, 60, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_4);
		
		JCheckBox chckbxNewCheckBox_8_5 = new JCheckBox("");
		chckbxNewCheckBox_8_5.setBounds(175, 60, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_5);
		
		JCheckBox chckbxNewCheckBox_8_6 = new JCheckBox("");
		chckbxNewCheckBox_8_6.setBounds(50, 93, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_6);
		
		JCheckBox chckbxNewCheckBox_8_1_1 = new JCheckBox("");
		chckbxNewCheckBox_8_1_1.setBounds(75, 93, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_1_1);
		
		JCheckBox chckbxNewCheckBox_8_2_1 = new JCheckBox("");
		chckbxNewCheckBox_8_2_1.setBounds(100, 93, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_2_1);
		
		JCheckBox chckbxNewCheckBox_8_3_1 = new JCheckBox("");
		chckbxNewCheckBox_8_3_1.setBounds(125, 93, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_3_1);
		
		JCheckBox chckbxNewCheckBox_8_4_1 = new JCheckBox("");
		chckbxNewCheckBox_8_4_1.setBounds(150, 93, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_4_1);
		
		JCheckBox chckbxNewCheckBox_8_5_1 = new JCheckBox("");
		chckbxNewCheckBox_8_5_1.setBounds(175, 93, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_5_1);
		
		JCheckBox chckbxNewCheckBox_8_7 = new JCheckBox("");
		chckbxNewCheckBox_8_7.setBounds(50, 126, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_7);
		
		JCheckBox chckbxNewCheckBox_8_1_2 = new JCheckBox("");
		chckbxNewCheckBox_8_1_2.setBounds(75, 126, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_1_2);
		
		JCheckBox chckbxNewCheckBox_8_2_2 = new JCheckBox("");
		chckbxNewCheckBox_8_2_2.setBounds(100, 126, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_2_2);
		
		JCheckBox chckbxNewCheckBox_8_3_2 = new JCheckBox("");
		chckbxNewCheckBox_8_3_2.setBounds(125, 126, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_3_2);
		
		JCheckBox chckbxNewCheckBox_8_4_2 = new JCheckBox("");
		chckbxNewCheckBox_8_4_2.setBounds(150, 126, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_4_2);
		
		JCheckBox chckbxNewCheckBox_8_5_2 = new JCheckBox("");
		chckbxNewCheckBox_8_5_2.setBounds(175, 126, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_5_2);
		
		JCheckBox chckbxNewCheckBox_8_8 = new JCheckBox("");
		chckbxNewCheckBox_8_8.setBounds(50, 159, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_8);
		
		JCheckBox chckbxNewCheckBox_8_1_3 = new JCheckBox("");
		chckbxNewCheckBox_8_1_3.setBounds(75, 159, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_1_3);
		
		JCheckBox chckbxNewCheckBox_8_2_3 = new JCheckBox("");
		chckbxNewCheckBox_8_2_3.setBounds(100, 159, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_2_3);
		
		JCheckBox chckbxNewCheckBox_8_3_3 = new JCheckBox("");
		chckbxNewCheckBox_8_3_3.setBounds(125, 159, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_3_3);
		
		JCheckBox chckbxNewCheckBox_8_4_3 = new JCheckBox("");
		chckbxNewCheckBox_8_4_3.setBounds(150, 159, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_4_3);
		
		JCheckBox chckbxNewCheckBox_8_5_3 = new JCheckBox("");
		chckbxNewCheckBox_8_5_3.setBounds(175, 159, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_5_3);
		
		JCheckBox chckbxNewCheckBox_8_9 = new JCheckBox("");
		chckbxNewCheckBox_8_9.setBounds(50, 192, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_9);
		
		JCheckBox chckbxNewCheckBox_8_1_4 = new JCheckBox("");
		chckbxNewCheckBox_8_1_4.setBounds(75, 192, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_1_4);
		
		JCheckBox chckbxNewCheckBox_8_2_4 = new JCheckBox("");
		chckbxNewCheckBox_8_2_4.setBounds(100, 192, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_2_4);
		
		JCheckBox chckbxNewCheckBox_8_3_4 = new JCheckBox("");
		chckbxNewCheckBox_8_3_4.setBounds(125, 192, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_3_4);
		
		JCheckBox chckbxNewCheckBox_8_4_4 = new JCheckBox("");
		chckbxNewCheckBox_8_4_4.setBounds(150, 192, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_4_4);
		
		JCheckBox chckbxNewCheckBox_8_5_4 = new JCheckBox("");
		chckbxNewCheckBox_8_5_4.setBounds(175, 192, 21, 23);
		panel_1.add(chckbxNewCheckBox_8_5_4);
		frame.getContentPane().setLayout(groupLayout);
	}
}
