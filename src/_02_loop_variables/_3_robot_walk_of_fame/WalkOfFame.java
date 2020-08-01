
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.setX(50);
		rob.setY(550);
		rob.penDown();
		rob.setPenColor(255,0,0);
		rob.setSpeed(100);
		
		// Creating the star
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		
		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		
		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);

		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);

		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);

		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);

		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);

		rob.setX(100);
		rob.setAngle(0);
		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(144);
		rob.move(30);

		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		
		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * ://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */
	}
	
	}