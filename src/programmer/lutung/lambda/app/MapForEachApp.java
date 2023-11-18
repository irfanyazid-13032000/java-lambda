package programmer.lutung.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> biodata = new HashMap<>();
        biodata.put("name", "hanni");
        biodata.put("group", "newjeans");
        biodata.put("age", "19");

//        menggunakan for loop
        for (var entry : biodata.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getKey());
        }

        System.out.println("=================================================================");

//        menggunakan anonymous class
        biodata.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        System.out.println("===================================================================");

//        lambda
        biodata.forEach((key,value) -> System.out.println(key + " : " + value));


    }
}