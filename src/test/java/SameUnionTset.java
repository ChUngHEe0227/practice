import StringAndArray.SameUnionArray;
import org.junit.Test;

public class SameUnionTset {
    SameUnionArray sameUnionArray = new SameUnionArray();
    @Test
    public void 순열여부확인테스트(){
        sameUnionArray.SameUnionArraycheck("dog", "god");
    }
}
