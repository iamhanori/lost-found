package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.text.html.ImageView;

import button.RoundedButton;
//import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
//import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
//import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Registration extends JFrame {

   public Registration() {
	   
      var p = new JPanel();
      var l = new JLabel("����ϱ�");
      var c1 = new Color(0, 129, 86);      // ���
      var c2 = new Color(239, 177, 28);   // �۾�
      var f1 = new Font("KoPub����ü Bold", Font.PLAIN, 35);
      var f2 = new Font("KoPub����ü Medium", Font.PLAIN, 25);
      var f3 = new Font("KoPub����ü Medium", Font.PLAIN, 20);
      var f4 = new Font("KoPub����ü Medium", Font.PLAIN, 15);
      
      p.setLayout(null);
      l.setFont(f1);
      l.setForeground(c2);
      l.setBounds(75, 60, 135, 45);

      var group = new ButtonGroup();
      var rb1 = new JRadioButton("����");
      var rb2 = new JRadioButton("�н�");
      var iv = new ImageView(null);
      
      var jl1 = new JLabel("���� ��¥");
      var jl2 = new JLabel("���湰");
      var jl3 = new JLabel("���� ���");
      var jl4 = new JLabel("��Ÿ (������ Ư¡ ��)");
      
      // ��¥ ����
    //  var model = new UtilDateModel();
    //  var datePanel = new JDatePanelImpl(model);
    //  var datePicker = new JDatePickerImpl(datePanel);
    
      var tf1 = new JTextField();
      var tf2 = new JTextField();
      var tf3 = new JTextField(5);
      
      // ����, �н� ��ư
      rb1.setSelected(true);
      rb1.setBounds(75, 150, 70, 30);
      rb2.setBounds(75, 200, 70, 30);
      rb1.setFont(f2);
      rb2.setFont(f2);
      rb1.setBorderPainted(false);
      rb2.setBorderPainted(false);
      rb1.setFocusable(false);
      rb2.setFocusable(false);
      rb1.setOpaque(false);
      rb2.setOpaque(false);
      
      rb1.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            jl1.setText("���� ��¥");
            jl2.setText("���湰");
            jl3.setText("���� ���");
            
         }
      });
      rb2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            jl1.setText("�н� ��¥");
            jl2.setText("�нǹ�");
            jl3.setText("�н� ���");
            
         }
      });
      
      jl1.setBounds(75, 265, 450, 45);
      jl2.setBounds(75, 350, 450, 45);
      jl3.setBounds(75, 450, 450, 45);
      jl4.setBounds(75, 550, 450, 45);
      jl1.setFont(f2);
      jl2.setFont(f2);
      jl3.setFont(f2);
      jl4.setFont(f2);
      
      jl1.setForeground(c2);
      jl2.setForeground(c2);
      jl3.setForeground(c2);
      jl4.setForeground(c2);
      
      
//      datePicker.setBounds(75, 310, 450, 25);
      tf1.setBounds(75, 395, 450, 40);
      tf2.setBounds(75, 495, 450, 40);
      tf3.setBounds(75, 595, 450, 100);
      
      tf1.setFont(f3);
      tf2.setFont(f3);
//      datePicker.setFont(f3);
      tf3.setFont(f3);
      
      // ���ڼ� ����
      tf1.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent ke) {
            JTextField src = (JTextField) ke.getSource();
            if (src.getText().length() >= 6) ke.consume();
         }
      });
      
      getContentPane().add(p);
      p.setBackground(c1);
      
      p.add(l);

      group.add(rb1);
      group.add(rb2);
      p.add(rb1);
      p.add(rb2);
      
      
      p.add(jl1);
      p.add(jl2);
      p.add(jl3);
      p.add(jl4);
      p.add(tf1);
      p.add(tf2);
//      p.add(datePicker);
      p.add(tf3);
      
      // ���� ÷�� ��ư
      RoundedButton btnNewButton = new RoundedButton("����÷��");
      btnNewButton.setBounds(320, 730, 95, 30);
      btnNewButton.setFont(f4);
      p.add(btnNewButton);
      
      // ����ϱ� ��ư
      RoundedButton btnNewButton_1 = new RoundedButton("����ϱ�");
      btnNewButton_1.setBounds(430, 730, 95, 30);
      btnNewButton_1.setFont(f4);
      btnNewButton.paintComponents(getGraphics());
      p.add(btnNewButton_1);

      setSize(600, 900);
      setResizable(false);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      

   }

   public static void main(String[] args) {
      new Registration().setVisible(true);

   }
   
   
}