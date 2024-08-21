package ejercicio_herencia;
import java.util.*;
public class PruebaCuenta {  /* Clase con el metodo main que crea una cuenta de ahorros con un saldo inicial y 
 							 una tasa de interés solicitados por teclado, a la cual se realiza una consignación 
 							 y un retiro, y luego se le genera el extracto mensual */
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);   
		System.out.println("Cuenta de ahorros");
		System.out.println("Ingrese saldo inicial= $");
		float saldoInicialAhorros = input.nextFloat();  //se pide el saldo inicial
		
		System.out.print("Ingrese tasa de interés= ");
		float tasaAhorros = input.nextFloat();			//se pide la tasa 
		
		CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros); //se crea la cuenta de ahorros
		
		System.out.print("Ingresar cantidad a consignar: $"); 
		float cantidadDepositar = input.nextFloat();  //se pide la cantidad a consignar
		cuenta1.consignar(cantidadDepositar);		  //se consigna con el metodo consignar heredado de la clase padre
		
		System.out.print("Ingresar cantidad a retirar: $");
		float cantidadRetirar = input.nextFloat();		//se pide la cantidad a retirar 
		cuenta1.retirar(cantidadRetirar);		// se procede a retirar con el metodo retirar heredado de la clase padre
		
		cuenta1.extractoMensual();		//se imprime el extracto mensual
		cuenta1.imprimir();		//se imprime la informacion de la cuenta
		}
	

}
