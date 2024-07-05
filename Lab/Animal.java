package lab5;

public class Animal {
    public String name;

    public Animal() {
        this.name = "Unknown";
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }

    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result;
        return result;
    }

    public String toString() {
        return "{name= " + name + '}';
    }

	public void sound() {
		
	}
}