package programmer.lutung.lambda.app;

import programmer.lutung.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Yajed";
//            }
//        };
//
//        System.out.println(simpleAction1.action("yajed"));
//
//        SimpleAction simpleAction2 = (String name)->{
//            return "simpel action";
//        };
//
//        System.out.println(simpleAction2.action("yajed"));

        SimpleAction simpleAction1 = (String name) -> "hello " + name;;

        SimpleAction simpleAction2 = name -> {
          return "halo " + name;
        };

    }
}
