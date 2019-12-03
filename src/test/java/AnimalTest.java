import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    Dog dog = new Dog();
    Animal animal = new Animal();
    Cat cat = new Cat();

    @Test
    public void TestDogSound(){
        dog.sounds("Barks");
        assertSame("Barks","ghhgj");
    }
    @Test
    public void TestDogEats(){
    dog.eat("Food");
    assertSame("Food","food");}

    @Test
    public void TestCatSound(){
    cat.sounds("Meow");
    assertSame("Meow","meow");}

    @Test
    public void TestCatEats(){
        cat.eat("Food");
        assertSame("Food","food");
    }

}