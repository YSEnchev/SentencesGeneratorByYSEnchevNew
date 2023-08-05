import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Peter", "Michell", "Jane", "Steve"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};

        System.out.println("Hello, this is your first random-generated sentence: ");

        while (true) {
            String randomName = getRandomWord(names);
            String randomPlaces = getRandomPlaces(places);
            String randomVerbs = getRandomVerbs(verbs);
            String randomNouns = getRandomNouns(nouns);
            String randomAdverbs = getRandomAdverbs(adverbs);
            String randomDetails = getRandomDetails(details);


            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlaces, randomVerbs,
                    randomNouns, randomAdverbs, randomDetails);
            System.out.println("Click [Enter] to generate a new one");

            break;
            
        }

    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }

    public static String getRandomPlaces(String[] words) {
        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }

    public static String getRandomVerbs(String[] words) {
        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }

    public static String getRandomNouns(String[] words) {
        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }

    public static String getRandomAdverbs(String[] words) {
        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }

    public static String getRandomDetails(String[] words) {
        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;
    }
}
