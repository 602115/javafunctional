package finalsection;

import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] args) {
/*        Function<String, String> upperCaseName = name -> {
          if(name.isBlank()) throw new IllegalArgumentException("");
          return name.toUpperCase();
        };*/
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank())
                throw new IllegalArgumentException("");
            //hust to show how to use it, there is no value in this line of code
            System.out.println(age);
            //
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply("truls", null));
    }
}
