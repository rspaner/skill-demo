import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtraction() {
        int difference = SkillDemo.subtract(3,4);
        assertEquals(0, difference);
    } 
  
}
