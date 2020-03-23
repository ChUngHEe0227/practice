import StringAndArray.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class StringAndArrayTest {
    StringCompressionExample stringCompressionExample = new StringCompressionExample();
    SameUnionArray sameUnionArray = new SameUnionArray();
    palindrome Palindrome = new palindrome();
    MakeUrl makeUrl = new MakeUrl();
    modificationExample modificationExample = new modificationExample();
    DuplicateStringExample duplicateStringExample = new DuplicateStringExample();
    @Test
    public void 중복된_문자가_들어왔는지_확인하는테스트() {
        assertFalse(duplicateStringExample.CheckDuplicateString("12325"));
        assertTrue(duplicateStringExample.CheckDuplicateString("1235"));
    }
    @Test
    public void 단어압축기테스트(){
        assertEquals("a3b3c3d1e1",stringCompressionExample.StringCompression("aaabbbcccde"));
        assertEquals("abcde",stringCompressionExample.StringCompression("abcde"));
    }
    @Test
    public void 순열여부확인테스트(){
        assertTrue(sameUnionArray.SameUnionArraycheck("dog", "god"));
    }

    @Test
    public void 회문순열여부확인(){
        assertSame(true,Palindrome.palindromeCheck("tactcoa"));
    }

    @Test
    public void 한글자만바꿔서수정가능한지여부확인하기(){
        assertFalse( modificationExample.Change_check_Test("appl".toCharArray(),"aplw".toCharArray()));
        assertFalse( modificationExample.modification_Check("applqqq","aplw"));
        assertTrue( modificationExample.modification_Check("aplwe","aplw"));
        assertTrue( modificationExample.modification_Check("apw","aplw"));
        assertTrue( modificationExample.modification_Check("aplw","aplw"));
        assertTrue( modificationExample.modification_Check("aplw","aplww"));
    }
    @Test
    public void url테스트(){
        String value = new String(makeUrl.changeUrl("he is a boy".toCharArray()));
        assertThat(value,is("he%20is%20a%20boy"));
    }

}
