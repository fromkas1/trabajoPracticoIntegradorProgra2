package entidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HomeSolution {
	HashMap<Integer,Empleado>empleados = new HashMap<>();
	
	
	// Crear Empleado Contratado
	public void registrarEmpleado(String nombre, double valor) {
		
		EmpleadoContratado empleadoContratado = new EmpleadoContratado(nombre,valor);
		
		empleados.put(empleadoContratado.nroLegajo, empleadoContratado);
		
		for(Entry<Integer, Empleado> entry: empleados.entrySet()){
			
			System.out.println("Legajo:"+empleadoContratado.nroLegajo+" "+"//"+
								"Nombre:"+empleadoContratado.nombre+" "+"//"+
								"valor por hora:"+empleadoContratado.valorPorHora+" "+"//");
			
		}
	}
	
	// Crear Empleado Planta Permanente
	public void registrarEmpleado(String nombre, double valor, String categoria) {
		
		EmpleadoDePlantaPermanente empleadoDePlantaPermanente = new EmpleadoDePlantaPermanente(nombre, categoria,valor);
		
		empleados.put(empleadoDePlantaPermanente.nroLegajo, empleadoDePlantaPermanente);
		
		for(Entry<Integer,Empleado> entry : empleados.entrySet()){
			
			System.out.println("Legajo:"+empleadoDePlantaPermanente.nroLegajo+" "+"//"+
					"Nombre:"+empleadoDePlantaPermanente.nombre+" "+"//"+
					"valor por dia:"+empleadoDePlantaPermanente.valorPorDia+" "+"//"+
					"categoria:"+empleadoDePlantaPermanente.categoria+" "+"//");
					
		}
		
	}
	
	

	  public void registrarProyecto(String[] titulos, String[] descripcion, double[] dias,
              String domicilio, String[] cliente, String inicio, String fin){
		  

		
	}

	

}
