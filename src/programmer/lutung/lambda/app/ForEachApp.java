package programmer.lutung.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> newjeans = List.of("hanni","haerin","hyein","minji","danielle");

//        foreach anonymous class
        newjeans.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        System.out.println("======================================================");

//        foreach lambda
        newjeans.forEach(member -> System.out.println(member));

        System.out.println("======================================================");

        newjeans.forEach(System.out::println);

    }
}
