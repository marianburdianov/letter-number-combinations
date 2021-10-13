public class Test {
    public static void main(String[] args) {
        LetterNumberResource letterNumberResource = new LetterNumberResource();
        Operations operations = new Operations();
        letterNumberResource.getResource();

        String digits = "89";

        ResourceAnalyzer resourceAnalyzer = new ResourceAnalyzer(letterNumberResource, operations, digits);
        System.out.println(resourceAnalyzer.getListOfLetterCombinations());
        resourceAnalyzer.getListOfLetterCombinations();
    }
}
