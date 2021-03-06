import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex3_StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> data = new ArrayList<>();
        String input = reader.readLine();
        while (!"END".equals(input)){
            data.add(input);
            input = reader.readLine();
        }
        data.stream() //input example: Andrew Carter 15
                .map(x -> x.split(" "))
                .filter(x -> Integer.parseInt(x[2]) >= 18 && Integer.parseInt(x[2]) <= 24)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
    }
}
