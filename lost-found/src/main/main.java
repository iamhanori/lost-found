package main;

import java.awt.*;
import javax.swing.*;

import lost.lost;

import java.awt.event.*;

public class main extends JFrame {
	// ��ư ����
	JButton bl = new JButton("lost");
	JButton bf = new JButton("found");

	// ����̹���
	Image background = new ImageIcon(main.class.getResource("../image/bg.png")).getImage();

	// ������
	public main() {
		homeframe();
		btn();
	}

	public void homeframe() {
		setTitle("lost & found");// Ÿ��Ʋ
		setSize(600, 900);// �������� ũ��
		setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);// â�� ��� ������
		setLayout(null);// ���̾ƿ��� ������� ���������ϰ� ����.
		setVisible(true);// â�� ���̰�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�
	}

	// ��ư ����
	public void btn() {
		bl.setLayout(null);
		bl.setBounds(140, 350, 150, 150); // ��ġ, ũ��
		bl.addActionListener(e -> {
			dispose();
			new lost().setVisible(true);
		});
		add(bl);
		

		bf.setLayout(null);
		bf.setBounds(310, 350, 150, 150);
		add(bf);

	}

	// �׸��� �Լ� background�� �׷���
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
	


	public static void main(String[] args) {
		new main();
		
	}
}