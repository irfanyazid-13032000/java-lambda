package programmer.lutung.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer consumer = (value) -> System.out.println(value);

        consumer.accept("yajed");

    }
}
