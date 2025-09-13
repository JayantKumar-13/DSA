import java.util.Arrays;
import java.util.List;

public class MethodRefex {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin" , "Laxmi" , "Abhi");
        List<String> name = names.stream()
                            .map(String :: toUpperCase)
                            .toList();
        System.out.println(name);
        name.forEach(System.out::println);
    }
}
