package ImpJavaProgram.ImpJavaProgram.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class ConvertString2Json {
	public static void main(String[] args) {
		String str = "[{\"No\":\"17\",\"Name\":\"Andrew\"},{\"No\":\"18\",\"Name\":\"Peter\"}, {\"No\":\"19\",\"Name\":\"Tom\"}]";
//		String str[] = [{\"No\":\"17\",\"Name\":\"Andrew\"},{\"No\":\"18\",\"Name\":\"Peter\"}, {\"No\":\"19\",\"Name\":\"Tom\"}];
		JSONArray array = new JSONArray(str);
		for(int i=0; i<str.length(); i++) {
			JSONObject object = array.getJSONObject(i);
//					System.out.println("Object : "+ object);
					System.out.println(object.get("No"));
					System.out.println(object.get("Name"));
		}
		
		
	}

}
