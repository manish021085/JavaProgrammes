package ImpJavaProgram.ImpJavaProgram.ipAddress;

import java.util.regex.Pattern;

public class IpAddressValidation {

	public static void main(String[] args) {
//		   127.0.0.1
		  System.out.println(IpAddressValidation.isValidIpManually("255.0.0.1"));
		  System.out.println(IpAddressValidation.isValidIp("255.0.0.1"));
		  
		 }

	public static boolean isValidIp(String ipAddress) {

		if (ipAddress == null || ipAddress.isEmpty()) {
			return false;
		}

		// 0 to 255
		String digitRegEx = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

		String ipRegEx = digitRegEx + "\\." + digitRegEx + "\\." + digitRegEx + "\\." + digitRegEx;

		Pattern pattern = Pattern.compile(ipRegEx);

		return pattern.matcher(ipAddress).matches();
	}

	public static boolean isValidIpManually(String ipAddress) {

		if (ipAddress == null || ipAddress.isEmpty()) {
			return false;
		}

		String[] strArray = ipAddress.split("\\.");

		if (strArray.length != 4) {
			return false;
		}

		for (String str : strArray) {
			try {
				Integer num = Integer.valueOf(str);

				if (num > 255) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
}
