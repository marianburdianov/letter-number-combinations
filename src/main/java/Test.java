import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LetterNumberResource letterNumberResource = new LetterNumberResource();
        letterNumberResource.getResource();
        String digits = "234";
        ResourceAnalyzer resourceAnalyzer = new ResourceAnalyzer(letterNumberResource, digits);
        resourceAnalyzer.letterCombinations(digits);

    }
}
