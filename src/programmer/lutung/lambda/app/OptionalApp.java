package programmer.lutung.lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello(null);

        System.out.println("==========================");

        sayHello("yajed");
    }

    public static void sayHello(String name){
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("hello " + name));
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("Hello " + upperName);

    }
}
