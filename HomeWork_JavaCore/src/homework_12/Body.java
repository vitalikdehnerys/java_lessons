package homework_12;
public class Body {
	private String colour;
	private int area;
	
	public Body() {}
	
	public Body(String colour,int area) {
		this.area=area;
		this.colour=colour;	
	}
	

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void ChangeBody() {
		this.area=2*area;
	}

	@Override
	public String toString() {
		return "Body [colour=" + colour + ", area=" + area + "]";
	}
	
	
}
