import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");

        // Enhanced for loop
//        for (String colour: colours) {
//            System.out.println(colour.toUpperCase());
//        }

        List<String> filteredColours = new ArrayList<>();

        // ENHANCED FOR LOOP
        for(String colour: colours) {
            if (colour.charAt(0) == 'B') {
                filteredColours.add(colour);
            }
        }

        System.out.println(filteredColours);

        // CLASSIC FOR LOOP

        // int i = 0;
        // increment
//        System.out.println(i++);
//        System.out.println(i--);

        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));
        }
        List<Integer> numbers = new ArrayList<>();

        for(int i = 10; i > 0; i--) {
            if (i == 4) {
                continue;
            }
            numbers.add(i);
        }

        // break - break out of the loop
        // continue - skip the rest of the code
        System.out.println(numbers);
    }
}












