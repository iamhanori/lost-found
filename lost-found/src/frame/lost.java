package frame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lost extends JFrame {
	
	Color c = new Color(0, 129, 86);
	ImageIcon btImage = new ImageIcon(lost.class.getResource("../image/bbtn.png")); // 뒤로가기 버튼 
	
	public void homeframe() {
		
		JPanel p = new JPanel();
		p.setLayout(null);
		getContentPane().add(p);
	    p.setBackground(c);
		
		setTitle("lost & found");// 타이틀
		setSize(600, 900);// 프레임의 크기
		setResizable(false);// 창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);// 창이 가운데 나오게
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);// 창이 보이게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
		
	}

	public void btn() {
		JButton bf = new JButton("found"); // 등록하기
		JButton bback = new JButton(btImage); // 뒤로가기
		
		bf.setLayout(null);
		bback.setBorderPainted(false);
		bf.setBounds(400, 600, 100, 50); // 위치, 크기
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

	// 생성자
		public lost() {
			homeframe();
			btn();
		}

//	// 그리는 함수 background를 그려줌
//		public void paint(Graphics g) {
//			Image background = new ImageIcon(main.class.getResource("../image/bgcolor.png")).getImage(); // 배경이미지
//			g.drawImage(background, 0, 0, null);
//		}
	
	
	public static void main(String[] args) {
		new lost();

	}
}
