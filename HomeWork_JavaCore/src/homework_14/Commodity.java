package homework_14;

public class Commodity {
	String name;
	int length;
	int width;
	int weigth;
	
	public Commodity() {}
	
	public Commodity(String name,int length,int width,int weigth) {
		this.name=name;
		this.length=length;
		this.width=width;
		this.weigth=weigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weigth=" + weigth + "]";
	}
	
	
}
