package Class01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartApp {  
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		var texto = "";
		var number = 567.90;
		
		method1();
		
		System.out.println("End of Program!!!");
		
		scan.close();
	}
	
	public static void method1() {
		
		System.out.println("-----METHOD1 START-----");
		method2();
		System.out.println("-----METHOD1 END-----");
		
	}
	
	public static void method2() {
		
		System.out.println("-----METHOD2 START-----");
		try {
			System.out.println("Digite varios nomes com um espaço: ");
				String vec[] = scan.nextLine().split(" ");
			
			System.out.print("Digite a posição do nome que deseja imprimir: ");
				int position = scan.nextInt();   scan.nextLine();
			
			System.out.println(vec[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position " + e.getMessage());
			/*
			 * Rastreio do Exception
			 */
			e.printStackTrace();
			scan.next();
			
		}
		catch (InputMismatchException e) {
			System.out.println("Input Error " + e.getMessage());
			/*
			 * Rastreio do Exception
			 */
			e.printStackTrace();
			scan.next();
			
		}  
		
		System.out.println("-----METHOD2 END-----");
	}

}
