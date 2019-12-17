import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your test score? (You must answer as a decimal) ");
	double score = Double.parseDouble(input);
	if(score>90) {
		JOptionPane.showMessageDialog(null, "Great Job");
	}
	else if(score>70) {
		JOptionPane.showMessageDialog(null, "You should practice harder!!");
	}
	else if(score>40) {
		JOptionPane.showMessageDialog(null, "You should actually study!!!!!!!!!!!!!!!");
	}
	else if(score>0) {
		JOptionPane.showMessageDialog(null, "YOU SUCK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
		
}
}
