/*
 * Name: Dejanae Shirley
 * Description: Calculates the Surface Area of HardBread 1 and 2*/

public class Main {

	public static void main(String[] args) {
		
		double totalSurfaceArea;
		HardBread hardBread1 = new HardBread(5.50, 21.50, 5.30, true);
	    HardBread hardBread2 = new HardBread(6.4, 18.7, 4.7, true);
	    
	    totalSurfaceArea = hardBread1.getCalculateTotalSurfaceArea();

	    System.out.print("Hard Bread 1: ");
	    //formats Surface Area to 4 decimal places
	    System.out.printf('\n' + "Total Surface Area: " + "%.4f", totalSurfaceArea);
	    System.out.println('\n'+ hardBread1.toString());

	    totalSurfaceArea = hardBread2.getCalculateTotalSurfaceArea();
	    System.out.print("Hard Bread 2: ");
	    //formats Surface Area to 4 decimal places
	    System.out.printf('\n' + "Total Surface Area: " + "%.4f", totalSurfaceArea);
	    System.out.println('\n'+ hardBread2.toString());
	    
	    System.out.println("Program By: Dejanae Shirley");

	    }
	}
	


