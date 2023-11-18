package programmer.lutung.lambda.util;

public class StringUtil {
    public static boolean isLowerCase(String value){
        for (Character karakter : value.toCharArray()){
            if (!Character.isLowerCase(karakter)){
                return false;
            }
        }
        return true;
    }
}
