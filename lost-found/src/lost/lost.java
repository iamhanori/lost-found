package lost;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lost extends JFrame {

	// ������
		public lost() {
			homeframe();
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
	
	
}
