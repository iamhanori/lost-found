package frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lost extends JFrame {
	JPanel p = new JPanel();
	Color c1 = new Color(0, 129, 86);
	ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png")); // �ڷΰ��� ��ư
	JButton bback = new JButton(btImage); // �ڷΰ���
	JButton bf = new JButton("found"); // ����ϱ�
	
	public lost() {
		p.setLayout(null);
		bf.setLayout(null);
		bback.setBorderPainted(false);
		bf.setBounds(400, 600, 100, 50); // ��ġ, ũ��
		bf.addActionListener(e -> {
			dispose();
			new Registration().setVisible(true);
		});
		p.add(bf);

		bback.setBorderPainted(false);
		bback.setFocusPainted(false);
		bback.setBackground(c1);
		bback.setIcon(btImage);
		bback.setLayout(null);
		bback.setBounds(35, 40, 15, 25);
		bback.addActionListener(e -> {
			dispose();
			new main().setVisible(true);
		});
		p.add(bback);

		getContentPane().add(p);
		p.setBackground(c1);

		setSize(600, 900);// �������� ũ��
		setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);// â�� ��� ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�

	}

	public static void main(String[] args) {
		new lost().setVisible(true);

	}
}
