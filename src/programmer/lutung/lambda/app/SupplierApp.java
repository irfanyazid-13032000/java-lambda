package programmer.lutung.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {


        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "yajed gemoy";
            }
        };

        System.out.println(supplier.get());

        Supplier<String> penyuplay = () -> "emang boleh se gemoy ini?";


    }




}
