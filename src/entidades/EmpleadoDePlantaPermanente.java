package entidades;

public class EmpleadoDePlantaPermanente extends Empleado {
	protected double valorPorDia;
	protected String categoria;
	
	//CREAR 
	public EmpleadoDePlantaPermanente(String nombre,String categoria,double valor) {
		super(nombre);
		
		if(!(categoria.equals("INICIAL")|| categoria.equals("EXPERTO") || categoria.equals("TECNICO")) ||
				categoria == null || categoria.isEmpty()){
			
			throw new IllegalArgumentException("Si esta vacio o es null y no es alguna categoria" ); 
		}
		
		if(valor <0){
			throw new IllegalArgumentException("Si es negativo" );
		}
		
		this.categoria= categoria;
		this.valorPorDia = valor;
		
		
		
	}

	@Override
	public String toString() {
		return "EmpleadoDePlantaPermanente [valorPorDia=" + valorPorDia + ", categoria=" + categoria + "]";
	}
	
	
	
	

}
