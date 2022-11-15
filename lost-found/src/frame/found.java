package frame;

import javax.swing.*;
import java.awt.*;

public class found extends JFrame {

	public found() {
		var p = new JPanel();
		var l = new JLabel("등록하기");
		var c1 = new Color(0, 129, 86); // 배경
		var c2 = new Color(239, 177, 28); // 글씨
		var f1 = new Font("KoPub돋움체 Bold", Font.PLAIN, 35);
		var f2 = new Font("KoPub돋움체 Medium", Font.PLAIN, 25);

		p.setLayout(null);
		l.setFont(f1);
		l.setForeground(c2);
		l.setBounds(75, 60, 135, 45);

		var group = new ButtonGroup();
		var rb1 = new JRadioButton("습득");
		var rb2 = new JRadioButton("분실");

		ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png")); // 뒤로가기 버튼
		var bback = new JButton(btImage);

		var jl1 = new JLabel("습득물");
		var jl2 = new JLabel("습득 장소");
		var jl3 = new JLabel("습득 날짜");
		var jl4 = new JLabel("기타 (물건의 특징 등)");

		var tf1 = new JTextField(20);
		var tf2 = new JTextField(20);
		var tf3 = new JTextField(20);
		var tf4 = new JTextField(20);

		// 습득, 분실 버튼
		rb1.setSelected(true);
		rb1.setBounds(75, 150, 70, 30);
		rb2.setBounds(75, 200, 70, 30);
		rb1.setFont(f2);
		rb2.setFont(f2);

		// 뒤로가기
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
		add(bback);

		jl1.setBounds(75, 265, 450, 45);
		jl2.setBounds(75, 365, 450, 45);
		jl3.setBounds(75, 465, 450, 45);
		jl4.setBounds(75, 565, 450, 45);

		jl1.setFont(f2);
		jl2.setFont(f2);
		jl3.setFont(f2);
		jl4.setFont(f2);

		jl1.setForeground(c2);
		jl2.setForeground(c2);
		jl3.setForeground(c2);
		jl4.setForeground(c2);

		tf1.setBounds(75, 310, 450, 40);
		tf2.setBounds(75, 410, 450, 40);
		tf3.setBounds(75, 510, 450, 40);
		tf4.setBounds(75, 610, 450, 40);

		getContentPane().add(p);
		p.setBackground(c1);

		p.add(l);
		group.add(rb1);
		group.add(rb2);
		p.add(rb1);
		p.add(rb2);
		p.add(bback);
		p.add(jl1);
		p.add(tf1);
		p.add(jl2);
		p.add(tf2);
		p.add(jl3);
		p.add(tf3);
		p.add(jl4);
		p.add(tf4);

		setTitle("lost & found");
		setSize(600, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new found().setVisible(true);

	}

}