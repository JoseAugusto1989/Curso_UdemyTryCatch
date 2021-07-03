package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.Reservation;
import ModelExceptions.DomainExceptions;


public class StartApp {
	
	static Scanner scan = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws DomainExceptions {
		
		int number = 0;
		
		System.out.println("9999 - For Exit");
		while (number != 9999) {
			try {
				
				System.out.print("\nRoom number: ");
					number = readInteger();
				System.out.print("Check-in date (dd/mm/yyyy): ");
					Date checkIn = sdf.parse(scan.next());
				System.out.print("Check-out date (dd/mm/yyyy): ");
					Date checkOut = sdf.parse(scan.next());
					
				Reservation reserv = new Reservation(number, checkIn, checkOut);
				System.out.println("Reservation: " + reserv);
				
				System.out.println("\nEnter data to update the reservation:");
				System.out.print("\nCheck-in date (dd/MM/yyyy): ");
					checkIn = sdf.parse(scan.next());
				System.out.print("Check-out date (dd/MM/yyyy): ");
					checkOut = sdf.parse(scan.next());
				
				reserv.updateDates(checkIn, checkOut);
				System.out.println(reserv);
				
			}
			catch (ParseException e) {
				System.out.println("Invalid format date");
				
			}
			catch (DomainExceptions e) {
				System.out.println("Error in reservation: " + e.getMessage());
			}
			
			System.out.println("\nEnd of App!!!");
		}
	}
	
	private static int readInteger() {
		int value = scan.nextInt();   scan.nextLine();
		return value;
	}

}
