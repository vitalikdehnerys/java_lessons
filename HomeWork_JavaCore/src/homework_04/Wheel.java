package homework_04;
public class Wheel {
	private double diameter;
	private String material;
	
	public Wheel() {}
	
	
	public Wheel(double diameter,String material) {
		this.diameter=diameter;
		this.material=material;
		
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void ChangeWheel() {
		this.diameter=diameter*1.2;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", material=" + material + "]";
	}
	
	
}
