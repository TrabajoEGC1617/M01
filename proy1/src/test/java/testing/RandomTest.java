package testing;

import org.junit.Test;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

public class RandomTest {
	
	//Libreria random-beans
	@Test
	public void test(){
		EnhancedRandom random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder().build();
		System.out.println(random.nextInt());
	}
	
	
	
}
