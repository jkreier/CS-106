import static java.lang.Math.sin;



public class TestClass {

	public static void main(String[] args) {
		double trueCourse = 70;
		String windSpeed = "30";
		String windDirection ="120";
		double WS = Double.parseDouble(windSpeed);
		double WD = Double.parseDouble(windDirection);
		double X = Math.toRadians(WD-trueCourse);
		double Z= (Math.sin(X));
		double M = WS*Z;
		double D = M/98;
		double WCA = Math.asin(D);
		WCA = Math.toDegrees(WCA);
		System.out.println(WCA);
		
		
		
		
	


		

	}

}
