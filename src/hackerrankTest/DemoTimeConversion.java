package hackerrankTest;

public class DemoTimeConversion {

	public static void main(String[] args) {
		
		String str  = "12:05:45PM";
		int time = 0;
		if(str.contains("PM")) {
			time = Integer.parseInt((str).split(":")[0]);
			time = time+12;
		}
		System.out.println(time);

	}

}
