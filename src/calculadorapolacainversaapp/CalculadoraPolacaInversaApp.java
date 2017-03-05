/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapolacainversaapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class CalculadoraPolacaInversaApp {

	public static void main(String[] args) {
		double numeroUno = 0;
		double numeroDos = 0;
		String operando;
		

		
		Scanner entradaUno = new Scanner(System.in);
		Scanner entradaDos = new Scanner(System.in);
		Scanner operandoEntrada = new Scanner(System.in);
		
		try {
			System.out.println("Dame un numero (A):");
			numeroUno = entradaUno.nextDouble();
			
			System.out.println("Dame un numero (B):");
			numeroDos = entradaDos.nextDouble();
			
			System.out.println("Ingresa un signo aritmético");
			operando = operandoEntrada.nextLine();
			
			if (operando != null) {

				switch (operando) {
				case "+":
					System.out.println("Suma");
					System.out.println("El valor de la suma es :"+ (numeroUno+numeroDos));
					break;
				case "-":
					System.out.println("Resta");
					System.out.println("El valor de la resta es :"+ (numeroUno-numeroDos));

					break;
				case "*":
					System.out.println("Multiplicacion");
					System.out.println("El valor de la multiplicacion es :"+ (numeroUno*numeroDos));

					break;
				case "/":
					System.out.println("Division");
					System.out.println("El valor de la division es :"+ (numeroUno/numeroDos));
					break;
				default:
					System.out.println("No ingresaste una operacion correcta");
					break;
				}
				
			}else{
				System.out.println("Ingresa un valor");
			}
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Verifica los datos que estas ingresando");
		}
		

	}

}
