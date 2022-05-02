import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
	@Test
	public void firstChar(){
		assertEquals('c',SkillDemo.firstChar("Charmander"));
	}
}