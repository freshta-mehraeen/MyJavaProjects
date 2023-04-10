package abstraction;

public class Cat extends Animal implements SpecialBehavior{

	@Override
	public void eats() {
		System.out.println("A cat eats 1 KG of food daily");
		
	}

	@Override
	public void sleeps() {
		System.out.println("A cat sleeps for 14 hours daily");
		
	}

	@Override
	public void runs() {
		System.out.println("A cat can run a maximum speed of 30KmPH");
		
	} 
	
	public void pet() {
		System.out.println("Cats are funny pets");
	}

}
