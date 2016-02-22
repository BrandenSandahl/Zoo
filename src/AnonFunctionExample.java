/**
 * Created by branden on 2/22/16 at 09:52.
 */
public class AnonFunctionExample {

    public static void main(String[] args) {
        //traditional way to run code from a sep method
        sayHello();

        //run code from anon class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anon Class");
            }
        };
        r1.run();


        //run code from anon function
        //Lambda, Java 8 only
        Runnable r2 = () -> System.out.println("hello from anon Function");
        r2.run();
    }

    static void sayHello() {
        System.out.println("Hello, World!");
    }


}