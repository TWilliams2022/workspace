package HashMap;

import java.util.*;

public class WordCount {

}

class Main11{
    public static void toHashMap(String initialSentence) {
        String[] initialWordsInArray = initialSentence.toLowerCase(Locale.ROOT).split("[,?.@!#^=*]+");
        List<String> initialWords = new ArrayList<>(Arrays.asList(initialWordsInArray));

        Map<String, Integer> uniqueWordsMap = new HashMap<>();

        for (String s: initialWords) {
            int value = 0;
            if (uniqueWordsMap.containsKey(s)){
                value = uniqueWordsMap.get(s);
            }
            uniqueWordsMap.put(s, value + 1);
        }
        System.out.println(uniqueWordsMap);
    }

}