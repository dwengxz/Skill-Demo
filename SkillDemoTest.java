import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
	@Test
	public void firstChar(){
		assertEquals('C',SkillDemo.firstChar("Charmander"));
	}
} 