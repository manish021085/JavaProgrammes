package ImpJavaProgram.ImpJavaProgram.json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.parser.JSONParser;
//import java.io.File;
//import java.io.IOException;
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
import net.minidev.json.parser.ParseException;

public class JsonWriter {
	public static String currentDir = System.getProperty("user.dir");

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {

		//Country is a different class in this package
		Country countryObj = new Country();
		countryObj.country = "India";
		countryObj.id = 003;
		countryObj.firstName = "Manish";
		countryObj.lastName = "Kumar";
		countryObj.dateBirth = "10/08/85";
		countryObj.placeBirth = "Firozabad";
		countryObj.sector = "IT";
		countryObj.job = "Automation Engineer";
		countryObj.language = "Java";
		countryObj.population = 1000000;

		List<String> listOfStates = new ArrayList<String>();
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Maharastra");
		listOfStates.add("Rajasthan");

		countryObj.states = listOfStates;
		ObjectMapper mapper = new ObjectMapper();

		// Writing to a file
		mapper.writeValue(new File(currentDir + "/jsonFile/b.json"), countryObj);
		System.out.println("file is downloaded.....");

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser
				.parse(new FileReader(currentDir + "/jsonFile/a.json"));

		String country = (String) jsonObject.get("country");
		Integer id = (Integer) jsonObject.get("id");
		String firstName = (String) jsonObject.get("firstName");
		String lastName = (String) jsonObject.get("lastName");
		String dateBirth = (String) jsonObject.get("dateBirth");
		String placeBirth = (String) jsonObject.get("placeBirth");
		// Forming URL
		System.out.println("Contents of the JSON are: ");
		System.out.println("ID :" + id);
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Date of birth: " + dateBirth);
		System.out.println("Place of birth: " + placeBirth);
		System.out.println("Country: " + country);

	}
}