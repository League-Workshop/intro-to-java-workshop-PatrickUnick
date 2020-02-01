package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		
		// 5. Set your robot's pen down 
		rob.penDown();
	
		// 3. Set the robot to go at max speed (100)
		rob.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		int r = 20;
		int m = 0;
		rob.hide(); 
		for(int i = 0; i < 1000;i++) { 
			  
			rob.setPenColor(Color.black);
			 rob.move(50);
			 rob.turn(r+= 10);
			 if (r > 360) {
				r = 0;
			 }
		}
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
	}
}


