package abstraction;

public class Dog extends Animal implements SpecialBehavior{

	@Override
	public void eats() {
		System.out.println("A dog eats 2KG of food daily");
		
	}

	@Override
	public void sleeps() {
		System.out.println("A dog sleeps for 10 hours daily");
		
	}

	@Override
	public void runs() {
		System.out.println("A dog can run at a maximum speed of 40KmPH"); 
		
	} 
	
	public void pet() {
		System.out.println("Dogs are best pets");
	}

}
