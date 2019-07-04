package _01_nasty_surprise;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




public class TrickyTreat {
	public static void main(String[] args) {
	int N=JOptionPane.showOptionDialog(null, "Pick the following", "Your choice!", JOptionPane.YES_NO_OPTION,
	JOptionPane.INFORMATION_MESSAGE, null,
	new String[] { "Trick", "Treat" }, null);
	if (N==1) {
		JOptionPane.showMessageDialog(null, "Enjoy your trick!");
		showPictureFromTheInternet("http://cdn2.quizly.co/wp-content/uploads/2017/12/27184543/phobia-of-heights.jpg");
	}
	if (N==0) {
		JOptionPane.showMessageDialog(null, "Enjoy your treat!");
		showPictureFromTheInternet("file:///home/leaguestudent/git/level1-module4-brandonzaayer/src/_01_nasty_surprise/Cute.jpeg");
	}
	}
	private static void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
}
