/**
 * Created by branden on 2/22/16 at 09:46.
 */
public class AnonClassExample {

    public static void main(String[] args) {

       //anon class that is extending Reptile
        Reptile ali = new Reptile() {
            @Override
            public void makeSound() {
                System.out.println("Croak");
            }
        };
        ali.name = "Alligator";

        ali.makeSound();


    }


}