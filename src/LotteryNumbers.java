package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random gen = new Random();
	int rand = gen.nextInt(51);
	int rand1 = gen.nextInt(101);
	int rand2 = gen.nextInt(101)+50;
	int rand3 = gen.nextInt(64)+153;
	int rand4 = gen.nextInt();
	JOptionPane.showMessageDialog(null, "Your lottery numbers are "+ rand + " " + rand1 + " " + rand2 + " " + rand3 + " " + rand4);
}
}
