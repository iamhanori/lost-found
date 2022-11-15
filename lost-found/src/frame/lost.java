package frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lost extends JFrame {
	
	Color c = new Color(0, 129, 86);
	ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png")); // �ڷΰ��� ��ư 
	
	public void homeframe() {
		
		JPanel p = new JPanel();
		p.setLayout(null);
		getContentPane().add(p);
	    p.setBackground(c);
		
		setTitle("lost & found");// Ÿ��Ʋ
		setSize(600, 900);// �������� ũ��
		setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);// â�� ��� ������
		setLayout(null);// ���̾ƿ��� ������� ���������ϰ� ����.
		setVisible(true);// â�� ���̰�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�
		
	}

	public void btn() {
		JButton bf = new JButton("found"); // ����ϱ�
		JButton bback = new JButton(btImage); // �ڷΰ���
		
		bf.setLayout(null);
		bback.setBorderPainted(false);
		bf.setBounds(400, 600, 100, 50); // ��ġ, ũ��
		bf.addActionListener(e -> {
			dispose();
			new found().setVisible(true);
		});
		add(bf);
		
		bback.setBorderPainted(false);
		bback.setFocusPainted(false);
		bback.setBackground(c);
		bback.setIcon(btImage);
		bback.setLayout(null);
		bback.setBounds(35, 40, 15, 25);
		bback.addActionListener(e -> {
			dispose();
			new main().setVisible(true);
		});
		add(bback);
	}

	// ������
		public lost() {
			homeframe();
			btn();
		}

//	// �׸��� �Լ� background�� �׷���
//		public void paint(Graphics g) {
//			Image background = new ImageIcon(main.class.getResource("../image/bgcolor.png")).getImage(); // ����̹���
//			g.drawImage(background, 0, 0, null);
//		}
	
	
	public static void main(String[] args) {
		new lost();

	}
}
