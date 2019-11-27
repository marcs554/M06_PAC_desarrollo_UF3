package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import clase.Alumno;
import clase.Modulo;
import clase.Profesor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.hibernate.Session;

public class hibernate {

	private Configuration cfg = new Configuration().configure();
	
	public void sesion() {
		ArrayList<Modulo> aux = new ArrayList<Modulo>();
		SessionFactory sf = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session sesion = sf.openSession();
		Transaction transacion = sesion.beginTransaction(); 
		{
			Modulo modulo = new Modulo();
			modulo.setNombre("Interfaces");
			modulo.setCodigo(9);
			sesion.save(modulo);
			aux.add(modulo);
			try {
				this.backup("bak_modulo", modulo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			Profesor profesor = new Profesor();
			profesor.setNombre("Manolo");
			profesor.setSexo('M');
			sesion.save(profesor);
			try {
				this.backup("bak_profesor", profesor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Alumno alumno = new Alumno();
			alumno.setNombre("Marta");
			alumno.setNacionalidad("Española");
			alumno.setEdad(25);
			alumno.setSexo('F');
			alumno.setModulos(aux);
			sesion.save(alumno);
			try {
				this.backup("bak_Alumno", alumno);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		transacion.commit();
		sesion.close();
		sf.close();
	}
	
	public<O> void backup(String fileName, O objeto) throws IOException {
		FileOutputStream bin = new FileOutputStream(fileName,true);
		ObjectOutputStream obj = new ObjectOutputStream(bin);
		
		obj.writeObject(objeto);
		obj.flush();
		
		obj.close();
		bin.close();
	}
	
}