package D8;

public class Inherit
 {

	  // field and method of the parent class
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Inherit
	class Dog extends Inherit {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	class Main {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dog a = new Dog();

	    // access field of superclass
	    a.name = "Rahul";
	    a.display();

	    // call method of superclass
	    // using object of subclass
	    a.eat();

	  }
	}