package ImpJavaProgram.ImpJavaProgram.json;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> dataValues = new HashMap<String, String>();
		
		dataValues.put("Name", "manish");
		dataValues.put("Sector", "IT");
		dataValues.put("Job", "Automation Engineer");
		System.out.println(dataValues.get("Name"));

	}

}
