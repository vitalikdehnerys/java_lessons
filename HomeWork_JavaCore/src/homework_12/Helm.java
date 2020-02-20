package homework_12;
public class Helm {
	private double radius;
	private String colour;
	
	public Helm() {}
	
	public Helm(double radius,String colour) {
		this.colour=colour;
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void ChangeHelm() {
		this.radius=radius*2;
	}

	@Override
	public String toString() {
		return "Helm [radius=" + radius + ", colour=" + colour + "]";
	}
	
	
}
