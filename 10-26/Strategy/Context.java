package Strategy;
public class Context {
    public static void main(String[] args) {
        // Dog says
        AnimalSound dog = new DogSound();
        dog.makeSound();

        // Cat says
        AnimalSound cat = new CatSound();
        cat.makeSound();

        // Duck says
        AnimalSound duck = new DuckSound();
        duck.makeSound();
    }
}
