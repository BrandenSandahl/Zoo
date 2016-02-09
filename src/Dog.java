/**
 * Created by branden on 2/9/16 at 10:35.
 */
public class Dog extends Mammal {

    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }


}