import java.util.function.Function;

public class SquareOfaNumByLambda {
    public static void main(String[] args) {
        Function<Integer,Integer> num = n->n*n;
        System.out.println(num.apply(8));
    }
}
