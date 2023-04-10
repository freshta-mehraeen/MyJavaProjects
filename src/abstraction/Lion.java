package abstraction;

public class Lion extends Animal {

	@Override
	public void eats() {
		System.out.println("A lion eats 20kg of flesh daily.");
		
	}

	@Override
	public void sleeps() {
		System.out.println("A lion sleeps for 18 hours daily");
		
	}

	@Override
	public void runs() {
		System.out.println("A lion can run at a maximum speed of 70 KmPH");
		
	}
	
}
