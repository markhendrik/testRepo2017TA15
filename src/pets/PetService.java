package pets;

import java.util.ArrayList;
import java.util.List;

public class PetService {

	private List<Relationship> entries = new ArrayList<Relationship>();
	
	public void addPetToOwner(Pet pet, Owner owner) {
		Relationship entry = new Relationship(pet, owner);
		entries.add(entry);
	}
	
	public List<Pet> getOwnerPets(Owner owner) {
		List<Pet> pets = new ArrayList<>();
		for (Relationship relationship : entries) {
			if (relationship.owner.name.equals(owner.name)) {
				pets.add(relationship.pet);
			}
		}
		return pets;
	}
	
}
