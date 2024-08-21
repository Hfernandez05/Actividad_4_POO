package ejercicio_herencia;

public class Cuenta {
	
	protected float saldo;                    // atributo Saldo de la cuenta bancaria
	protected int numeroConsignaciones = 0;   // atributo número de consignaciones 
	protected int numeroRetiros = 0;          // atributo número de retiros
	protected float tasaAnual;                // atributo de la tasa anual de intereses
	protected float comisionMensual = 0;      // atributo de la comisión mensual 
	
	
	public Cuenta(float saldo, float tasaAnual) {  // constructor de la clase Cuenta
		
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public void consignar(float cantidad) {   // metodo para consginar dinero a la cuenta
	
		saldo = saldo + cantidad; 
		numeroConsignaciones = numeroConsignaciones + 1;	
	}
	
	public void retirar(float cantidad) {   // metodo para retirar dinero
		
		float nuevoSaldo = saldo - cantidad; 
		
		if (nuevoSaldo >= 0) {   // condicional para evaluar que la cantidad que se desea retirar no sea mayor que el saldo
		
			saldo -= cantidad;
			numeroRetiros = numeroRetiros + 1;		
		} else {
			
			System.out.println("La cantida a retirar excede el saldo actual.");	
		}
	
	}
	
	public void calcularInterés() {	
			
			float tasaMensual = tasaAnual / 12; // Convierte la tasa anual en mensual 
			
			float interesMensual = saldo * tasaMensual;
			saldo += interesMensual; // Actualiza el saldo aplicando el interés mensual 
	}
		
	public void extractoMensual() {
			
			saldo -= comisionMensual;
			calcularInterés();
	}
		
}
	
