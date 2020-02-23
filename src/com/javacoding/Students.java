package com.javacoding;

public class Students {
	//private static Scanner scan = new Scanner(System.in);
	static {
		System.out.println("My Google Code-in Award");
	}
	public static void main(String[] args) {
		System.out.println(helloworld());
		System.out.println("My Coding Journey will at the end yied succcess");
		//System.out.println(show());
		System.out.println();
		//		for (char ss = 'A'; ss <= 'z'; ss++) {
		//			System.out.print(ss);
		//		}
		System.out.println(mycode("Malaria"));
	}
	public static String helloworld() {
		return "Hello Devs";
	}
	
	public static char[] show() {
		for (char sss = 'a'; sss <= 'Z'; sss++) {
			System.out.print(sss);
		}
		return null;
		
	}
	
	private static String mycode(String diagonosis) {
		String patientname = "";
		 switch (diagonosis) {
			case "Malaria":
				patientname = "Mulago Hospital";
				break;
			case "Fluegh":
				patientname = "Nakaseke Referal Hospital";
				break;
			case "HIV":
				patientname = "Arua Referal Hospital";
				break;
			case "Typhoid":
				patientname = "Masaka Hospital";
				break;
			default:
				patientname= "Am not sure ";
				//throw new IllegalArgumentException("Unexpected value: " +patientname);
			
	}

		return patientname;


	}
}
