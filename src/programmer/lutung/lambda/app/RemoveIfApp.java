package programmer.lutung.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> newjeans = new ArrayList<>();
        newjeans.addAll(List.of("hanni","haerin","hyein","danielle","minji"));


//        remove if menggunakan anonymous class
        newjeans.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

//        lambda
        newjeans.removeIf(member -> member.length() > 5);

        System.out.println(newjeans);


    }
}
