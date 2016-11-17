package testing;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import domain.Car;
import domain.Power;
import utilities.JSON;

public class JSONTest {

	@Test
	public void jsonTest() throws JsonProcessingException{
		Car car = new Car();
		car.setBrand("Seat");
		car.setModel("Ibiza");
		car.setYear(1999);
		car.setHeight(1422.0);
		car.setWeight(995.0);
		car.setPower(Power.GASOLINE);
		car.setConsumption(6.4);
		car.setCv(60.0);
		car.setnDoors("3p");
		car.setPrice(11000.0);
		car.setType("Turismo");
		
		String result = JSON.generateJSON(car);
		System.out.println(result);
	}
}
