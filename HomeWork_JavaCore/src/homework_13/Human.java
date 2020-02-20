package homework_13;

public class Human {
	protected int weight;
	protected int height;
	
	Human(){}
	
	Human(int weight,int height){
		this.height=height;
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
