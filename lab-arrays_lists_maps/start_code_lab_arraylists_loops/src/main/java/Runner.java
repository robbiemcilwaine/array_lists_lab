import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        System.out.println(scottishIslands.indexOf("Arran"));
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        Collections.sort(numbers);
        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (Integer number: numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
//        2. Print the difference between the largest and smallest value
        System.out.println(numbers.get(numbers.size()-1) - numbers.get(0));
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (Integer number: numbers) {
            if ((number == 1) && (numbers.get(number + 1) == 1)) {
                System.out.println("True");
                break;
            }
        }
//        4. Print the sum of the numbers,
        int sumOfNumbers = 0;
        for (Integer number: numbers) {
            sumOfNumbers += number;
        }
        System.out.println(sumOfNumbers);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
        int luckySumOfNumbers = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 13) {
                i++;
                continue;
            }
            luckySumOfNumbers += numbers.get(i);
        }
        System.out.println(luckySumOfNumbers);
//
//          So [2, 7, 13, 2] would have sum of 9.
    }

}
