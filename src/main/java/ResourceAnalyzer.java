import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ResourceAnalyzer {
    private LetterNumberResource letterNumberResource;
    private String digits;

    public ResourceAnalyzer(LetterNumberResource letterNumberResource, String digits) {
        this.letterNumberResource = letterNumberResource;
        this.digits = digits;
    }

    public List<String> letterCombinations() {
        letterNumberResource = new LetterNumberResource();
        letterNumberResource.getResource();

        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            for (Map.Entry<String, List<String>> entry : letterNumberResource.getResource().entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
                list.add(entry.getValue());
            }
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
        return null;
    }
}
