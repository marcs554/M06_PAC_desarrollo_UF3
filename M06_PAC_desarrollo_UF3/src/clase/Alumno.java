package clase;

import java.io.Serializable;
import java.util.List;

public class Alumno implements Serializable {
	private long id;
	private String nombre;
	private String nacionalidad;
	private int edad;
	private char sexo;
	private List<Modulo> modulos;

	
	public Alumno() {
		super();
	}

	public Alumno(long id, String nombre, String nacionalidad, int edad, char sexo, List<Modulo> modulos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo;
		this.modulos = modulos;
	}

	public long getId() {return id;}
	
	public void setId(long id) {this.id = id;}
	
	public String getNombre() {return nombre;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getNacionalidad() {return nacionalidad;}
	
	public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}
	
	public int getEdad() {return edad;}
	
	public void setEdad(int edad) {this.edad = edad;}
	
	public char getSexo() {return sexo;}
	
	public void setSexo(char sexo) {this.sexo = sexo;}
	
	public List<Modulo> getModulos() {return modulos;}

	public void setModulos(List<Modulo> modulo) {this.modulos = modulo;}
	
}
