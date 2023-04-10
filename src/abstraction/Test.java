package abstraction;

public class Test {
	
	public static void main(String[] args) {
		//AbstractClass object = new ChildClass(); 
		Animal leo = new Lion(); 
		leo.eats();
		leo.sleeps();
		leo.runs();
		
		//AbstractClass object = new ChildClass(); 
		Animal doggo = new Dog(); 
		doggo.eats();
		doggo.sleeps();
		doggo.runs(); 
		
		//AbstractClass object = new ChildClass(); 
		Animal kitty = new Cat(); 
		kitty.eats(); 
		kitty.sleeps();
		kitty.runs(); 
		
		//Interface object = new ImplementingClass(); 
		SpecialBehavior buzz = new Dog(); 
		buzz.pet(); 
		
		SpecialBehavior kitten = new Cat();  
		kitten.pet(); 
	}

}
