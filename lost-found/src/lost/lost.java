package lost;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lost extends JFrame {

	// 생성자
		public lost() {
			homeframe();
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
	
	
}
