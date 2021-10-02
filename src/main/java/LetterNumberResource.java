import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LetterNumberResource {

    public Map<String, Set<String>> getResource() {
        Map<String, Set<String>> resourceMap = new HashMap<>();

        Set<String> abc = new HashSet<>();
        Set<String> def = new HashSet<>();
        Set<String> ghi = new HashSet<>();
        Set<String> jkl = new HashSet<>();
        Set<String> mno = new HashSet<>();
        Set<String> pqrs = new HashSet<>();
        Set<String> tuv = new HashSet<>();
        Set<String> wxyz = new HashSet<>();

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
