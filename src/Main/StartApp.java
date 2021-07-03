package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.Reservation;


public class StartApp {
	
	static Scanner scan = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static List<Reservation> list = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		int number = 0;
		
		System.out.println("9999 - For Exit");
		
		while (number != 9999) {
			System.out.print("\nRoom number: ");
				number = readInteger();
			System.out.print("Check-in date (dd/mm/yyyy): ");
				Date checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
				Date checkOut = sdf.parse(scan.next());
				
			Reservation reserv = new Reservation(number, checkIn, checkOut);
			
			String error = reserv.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			
			} else {
				System.out.println("Reservation: " + reserv);
				
			}
		}
		
		System.out.println("\nEnd of App!!!");
	}
	
	private static int readInteger() {
		int value = scan.nextInt();   scan.nextLine();
		return value;
	}

}
