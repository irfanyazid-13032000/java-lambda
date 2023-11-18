package programmer.lutung.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
//        Function<Parameter yg dikirim, return dari function>
        Function<String,Integer> functionLength = value -> value.length();

        System.out.println(functionLength.apply("yajed dan teman nya sedang stress karena tidak bisa mengerjakan tugas dengan sempurna"));

    }
}
