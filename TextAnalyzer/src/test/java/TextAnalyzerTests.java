import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.krypto.TextAnalyzer;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class TextAnalyzerTests {

    @Test
    public void testCountWords() throws IOException {
        TextAnalyzer testta = new TextAnalyzer("jakis maly tekst tu jest");
        Assertions.assertEquals(5,testta.countWords());
    }

    @Test
    public void testCountSentences() throws IOException {
        TextAnalyzer testta = new TextAnalyzer("The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings. The order of a map is defined as the order in which the iterators on the map's collection views return their elements. Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not. ");
        Assertions.assertEquals(3,testta.countSentences());
    }


    @Test
    public void testTop() throws IOException {
        TextAnalyzer testta = new TextAnalyzer(" dzik czlowiek kot kot czlowiek kot, pies kot czlowiek dzik");
        Map<String,Integer> expected = new LinkedHashMap<>();
        expected.put("dzik", 2);
        expected.put("czlowiek", 3);
        expected.put("kot", 4);

        Map<String, Integer> result = testta.topWords(" dzik czlowiek kot kot czlowiek kot, pies kot czlowiek dzik",3);
        Assertions.assertEquals(expected,result);
    }

}
