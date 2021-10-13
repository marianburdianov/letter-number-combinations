import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.lenient;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class ResourceAnalyzerTest {

    @Mock
    private LetterNumberResource letterNumberResource;
    @Mock
    private Operations operations;

    @InjectMocks
    private ResourceAnalyzer resourceAnalyzer;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        String digits = "23";
        resourceAnalyzer = new ResourceAnalyzer(letterNumberResource, operations, digits);
    }

    @Test
    void getListTest() {

        Map<String, List<String>> resourceMap = new HashMap<>();

        List<String> abc = new ArrayList<>();
        List<String> def = new ArrayList<>();

        abc.add("a");
        abc.add("b");
        abc.add("c");

        def.add("d");
        def.add("e");
        def.add("f");

        resourceMap.put("2", abc);
        resourceMap.put("3", def);

        String digits = "23";
        when(letterNumberResource.getResource()).thenReturn(resourceMap);
//        when(operations.getSelectedListDependingOnEntryDigits(resourceMap, digits)).thenReturn(abc, def);

        List<List<String>> actualList = resourceAnalyzer.getList();

        List<List<String>> expectedList = Arrays.asList(abc, def);

        assertEquals(expectedList, actualList);
    }

    @Test
    void getListOfLetterCombinations() {
    }
}