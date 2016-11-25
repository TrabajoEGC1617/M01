package testing;

import org.junit.Test;

import domain.Car;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

public class RandomTest {
	
	//Libreria random-beans
	@Test
	public void test(){
		EnhancedRandom enhancedRandom = EnhancedRandomBuilder.aNewEnhancedRandomBuilder().build();
		Car car = enhancedRandom.nextObject(Car.class);
		System.out.println(car.getBrand());
		
	}
	
	
	
}
