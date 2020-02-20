package homework_14;
public class IPhone {
	protected String colour;
	protected int version;
	
	public IPhone() {}
	
	public IPhone(String colour , int version) {
		this.colour=colour;
		this.version=version;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public String toString() {
		return "Colour of IPhone :"+colour+" , version of IPhone :"+version;
	}
	
}
