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
				
			checkDate(number, checkIn, checkOut);
			
			
			System.out.println();
		}
		
		System.out.println("\nEnd of App!!!");
	}
	
	private static void checkDate(int number, Date checkIn, Date checkOut) {
		if (! checkOut.after(checkIn)) {
			System.out.println("\nError in reservation: Check-Out date must be after check-In date");
			
		} else {
			list.add(new Reservation(number, checkIn, checkOut));
			System.out.println("Reservation: " + list);
			
		}
	}
	
	private static int readInteger() {
		int value = scan.nextInt();   scan.nextLine();
		return value;
	}

}
