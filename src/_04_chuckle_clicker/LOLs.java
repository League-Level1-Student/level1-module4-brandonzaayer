package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LOLs implements ActionListener {
	JButton b = new JButton();
	JButton d = new JButton();
public static void main(String[] args) {
	LOLs e = new LOLs();
	e.buttonMaker();
}
public void buttonMaker() {
	
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel p = new JPanel();
frame.add(p);

p.add(b);
p.add(d);
b.addActionListener(this);
d.addActionListener(this);
b.setText("Joke");
d.setText("Punchline");
frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource().equals(b)) {
		JOptionPane.showMessageDialog(null, "Today at the bank, an old lady asked me to help check her balance. So I pushed her over");
	}
	else if(arg0.getSource().equals(d)) {
		JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes?\n" + 
				"\n" + 
				"Because he doesn’t want to be spotted.");
	}
}
}
