package programmer.lutung.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(60,() -> getName());
    }

    public static void testScore(Integer score, Supplier<String> name){
        if (score > 80){
            System.out.println("selamat " + name.get() + " kamu lulus");
        }else {
            System.out.println("coba lagi tahun depan");
        }
    }

    public static String getName(){
        System.out.println("function getName() dipanggil");
        return "Yajed";
    }

}
