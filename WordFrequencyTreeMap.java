import java.util.TreeMap;

public class WordFrequencyTreeMap {

    public static void main(String[] args) {

        String text = "java is easy and java is powerful";
        String[] words = text.split(" ");

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println(wordCount);
    }
}
