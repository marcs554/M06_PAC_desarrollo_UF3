package clase;

import java.io.Serializable;

public class Modulo implements Serializable {
	private long id;
	private String nombre;
	private String codigo;
	
	public Modulo() {
		super();
	}
	
	public Modulo(long id, String nombre, String codigo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public long getId() {return id;}
	
	public void setId(long id) {this.id = id;}
	
	public String getNombre() {return nombre;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getCodigo() {return codigo;}
	
	public void setCodigo(String codigo) {this.codigo = codigo;}
}
