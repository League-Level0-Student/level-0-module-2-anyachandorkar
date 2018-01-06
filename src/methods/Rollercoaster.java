package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
	int userheight = Integer.parseInt(height);
	if(userheight>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster");
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry you need to grow more first");
	}
	}

}
