package pets;

public class App {

	public static void main(String[] args) {
		PetService service = new PetService();
		Owner owner = new Owner("Mati");
		Pet pet = new Pet("Muki");
		Pet pet2 = new Pet("Muri");
		service.addPetToOwner(pet, owner);
		service.addPetToOwner(pet2, owner);
		System.out.println(service.getOwnerPets(owner));
	}

}
