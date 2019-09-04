package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	public static void main(String[] args) {
	Calculator c = new Calculator();
		c.setup();
}
void setup(){
	f.add(p);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(t1);
	p.add(t2);
	b1.setText("Addition");
	b1.addActionListener(this);
	b2.setText("Subtraction");
	b2.addActionListener(this);
	b3.setText("Multiplication");
	b3.addActionListener(this);
	b4.setText("Division");
	b4.addActionListener(this);
	t1.setPreferredSize(new Dimension(100, 100));
	t2.setPreferredSize(new Dimension(100, 100));
	f.setVisible(true);
	f.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	int one = Integer.parseInt(t1.getText());
	int two = Integer.parseInt(t2.getText());
	if(arg0.getSource().equals(b1)) {
		JOptionPane.showMessageDialog(null, one + two);
	}
	else if(arg0.getSource().equals(b2)) {
		JOptionPane.showMessageDialog(null, one - two);
	}
	else if(arg0.getSource().equals(b3)) {
		JOptionPane.showMessageDialog(null, one * two);
	}
	else {
		JOptionPane.showMessageDialog(null, one / two);
	}
}
}
