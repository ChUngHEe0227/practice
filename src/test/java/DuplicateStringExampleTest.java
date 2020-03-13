import StringAndArray.DuplicateStringExample;
import org.junit.Test;


public class DuplicateStringExampleTest {

    DuplicateStringExample duplicateStringExample = new DuplicateStringExample();

    @Test
    public void 문자열이들어왔는지확인하는테스트() {
        duplicateStringExample.CheckDuplicateString("12325");
    }

}
