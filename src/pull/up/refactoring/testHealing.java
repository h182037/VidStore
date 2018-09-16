package pull.up.refactoring;

import static org.junit.jupiter.api.Assertions.*;
import pull.up.before.Paladin2;
import org.junit.jupiter.api.Test;

public class testHealing {
	
	@Test
	public void testHealingMethodBeforeRefactoring() {
		
		
		Paladin2 paladin2 = new Paladin2();
		paladin2.healing();
		assertEquals(150, paladin2.getHealth());
		
		
	}
	
	@Test
	public void testHealingMethodAfterRefactoring() {
		Paladin paladin = new Paladin();
		paladin.healing();
		assertEquals(150, paladin.getHealth());
	
		
		
	}
}
	
	
