import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionalex {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin" , "Laxmi" , "Abhi");
        Optional<String> name = names.stream()
                                    .filter(str -> str.contains("x"))
                                    .findFirst();
        
        String name1 = names.stream()
                            .filter(str -> str.contains("i"))
                            .findFirst()
                            .orElse("Not found");                 // we can also use this syntax
        System.out.println(name.orElse("Not found"));
        System.out.println(name1);
    }
}
