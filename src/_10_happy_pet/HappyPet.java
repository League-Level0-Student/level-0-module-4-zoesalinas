package _10_happy_pet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0; 
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String input = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
		    // 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int i = 0; i < 3; i++) {			int task = JOptionPane.showOptionDialog(null, "How would you like to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "walk", "food or water", "pet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	cuddle();
}
if (task==1) {
	walk();
}
if (task==2) {
	food();
}
if (task==3) {
	pet();
}
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel == 9 ) {
	JOptionPane.showMessageDialog(null, "Good job, your pet is very happy!");
}
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}
	static void cuddle () {
JOptionPane.showMessageDialog(null, "Your pet is happy and is comforable with you. +3 happiness");
happinessLevel += 3;
	}
	static void walk ()  {
		JOptionPane.showMessageDialog(null, "Your pet is happy and is comforable with you.+3 happiness");
		happinessLevel += 3;
	}
	static void food ()   {
		JOptionPane.showMessageDialog(null, "Your pet is happy and is comforable with you.+3 happiness");
		happinessLevel += 3;
	}
	static void pet ()  {
		JOptionPane.showMessageDialog(null, "Your pet is happy and is comforable with you.+3 happiness");
		happinessLevel += 3;
	}
}
