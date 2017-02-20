package pkgLab1;

import java.util.Scanner;

public class cMain {

	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Years to Work:");
		double yearsToWork = scanner.nextDouble();
		
		System.out.println("Enter Interest Rate while working:");
		double intRateWhileWorking = scanner.nextDouble();
		
		System.out.println("Enter Years Retired:");
		double yearsRetired = scanner.nextDouble();
		
		System.out.println("Enter Interest Rate while retired:");
		double intRateWhileRetired = scanner.nextDouble();
		
		System.out.println("Required Income:");
		double RequiredIncome = scanner.nextDouble();
		
		System.out.println("Monthly SSI:");
		double MonthlySSI = scanner.nextDouble();
		
		double pv = Retirement.FindPV(intRateWhileRetired/12, yearsRetired*12, Math.abs(RequiredIncome-MonthlySSI) * -1, 0, false);
		
		double pmt = Retirement.FindPMT(intRateWhileWorking /12, yearsToWork*12, 0, pv, false);
		
		System.out.println(pmt);
		
		
		
		

	}

}
