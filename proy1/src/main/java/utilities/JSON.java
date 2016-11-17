package utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {

	public static String generateJSON(Object o) throws JsonProcessingException{
		String result;
		ObjectMapper mapper = new ObjectMapper();

		//Object to JSON in String
		result = mapper.writeValueAsString(o);
		
		return result;
	}
}
