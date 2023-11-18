package programmer.lutung.lambda.app;

import programmer.lutung.lambda.util.StringUtil;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

//cara pertama


//        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return StringUtil.isLowerCase(value);
//            }
//        };


//        cara kedua
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);


//        cara ketiga (isLowerCase yg ada di String Util)
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

//        method reference parameter
//        hanya manggil method yang ada di parameter
        Function<String,String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("yajed"));



    }

    public void run(){
//        jika method nya bukan static, dan berada di class yg sama (isLowerCase yg ada di class ini)
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("yajedganteng"));
    }

    public boolean isLowerCase(String value){
        for (Character karakter : value.toCharArray()){
            if (!Character.isLowerCase(karakter)){
                return false;
            }
        }
        return true;
    }

}
