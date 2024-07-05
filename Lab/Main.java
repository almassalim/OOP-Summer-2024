package lab6;

import lab5.*;

public class Main {

	public static void main(String[] args) {
		AnimalLinkedList animalArrayList = new AnimalLinkedList();
		Animal cat = new Cat("Markiz");
		Animal dog = new Dog("Baron");
		animalArrayList.add(cat);
		animalArrayList.add(dog);
		
        System.out.println("Second animal is " + animalArrayList.get(1));
        
        Animal newDog = new Dog("Reks");
        
        animalArrayList.set(1, newDog);
        
        for(int i = 0; i < animalArrayList.size(); i++) {
        	Animal curAnimal = animalArrayList.get(i);
        	System.out.println("Animal " + curAnimal.getName() + " says");
        	curAnimal.sound();
        }
        
        animalArrayList.clear();
       
	}

}
