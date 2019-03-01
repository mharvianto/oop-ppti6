import java.util.Scanner;

public class TheMinAngleOfClock {

	static double getAngleMinute(int minute) {
		return minute * 6.0;
	}

	static double getAngleHour(int hour, int minute) {
		return (hour % 12) * 30.0 + minute * 0.5;
	}

	public static void main(String[] args) {
		int hour, minute;
		String time;
		Scanner in = new Scanner(System.in);
		time = in.nextLine();
		hour = Integer.valueOf(time.substring(0, 2));
		minute = Integer.parseInt(time.substring(3));
		double minAngle;
		double angleMinute = getAngleMinute(minute);
		double angleHour = getAngleHour(hour, minute);
		minAngle = Math.abs(angleHour - angleMinute);
		minAngle = Math.min(360 - minAngle, minAngle);
//		if (angleHour > angleMinute) {
//			if (angleHour - angleMinute < angleMinute + 360 - angleHour) {
//				minAngle = angleHour - angleMinute;
//			} else {
//				minAngle = angleMinute + 360 - angleHour;
//			}
//		} else {
//			if (angleMinute - angleHour < angleHour + 360 - angleMinute) {
//				minAngle = angleMinute - angleHour;
//			} else {
//				minAngle = angleHour + 360 - angleMinute;
//			}
//		}
		System.out.printf("%.1f\n", minAngle);
		in.close();
	}

}
