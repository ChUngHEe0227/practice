import StringAndArray.palindrome;
import org.junit.Test;

public class palindromeTest {
    palindrome Palindrome = new palindrome();
    @Test
    public void 회문순열여부확인(){
        Palindrome.palindromeCheck("tact coa");
    }
}
