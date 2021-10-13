import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class AnalyzerStaticResource {


    public List<String> getListOfLetterCombinations(String digits) {


        List<String> letterCombinationsList = new ArrayList<>();

        if (digits.length() == 0) {
            return letterCombinationsList;
        }

        final Map<String, String> RESOURCE_MAP = new HashMap<>() {{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};

        letterCombinationsList.add("");
        for (char digit : digits.toCharArray()) {
            List<String> actualCombinations = new ArrayList<>();
            for (char letter : RESOURCE_MAP.get(String.valueOf(digit)).toCharArray()) {
                List<String> actualLetterCombinations = letterCombinationsList.stream()
                        .map(prevCombinationLetter -> prevCombinationLetter + letter)
                        .collect(Collectors.toList());
                actualCombinations.addAll(actualLetterCombinations);
            }
            letterCombinationsList.clear();
            letterCombinationsList.addAll(actualCombinations);
        }

        return letterCombinationsList;
    }

    public static void main(String[] args) {
        AnalyzerStaticResource analyzerStaticResource = new AnalyzerStaticResource();
        System.out.println(analyzerStaticResource.getListOfLetterCombinations("234"));

    }

}