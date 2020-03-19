package view;

import java.util.Scanner;

import control.Controller;

public class View {
	
	private Scanner sc = new Scanner(System.in);
	
	public void startAppli() {
		
		System.out.print("Veuillez saisir un nombre : ");
		double x = sc.nextDouble();
		System.out.print("operation (ADD ou SUBSTRACT) : ");
		String operation = sc.next();
		System.out.print("Veuillez saisir un autre nombre : ");
		double y = sc.nextDouble();
		
		Controller.checkOperation(x, y, operation);
	}
	
	public void showResult(double res) {
		System.out.println("Résultat : " + res);
	}
	
}
