package homework_04;
public class Robot {
	protected CoffeRobot coffeRobot;
	protected RobotDancer robotDancer;
	protected RobotCoocker robotCoocker;
	
	public Robot() {}

	public CoffeRobot getCoffeRobot() {
		return coffeRobot;
	}

	public void setCoffeRobot(CoffeRobot coffeRobot) {
		this.coffeRobot = coffeRobot;
	}

	public RobotDancer getRobotDancer() {
		return robotDancer;
	}

	public void setRobotDancer(RobotDancer robotDancer) {
		this.robotDancer = robotDancer;
	}

	public RobotCoocker getRobotCoocker() {
		return robotCoocker;
	}

	public void setRobotCoocker(RobotCoocker robotCoocker) {
		this.robotCoocker = robotCoocker;
	}
	
	// method work()
	public void robotWork() {
		System.out.println("I robot , I just work");
	}
}
