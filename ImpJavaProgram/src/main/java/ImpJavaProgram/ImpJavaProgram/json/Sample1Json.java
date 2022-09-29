package ImpJavaProgram.ImpJavaProgram.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Sample1Json {
	
	public static String currentDir = System.getProperty("user.dir");

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fileReader = new FileReader(currentDir + "/jsonFile/sample1Generated.json");
		
		JSONObject object = new JSONObject(fileReader);
//		Object errormess = object.get("errorMessage");
//		String errorMessage = (String) errormess;
		System.out.println("errorMessage : " + object);
		
		JsonParser parser = new JsonParser();
		JsonElement response = parser.parse(fileReader);
//		JSONArray jsonArray = (JSONArray) response.get("error");
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
