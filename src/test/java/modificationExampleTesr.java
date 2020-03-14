import org.junit.Test;
import StringAndArray.modificationExample;

import static org.junit.Assert.*;

public class modificationExampleTesr {
    modificationExample modificationExample = new modificationExample();

    @Test
    public void 한글자만바꿔서수정가능한지여부확인하기(){
        assertFalse( modificationExample.Change_check_Test("appl".toCharArray(),"aplw".toCharArray()));
        assertFalse( modificationExample.modification_Check("applqqq","aplw"));
        assertTrue( modificationExample.modification_Check("aplwe","aplw"));
        assertTrue( modificationExample.modification_Check("apw","aplw"));
        assertTrue( modificationExample.modification_Check("aplw","aplw"));
        assertTrue( modificationExample.modification_Check("aplw","aplww"));
    }
}
