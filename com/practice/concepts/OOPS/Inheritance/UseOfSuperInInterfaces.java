//Interface with a method
interface Sound {
 void makeSound();
}

//Class implementing the interface with its own implementation of makeSound()
class Dog implements Sound {
 @Override
 public void makeSound() {
     System.out.println("Bark");
 }

 // Additional method in the class with the same name as in the interface
 void makeSound(int volume) {
     System.out.println("Bark with volume: " + volume);
 }

 // Method using super to refer to the makeSound() method from the interface
 void performInterfaceSound() {
     ((Sound) this).makeSound(); // Referring to the method from the interface
 }
}


public class UseOfSuperInInterfaces {
	public static void main(String[] args) {
	     Dog myDog = new Dog();
	     myDog.makeSound();  // Calls the overridden method in Dog class
	     myDog.makeSound(3); // Calls the additional method in Dog class

	     // Using super to call the makeSound() method from the interface
	     myDog.performInterfaceSound();
	 }
}

