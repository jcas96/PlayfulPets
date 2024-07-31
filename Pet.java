import java.util.ArrayList;
import java.util.List;

public class Pet {

	static List<Pet> pets = new ArrayList<Pet>();
	
	private String name;
	private String animal;
	private String breed;
	private String color;
	private double price;
	
	public Pet(){
		
	};
	public Pet(String na, String an, String br,String co, double pr){
		setName(na);
		setAnimal(an);
		setBreed(br);
		setColor(co);
		setPrice(pr);
	}
	
	public void setName(String n) {
		name=n;
	}
	public void setAnimal(String a) {
		animal =a;
	}
	public void setBreed(String b) {
		breed=b;
	}
	public void setColor(String c) {
		color=c;
	}
	public void setPrice(double p) {
		price=p;
	}
	
	public String getName() {
		return name;
	}
	public String getAnimal() {
		return animal;
	}
	public String getBreed() {
		return breed;
	}
	public String getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return String.format("%S: a %S %S %S purchased for $%.2f", name, color,breed,animal,price);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Pet)) {
			return false;
		}else {
			Pet petTest = (Pet) obj;
			if((animal.equals(petTest.animal))&&(breed.equals(petTest.breed))){
				return true;
			}else {
				return false;
			}
		}
	}	
}
	
	
