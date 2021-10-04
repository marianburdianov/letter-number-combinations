import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Operations {

    public List getSelectedListDependingOnEntryDigits(Map<String, List<String>> map, String digits) {

        List<List<String>> selectedList = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (String.valueOf(digits.charAt(i)).equals(entry.getKey())) {

                    selectedList.add(entry.getValue());
                }
            }
        }

        return selectedList;
    }
}
