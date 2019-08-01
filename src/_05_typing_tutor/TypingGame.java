package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingGame implements KeyListener {
	
	 char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
void buttonSetup(){
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	char currentLetter;
	currentLetter = generateRandomLetter();
	f.add(l);
	f.setVisible(true);
	l.setText(currentLetter+"");
	l.setFont(l.getFont().deriveFont(28.0f));
	l.setHorizontalAlignment(JLabel.CENTER);
	f.setSize(200, 200);
	f.addKeyListener(this);
}
	public static void main(String[] args) {
		TypingGame a = new TypingGame();
		a.buttonSetup();
		
}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if()
	}	
}
