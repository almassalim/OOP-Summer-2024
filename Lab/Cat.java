package lab5;

public class Cat extends Animal{
	public Cat() {}
	public Cat(String name) {
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
        Cat cat = (Cat) obj;
        return name.equals(cat.name);
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
		System.out.println("Meaw");
	}
}
