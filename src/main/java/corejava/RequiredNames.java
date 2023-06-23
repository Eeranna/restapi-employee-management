package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RequiredNames {

    public static void main(String[] args) {

        String[] names = {"Eeranna","Tejas","Geetha","Charith","Mounika","Charan"};
        Predicate<String> p = s -> s.charAt(0) == 'C';
        List<String> requiredNames = Arrays.asList(names)
                .stream().filter(p).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(requiredNames);
    }
}
