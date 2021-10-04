import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterNumberResource {

    public Map<String, List<String>> getResource() {
        Map<String, List<String>> resourceMap = new HashMap<>();

        List<String> abc = new ArrayList<>();
        List<String> def = new ArrayList<>();
        List<String> ghi = new ArrayList<>();
        List<String> jkl = new ArrayList<>();
        List<String> mno = new ArrayList<>();
        List<String> pqrs = new ArrayList<>();
        List<String> tuv = new ArrayList<>();
        List<String> wxyz = new ArrayList<>();

        abc.add("a");
        abc.add("b");
        abc.add("c");

        def.add("d");
        def.add("e");
        def.add("f");

        ghi.add("j");
        ghi.add("h");
        ghi.add("i");

        jkl.add("j");
        jkl.add("k");
        jkl.add("l");

        mno.add("m");
        mno.add("n");
        mno.add("o");

        pqrs.add("p");
        pqrs.add("q");
        pqrs.add("r");
        pqrs.add("s");

        tuv.add("t");
        tuv.add("u");
        tuv.add("v");

        wxyz.add("w");
        wxyz.add("x");
        wxyz.add("y");
        wxyz.add("z");

        resourceMap.put("2", abc);
        resourceMap.put("3", def);
        resourceMap.put("4", ghi);
        resourceMap.put("5", jkl);
        resourceMap.put("6", mno);
        resourceMap.put("7", pqrs);
        resourceMap.put("8", tuv);
        resourceMap.put("9", wxyz);

        return resourceMap;
    }

}
