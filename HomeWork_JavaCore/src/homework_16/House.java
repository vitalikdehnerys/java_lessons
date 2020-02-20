package homework_16;

public class House {
	protected int numberFlats;
	protected int area;
	protected int numberFloors;
	protected String colour;
	
	public House() {};
	
	public House(int numberFlats,int area,int numberFloors,String colour) {
		this.numberFlats=numberFlats;
		this.area=area;
		this.numberFloors=numberFloors;
		this.colour=colour;
	}

	public int getNumberFlats() {
		return numberFlats;
	}

	public void setNumberFlats(int numberFlats) {
		this.numberFlats = numberFlats;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getNumberFloors() {
		return numberFloors;
	}

	public void setNumberFloors(int numberFloors) {
		this.numberFloors = numberFloors;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void myMethod(String string ) {
		System.out.println("This House has "+string+" colour.");
	}
	
	public void myMethod(String string ,int numberFlats,int area,int numberFloors ) {
		System.out.println("This House has "+string+" colour," + numberFlats+" flats,"+area+" area,"+numberFloors+" floors.");	
	}
}
