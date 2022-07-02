import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tools {

    public static int power = 500;


    public static void main(String[] args) {
        List<String> powerTools = new ArrayList();
        powerTools.add("Hammer");
        powerTools.add("Scissors");
        powerTools.add("Patent");
        powerTools.add("surub");

        powerTools.forEach(item -> {

            System.out.println("Vlad " + item);

        });

        for (int index = 0; index < powerTools.size(); index++) {
            System.out.println("Ana" + powerTools.get(index));
        }

        for (String item : powerTools) {

            if (item.startsWith("H")) {
                System.out.println("Only H tools: " + item);

            }

            if (item.endsWith("s")) {
                System.out.println("Only S end tools" + item);
            }
//            System.out.println("Alex " + item);
        }
        Map myMap = new HashMap<>();
        myMap.put(10, "Hammer");
        myMap.put(14, "Vlad");
        myMap.put(22, "Ana");
        if (!myMap.isEmpty()) {
            System.out.println("folder plin cu 3 valori");


        }
        if (myMap.containsKey(22)) {
            System.out.println("folder plin");
        }

        for (int i = 1; i < 11; i++) {
            if (i % 3 == 1) {
                System.out.println(i);
            }
        }

        String[] mylist = {"Alex", "Diana", "Vlad"};
        // 0      1       2


        for (String item : powerTools) {
            if (item.equals("surub")) {

                System.out.println("Piulita");
            } else {
                System.out.println(item);
            }

        }


        int[] numbers = {2, 5, 7, 9, 10, 6, 3, 1};


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println(numbers[i]);
                break;
            }


        }
        String[] consoane = {"b", "c", "d", "f", "g"};
        String[] vocale = {"a", "e", "i", "o", "u"};
        printVocale(vocale);
        printVocale(consoane);
    }

    private static void printVocale(String[] vocale) {
        for (int index = 0; index < vocale.length; index++) {
            if (index == 0 || index == vocale.length - 1) {
                System.out.println(vocale[index].toUpperCase());
            } else {
                System.out.println(vocale[index]);
            }
        }


    }
}
