import Recursive.Thripstep;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RecursiveTest {
    Thripstep thripstep = new Thripstep();
    @Test
    public void 트리플스텝테스트(){
        assertThat(thripstep.countWay(4),is(7));
    }
}
