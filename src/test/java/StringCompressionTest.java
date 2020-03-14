import StringAndArray.StringCompressionExample;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCompressionTest {
    StringCompressionExample stringCompressionExample = new StringCompressionExample();
    @Test
    public void 단어압축기테스트(){
        assertEquals("a3b3c3d1e1",stringCompressionExample.StringCompression("aaabbbcccde"));
        assertEquals("abcde",stringCompressionExample.StringCompression("abcde"));
    }
}
