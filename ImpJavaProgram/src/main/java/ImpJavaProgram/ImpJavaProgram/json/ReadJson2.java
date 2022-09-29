package ImpJavaProgram.ImpJavaProgram.json;

import org.json.JSONObject;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ReadJson2 {
	
	
	public static void main(String[] args) {
		
		String valueSlack;
		
		
		String jsonFile = "{\n"
				+ "	\"slack\": {\n"
				+ "		\"ok\": true,\n"
				+ "		\"channels\": [{\n"
				+ "			\"id\": \"CBXQ2PUBT\",\n"
				+ "			\"name\": \"general\",\n"
				+ "			\"topic\": {\n"
				+ "				\"value\": \"topic value 1\",\n"
				+ "				\"creator\": \"UBXKC3GGY\",\n"
				+ "				\"last_set\": 1532709785\n"
				+ "			},\n"
				+ "			\"purpose\": {\n"
				+ "				\"value\": \"purpose value 1\",\n"
				+ "				\"creator\": \"UBXKC3GGY\",\n"
				+ "				\"last_set\": 1532709785\n"
				+ "			},\n"
				+ "			\"previous_names\": [],\n"
				+ "			\"num_members\": 13\n"
				+ "		}, {\n"
				+ "			\"id\": \"CBYB017BL\",\n"
				+ "			\"name\": \"random\",\n"
				+ "			\"topic\": {\n"
				+ "				\"value\": \"topic value 2\",\n"
				+ "				\"creator\": \"UBXKC3GGY\",\n"
				+ "				\"last_set\": 1532709785\n"
				+ "			},\n"
				+ "			\"purpose\": {\n"
				+ "				\"value\": \"purpose value 2\",\n"
				+ "				\"creator\": \"UBXKC3GGY\",\n"
				+ "				\"last_set\": 1532709785\n"
				+ "			},\n"
				+ "			\"previous_names\": [],\n"
				+ "			\"num_members\": 10\n"
				+ "		}]\n"
				+ "	}\n"
				+ "}";
		
//		System.out.println("String json response : -> " + jsonFile ); 
		//convert Json
		JSONObject jsonResponse = new JSONObject(jsonFile);
//		System.out.println("The response from responseJson is -> " + jsonResponse);
		Object slackValue = jsonResponse.get("slack");
		valueSlack = (String) slackValue;
		System.out.println("valueSlack : -> " + slackValue);
		JsonParser parser = new JsonParser();
		JsonElement jsonParserResponse = parser.parse(valueSlack);
		JsonElement element0 = jsonParserResponse.getAsJsonArray().get(0);
		System.out.println("element0 : -> "+element0);
	}
}
