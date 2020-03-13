import StringAndArray.MakeUrl;
import org.junit.Test;

public class MakeUrlTest {
    MakeUrl makeUrl = new MakeUrl();
    @Test
    public void url테스트(){
        makeUrl.changeUrl("he is a boy".toCharArray());
    }
}
