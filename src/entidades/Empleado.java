package entidades;

public abstract class Empleado {
	protected String nombre;
	protected int nroLegajo;
	protected String disponibilidad;
	protected int cantVecesRetraso;
	
	public Empleado(String nombre){
		
		// IREP
		if(nombre == null || nombre.isEmpty() ){
			throw new IllegalArgumentException("Si es null o esta vacio");
		}
		
		this.nombre = nombre;
		
		
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nroLegajo=" + nroLegajo + ", disponibilidad=" + disponibilidad
				+ ", cantVecesRetraso=" + cantVecesRetraso + "]";
	}
	
	
	
}
