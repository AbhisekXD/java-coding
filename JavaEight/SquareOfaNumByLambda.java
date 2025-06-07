import java.util.function.Function;

public class SquareOfaNumByLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(9));
    }
}