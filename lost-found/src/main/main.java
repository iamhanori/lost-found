package main;

import java.awt.*;
import javax.swing.*;

public class main extends JFrame {
	
	// 버튼 생성
	static JButton bl = new JButton("lost");
	static JButton bf = new JButton("found");
	
	// 배경이미지
	private Image background = new ImageIcon(main.class.getResource("../image/bg.png")).getImage();

	// 생성자
	public main() {
		homeframe();
		btn();
	}

	public void homeframe() {
		setTitle("lost & found");// 타이틀
		setSize(600, 900);// 프레임의 크기
		setResizable(false);// 창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);// 창이 가운데 나오게
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);// 창이 보이게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
	}
	
	// 버튼 설정
	public void btn() {
		bl.setLayout(null);
		bl.setBounds(145, 350, 150, 150); // 위치, 크기
		add(bl);
		bf.setLayout(null);
		bf.setBounds(305, 350, 150, 150);
		add(bf);
	}
	
	// 그리는 함수 background를 그려줌
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}

	public static void main(String[] args) {
		new main();
	}
}