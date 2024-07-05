package lab5;

public class Main {

	public static void main(String[] args) {
	    Animal cat = new Cat("Markiz");
		Animal dog = new Dog("Baron");
		AnimalList an = new AnimalArrayList( );
		an.add(cat);
		an.add(dog);
		
		System.out.println(an);
		System.out.println(an.size());
		System.out.println("Second animal is " + an.get(1));
		
		Dog newDog = new Dog("Rex");
		
		an.set(1, newDog); 
		
		for(int i = 0; i < an.size(); i++) {
			Animal curAnimal = an.get(i);
			System.out.print("Animal " + curAnimal.getName() + " says ");
			curAnimal.sound();
		}
		
		an.clear();
	}

}