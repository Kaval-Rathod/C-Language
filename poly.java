public class Poly {
    public void animalSound() {
        System.out.println("The animal makes sound");
    }
}

class Pig extends Poly {
    @Override
    public void animalSound() {
        System.out.println("Pig says: piiipiii...");
    }
}

class Dog extends Poly {
    @Override
    public void animalSound() {
        System.out.println("Dog says: Bhow Boww.....");
    }
}

public class Main {
    public static void main(String[] args) {
        Poly myAnimal = new Poly();
        Poly myDog = new Dog();
        Poly myPig = new Pig();
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}
