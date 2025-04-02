package Ejer3;

public class Profesor {

	private String nombre;
	private String apellido;
	private String comision;
	private String catedra;
	private String facultad;
	
	
	
	public Profesor(String nombre, String apellido, String comision, String catedra, String facultad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.comision = comision;
		this.catedra = catedra;
		this.facultad = facultad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getComision() {
		return comision;
	}



	public void setComision(String comision) {
		this.comision = comision;
	}



	public String getCatedra() {
		return catedra;
	}



	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}



	public String getFacultad() {
		return facultad;
	}



	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}



	
	public String tusDatos() {
		return "Profesor Nombre =" + getNombre() + "\n Apellido =" + getApellido() + "\n Comision ="
				+ getComision() + "\n Catedra =" + getCatedra() + "\n Facultad =" + getFacultad();
	}

	




}
