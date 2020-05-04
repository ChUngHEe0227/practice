import LineCodingTest.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class first {
    first_Question first_question = new first_Question();
    @Test
    public void 테스트(){
        assertSame(2,(first_question.solution("if (Count of eggs is 4.) {Buy milk.}")));
    }
}
