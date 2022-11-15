package frame;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class main extends JFrame {
	JPanel p = new JPanel();
	JLabel l = new JLabel("�ֱ� ��ϵ� ���湰");
	Color c1 = new Color(0, 129, 86); // ���
	Color c2 = new Color(239, 177, 28); // �۾�
	Font f2 = new Font("KoPub����ü Medium", Font.PLAIN, 25);

	JButton bl = new JButton("lost");
	JButton bf = new JButton("found");

	public main() {

		p.setLayout(null);
		l.setFont(f2);
		l.setForeground(c2);
		l.setBounds(85, 560, 160, 30);

		bl.setLayout(null);
		bl.setBounds(140, 350, 150, 150); // ��ġ, ũ��
		bl.addActionListener(e -> {
			dispose();
			new lost().setVisible(true);
		});
		p.add(bl);

		bf.setLayout(null);
		bf.setBounds(310, 350, 150, 150);
		bf.addActionListener(e -> {
			dispose();
			new found().setVisible(true);
		});
		p.add(bf);

		getContentPane().add(p);
		p.setBackground(c1);

		setTitle("lost & found");// Ÿ��Ʋ
		setSize(600, 900);// �������� ũ��
		setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);// â�� ��� ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�
	}

	public static void main(String[] args) {
		new main().setVisible(true);
	}
}