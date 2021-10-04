import java.util.ArrayList;
import java.util.List;

public class ResourceAnalyzer {
    private LetterNumberResource letterNumberResource;
    private Operations operations;
    private String digits;

    public ResourceAnalyzer(LetterNumberResource letterNumberResource, Operations operations, String digits) {
        this.letterNumberResource = letterNumberResource;
        this.operations = operations;
        this.digits = digits;
    }

    public List<List<String>> getList() {
        return operations.getSelectedListDependingOnEntryDigits(letterNumberResource.getResource(), digits);
    }

    public List<String> getListOfLetterCombinations() {
        List<String> combinedList = new ArrayList<>();
        String combinedString = null;

        if (getList().size() == 0) {

            return combinedList;

        } else if (getList().size() == 1) {

            combinedList = getList().get(getList().size() - 1);

            return combinedList;
        }
        for (int i = 0; i < getList().size(); i++) {

            for (int j = 0; j < getList().get(i).size(); j++) {

                for (int k = i + 1; k < getList().size(); k++) {

                    for (int l = 0; l < getList().get(k).size(); l++) {

                        combinedString = getList().get(i).get(j) + getList().get(k).get(l);
                        combinedList.add(combinedString);
                    }
                }
            }
        }
        return combinedList;
    }
}
