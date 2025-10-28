package entidades;

public class EmpleadoContratado extends Empleado {
	protected double valorPorHora;
	
	// CREAR
	public EmpleadoContratado(String nombre,double valorPorHora) {
		super(nombre);
		
		if(valorPorHora <= 0){
			throw new IllegalArgumentException("Si valorPorDia es menor o igual 0");
		}
		
		
		this.valorPorHora = valorPorHora;
		
	}

	@Override
	public String toString() {
		return "EmpleadoContratado [valorPorHora=" + valorPorHora + "]";
	}
	
	
}
