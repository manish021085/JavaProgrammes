package ImpJavaProgram.ImpJavaProgram.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
//https://mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
public class ReadJsonFile {
	public static String currentDir = System.getProperty("user.dir");
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		Gson gson = new Gson();
		JsonElement json = gson.fromJson(new FileReader(currentDir + "/jsonFile/test.json"), JsonElement.class);
		String result = gson.toJson(json);
		System.out.println("Result : -> " + result);
		
		JsonParser parser = new JsonParser();
		JsonElement json1 = parser.parse(result);
		
		
		
		
		
		

	}

}
