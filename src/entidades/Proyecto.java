package entidades;

import java.time.LocalDate;
import java.util.HashMap;

public class Proyecto {
	private int nroId;
	private Cliente cliente;
	private String domicilio;
	private HashMap<Integer,Tarea>tareas;
	private LocalDate fechaEstimadaFin;
	private LocalDate fechaRealFinalizacion;
	private LocalDate fechaInicio;
	private String estado;
	private double costoFinal;
	
	public Proyecto(){
		
	}
}
