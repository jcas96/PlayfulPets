import java.util.List;

public interface PetMatcher {
	List<Pet> matchPet(Pet a);
	
	default Pet firstPet(Pet p) {
		int pIndex =Pet.pets.indexOf(p);
		if(pIndex<0) {
			return null;	
		}
		else {
			return Pet.pets.get(pIndex);
		}	
	}
	

}
