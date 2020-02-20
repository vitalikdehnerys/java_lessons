package homework_15;

public class Animal {
	@Override
	public String toString() {
		return  type +" "+ name +" ; ";
	}

	TypeOfAnimal type;
	String name;
	
	public Animal() {}
	
	public Animal(TypeOfAnimal type,String name) {
		this.name=name;
		this.type=type;
	}

	public TypeOfAnimal getType() {
		return type;
	}

	public void setType(String typ) {
		this.type=this.type.valueOf(typ);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
