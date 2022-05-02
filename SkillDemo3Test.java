import static org.junit.Assert.*;
import org.junit.*;
import java.beans.Transient;

public class SkillDemo3Test {
    @Test
    public void multiply(){
        assertEquals(12,SkillDemo3.multiply(3, 4));
    }
}
