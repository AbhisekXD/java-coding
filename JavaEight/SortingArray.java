import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SortingArray {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,233,5,7,1,5,7,5,4,4454,64,3);
        List<Integer> sortedAscending = nums.stream()
                                     .sorted()
                                     .collect(Collectors.toList());
        System.out.println("Ascending order :- "+sortedAscending);

        List<Integer> sortedDescending = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Descending order :- "+sortedDescending);
        sortedDescending.forEach(s-> System.out.println(s));
    }
}
