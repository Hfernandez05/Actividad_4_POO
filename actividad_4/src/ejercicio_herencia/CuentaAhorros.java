package ejercicio_herencia;

public class CuentaAhorros extends Cuenta {
	
	private boolean activa; /* atributo que identifica si una cuenta está activa; 
							   lo está si su saldo es superior a 10000 */

	public CuentaAhorros(float saldo, float tasa) { // constructor de la clase CuentaAhorros
		
		super(saldo, tasa); // Invoca al constructor de la clase padre
		if (saldo < 10000) // Si el saldo es menor a 10000, la cuenta no se activa
			activa = false;
		else
			activa = true;
	}

	public void retirar(float cantidad) { //metodo que recibe una cantidad a retirar de la cuenta
		
		if (activa)                  // Si la cuenta está activa, se puede retirar dinero
			super.retirar(cantidad); // Invoca al método retirar de la clase padre
	}

	public void consignar(float cantidad) { // metodo que recibe una cantidad a consignar a la cuenta
		
		if (activa)                    // Si la cuenta está activa, se puede consignar dinero
			super.consignar(cantidad); // Invoca al método consignar de la clase padre 
	}
	
	public void extractoMensual() {
		
		if (numeroRetiros > 4) {   // Si la cantidad de retiros es superior a cuatro, se genera una comisión mensual
	
			comisionMensual += (numeroRetiros - 4) * 1000;
		}
		super.extractoMensual(); // Invoca al método de la clase padre
		 
		if ( saldo < 10000 )   // condicional para evaluar el saldo actualizado de la cuenta, si es menor a 10000, la cuenta no se activa
		activa = false;
	}
		
	public void imprimir() {   // metodo para mostrar la informacion de la cuenta
		
		System.out.println("Saldo = $ " + saldo);
		System.out.println("Comisión mensual = $ " + comisionMensual);
		System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
		System.out.println();
	}
	
}
	

