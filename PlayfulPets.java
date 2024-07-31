import java.util.ArrayList;
import java.util.List;

public class PlayfulPets {

	public static void main(String[] args) {

		Pet.pets.add(new Pet("Scruffy","dog","poodle","white",895.0));
		Pet.pets.add(new Pet("Meow","cat","siamese","white",740.25));
		Pet.pets.add(new Pet("Max","dog","poodle","black",540.50));
		Pet.pets.add(new Pet("Cuddles","dog","pug","black",1282.75));
		Pet.pets.add(new Pet("Slider","snake","garden","green",320.00));
		
		PetMatcher breedMatcher =new PetMatcher(){

			@Override
			public List<Pet> matchPet(Pet a) {
				List<Pet> matchingPets = new ArrayList<Pet>();
				for(Pet pet: Pet.pets) {
					if(pet.getBreed().equals(a.getBreed())) {
						matchingPets.add(pet);
					}
				}
				return matchingPets;
			}
		};
		
		PetMatcher priceMatcher = new PetMatcher() {

			@Override
			public List<Pet> matchPet(Pet a) {
				List<Pet> matchingPets = new ArrayList<Pet>();
				for(Pet pet: Pet.pets) {
					if(pet.getPrice()<=a.getPrice()) {
						matchingPets.add(pet);
					}
				}
				return matchingPets;
			}
			
			@Override
			public Pet firstPet(Pet p) {
				for(Pet pet:Pet.pets) {
					if(pet.getPrice()<=p.getPrice()) {
						return pet;
					}
				}
				return null;
			}
		};
		
		PetMatcher colorMatcher = new PetMatcher() {
			
			@Override
			public List<Pet>matchPet(Pet p){
				List<Pet>matchingPets = new ArrayList<Pet>();
				for(Pet pet: Pet.pets) {
					if(pet.getColor().equals(p.getColor())) {
						matchingPets.add(pet);
					}
				}
				return matchingPets;
			}
			
			@Override
			public Pet firstPet(Pet p) {
				for(Pet pet:Pet.pets) {
					if(pet.getColor().equals(p.getColor())){
						return pet;
					}
				}
				return null;
			}
		};
		
		matchPetsFromTheList("Poodles",breedMatcher, new Pet(null, "dog", "poodle", null, 0.0));
		matchPetsFromTheList("\nPets for $700 or less",priceMatcher, new Pet(null, null, null, null, 700.0));
		matchPetsFromTheList("\n\nPets that are white",colorMatcher, new Pet(null, null, null, "white", 0.0));
	}
	
	public static void matchPetsFromTheList(String crit, PetMatcher matcher, Pet myPet) {
		System.out.printf("%S\n", crit);
		System.out.printf("First: %S\n\n", matcher.firstPet(myPet));

		System.out.printf("All Matches:\n");
		List<Pet> matches = new ArrayList<Pet>();
		matches = matcher.matchPet(myPet);
		for(int i=0;i<matches.size();i++) {
			System.out.printf("%S\n",matches.get(i));
		}
		
		
	}

}
