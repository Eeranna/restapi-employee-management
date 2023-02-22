package corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    private static Set<Integer> findDuplicates(List<Integer> integerList) {
        Set<Integer> set = new HashSet<>();
        return integerList.stream()
                .filter(e -> !set.add(e))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,3,8,3,9,8,7,11,3,4,7,18,6);
        Set<Integer> duplicates = findDuplicates(integerList);
        System.out.println("Duplicates :" +duplicates);
    }
}
