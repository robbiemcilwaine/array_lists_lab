import java.util.ArrayList;

public class ListPlayground {
    public static void main(String[] args) {

        ArrayList<String> trainers = new ArrayList<>();

        trainers.add("Colin");
        trainers.add("Zsolt");
        trainers.add("Thibyaa");
        trainers.add("Anna");

        // retrieve index - indexOf();
        String firstTrainer = trainers.get(0);
        trainers.remove(0);
        trainers.remove("Zsolt");

        System.out.println(trainers.size());

    }
}
