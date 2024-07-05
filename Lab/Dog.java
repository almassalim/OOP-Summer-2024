package lab5;

public class Dog extends Animal {
	public Dog() {}
	public Dog(String name) {
		super(name);
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dog dog = (Dog) obj;
        return name.equals(dog.name);
    }

    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result;
        return result;
    }

    public String toString() {
        return "(name= " + name + ')';
    }

	public void sound() {
		System.out.println("Gaf");
	}
}
