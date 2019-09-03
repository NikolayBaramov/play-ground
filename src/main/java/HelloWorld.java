import java.io.PrintStream;

public class HelloWorld {
    public static void main(String[] args) {
        print(System.out);

        SimpleTry simpleTry = new SimpleTry("Baramov",28);
        String result = String.format("My name is %s and I am %d years old.", simpleTry.getName(), simpleTry.getAge());

        System.out.println(result);

    }

    public static void print(PrintStream out) {
        out.println("Hello, World!");
    }


}