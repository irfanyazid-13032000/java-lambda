package programmer.lutung.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
//        Predicate<String> -> String adalah data untuk parameter. return dari function adalah boolean primitibe
        Predicate<String> prediksi = (String name) -> name.isBlank();


        System.out.println(prediksi.test(""));
    }
}
