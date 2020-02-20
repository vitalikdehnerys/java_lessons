package homework_04;
public class MainClass {

	public static void main(String[] args) {

		//creating copies
		Robot robot = new Robot();
		CoffeRobot barist = new CoffeRobot();
		RobotDancer dancer = new RobotDancer();
		RobotCoocker coocker = new RobotCoocker();
		
		//doing method "work"
		robot.robotWork();
		System.out.println();
		barist.robotWork();
		System.out.println();
		dancer.robotWork();
		System.out.println();
		coocker.robotWork();
		System.out.println();
		
		//creating array robots 
		Robot [] arrayarrayRobots = {robot,barist,dancer,coocker};
		
		for (int i = 0; i < arrayarrayRobots.length; i++) {
			arrayarrayRobots[i].robotWork();
		}
	
	}

	}

