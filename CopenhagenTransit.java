package homework4_1;
import java.util.Scanner;

public class CopenhagenTransit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		double fare;
		
		System.out.println("Enter zone number :");
		int zoneNumber = scanner.nextInt();
		
		System.out.println("Enter adult or child :");
		String adultOrChild = scanner.next();
		
		
		if(zoneNumber <= 2 && adultOrChild.equals("adult")) {
			fare = 23.0;
			}
		else if(zoneNumber <= 2 && adultOrChild.equals("child")) {
			fare = 11.5;
			}
		else if(zoneNumber == 3 && adultOrChild.equals("adult")) {
	        fare = 34.5;
	        }
		else if((zoneNumber == 3 || zoneNumber == 4)&& adultOrChild.equals("child")) {
			fare = 23.0;
			}
		else if(zoneNumber == 4 && adultOrChild.equals("adult")) {
			fare = 46.0;
			}
		else {
			fare = - 1.00;
			}
		
		System.out.printf("The fare for %s to zone number %d is %.1f.%n" , adultOrChild, zoneNumber , fare);
		
			scanner.close();

	   }
	}
