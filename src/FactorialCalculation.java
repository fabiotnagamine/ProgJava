import java.util.stream.LongStream;

public class FactorialCalculation {

    public static void main(String[] args){
        final long iteration = 50L;

        final long result = LongStream.iterate(1, n -> n + 1 ).limit(iteration)
                .reduce(1,(a,b) -> a * b);

        System.out.println("Factorial result = " + result);
    }

}
