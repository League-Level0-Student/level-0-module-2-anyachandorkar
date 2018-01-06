package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int userage = Integer.parseInt(age);
	if(userage>18) {
		String president = JOptionPane.showInputDialog("Who should the next president be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	}
}
}
