import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot Neel = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	String answer = JOptionPane.showInputDialog("Should the robot draw in green or blue?");

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	Neel.penDown();
    	if(answer.equalsIgnoreCase("Blue"))  {
    		Neel.setPenColor(Color.blue);
    	}
    	else if(answer.equalsIgnoreCase("Green")) {
    		Neel.setPenColor(Color.green);
    	}
   	 // 2. set the pen width to 10
    	Neel.setPenWidth(10);

   	 // 1. make the Robot draw a shape
    	
    	for (int i = 1; i < 5; i++) {
			Neel.move(200);
			Neel.turn(90);
		}
    	
//    	Neel.move(200);
//    	Neel.turn(90);
//    	Neel.move(200);
//    	Neel.turn(90);
//    	Neel.move(200);
//    	Neel.turn(90);
//    	Neel.move(200);
//    	
   	 
    }

}
