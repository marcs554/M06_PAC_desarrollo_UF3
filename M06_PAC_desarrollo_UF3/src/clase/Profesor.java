package clase;

import java.io.Serializable;

public class Profesor implements Serializable {
	private long id;
	private String nombre;
	private char sexo;
	
	public Profesor() {
		super();
	}

	public Profesor(long id, String nombre, char sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public long getId() {return id;}

	public void setId(long id) {this.id = id;}

	public String getNombre() {return nombre;}

	public void setNombre(String nombre) {this.nombre = nombre;}

	public char getSexo() {return sexo;}

	public void setSexo(char sexo) {this.sexo = sexo;}
}
